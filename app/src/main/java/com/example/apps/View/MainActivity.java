package com.example.apps.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.apps.API.APIConnection;
import com.example.apps.Model.DataUser;
import com.example.apps.R;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    EditText etUsername;
    Button btnLogin;
    APIConnection apiConnection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FindViewById();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login(etUsername.getText().toString());

            }
        });
    }

    public void FindViewById(){
        etUsername =findViewById(R.id.etUsername);
        btnLogin = findViewById(R.id.btnLoginUsername);
    }

    public void Login(String username){
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(LoginImage.Constant)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
        apiConnection = retrofit.create(APIConnection.class);
        Call<DataUser> Login = apiConnection.pictureLogin(username);
        Login.enqueue(new Callback<DataUser>() {
            @Override
            public void onResponse(Call<DataUser> call, Response<DataUser> response) {
                LoginImage.phrase = response.body().getUserList().getPhrase();
                LoginImage.picture = response.body().getUserList().getPicture();
                startActivity(new Intent(getApplicationContext(),LoginImage.class));
                String a = "\uD83D\uDD71";
            }

            @Override
            public void onFailure(Call<DataUser> call, Throwable t) {

                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
