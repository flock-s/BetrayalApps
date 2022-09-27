package com.example.apps.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.apps.API.APIConnection;
import com.example.apps.Model.DataUser;
import com.example.apps.R;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginImage extends AppCompatActivity {
    public static String phrase = "";
    public static String picture = "";
    public static String Constant = "http://192.168.42.22:8181";
    APIConnection apiConnection;
    ImageView ivPicture;
    TextView tvPhrase;
    EditText etPassword;
    Button btnLoginPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_image);
        FindViewById();
        tvPhrase.setText(phrase);
        Glide.with(getApplicationContext()).load(Constant + picture).into(ivPicture);
        btnLoginPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login(phrase,etPassword.getText().toString());
            }
        });

    }

    public void FindViewById(){
        ivPicture = findViewById(R.id.ivImage);
        tvPhrase = findViewById(R.id.tvPhrase);
        etPassword = findViewById(R.id.etPassword);
        btnLoginPassword = findViewById(R.id.btnLoginPassword);
    }

    public void Login(String phrase, String password){
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constant)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
        apiConnection = retrofit.create(APIConnection.class);
        Call<DataUser> login = apiConnection.pictureLogin(phrase,password);
        login.enqueue(new Callback<DataUser>() {
            @Override
            public void onResponse(Call<DataUser> call, Response<DataUser> response) {
                startActivity(new Intent(LoginImage.this, AllAccount.class));
                Toast.makeText(getApplicationContext(), "Success !", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<DataUser> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
