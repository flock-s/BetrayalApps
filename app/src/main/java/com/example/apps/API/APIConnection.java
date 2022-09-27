package com.example.apps.API;

import android.provider.ContactsContract;

import com.example.apps.Model.DataUser;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIConnection {

    @POST("/m2uapi/picturelogin")
    Call<DataUser> pictureLogin(@Query("username") String username);

    @POST("/m2uapi/login")
    Call<DataUser> pictureLogin(@Query("phrase")String phrase,@Query("password") String password);
}
