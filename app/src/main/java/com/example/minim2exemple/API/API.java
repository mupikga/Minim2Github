package com.example.minim2exemple.API;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface API {
    public static final String BASE_URL = "https://api.github.com/";

    //followers
    @GET("users/{username}/followers")
    Call<List<Users>> getFollowers(@Path("username") String name);

    //User
    @GET("users/{username}")
    Call<Users> getInfo(@Path("username") String name);

}
