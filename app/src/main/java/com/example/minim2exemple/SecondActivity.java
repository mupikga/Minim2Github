package com.example.minim2exemple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.minim2exemple.API.API;
import com.example.minim2exemple.API.Users;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        init();
    }

    public void init() {

        SharedPreferences sharedPref = getSharedPreferences("username", Context.MODE_PRIVATE);
        String username = sharedPref.getString("User", null);

        TextView followers = (TextView) findViewById(R.id.followers);
        TextView repos = (TextView) findViewById(R.id.repositories);
        TextView userTV = (TextView) findViewById(R.id.userName);

        ImageView avatar = (ImageView) findViewById(R.id.avatar);

        Gson gson = new GsonBuilder().setLenient().create();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(API.BASE_URL).addConverterFactory(GsonConverterFactory.create(gson)).build();
        API gerritAPI = retrofit.create(API.class);
        Call<Users> call = gerritAPI.getInfo(username);

        call.enqueue(new Callback<Users>() {
            @Override
            public void onResponse(Call<Users> call, Response<Users> response) {
                Users user = response.body();
                String f = "Followers: " + user.getFollowers();
                String r = "Repositories: " + user.getRepos();
                userTV.setText(username);
                followers.setText(f);
                repos.setText(r);
                Picasso.get().load(user.getAvatar()).into(avatar);

            }

            @Override
            public void onFailure(Call<Users> call, Throwable t) {
                Intent intent = new Intent(getApplicationContext(), Error.class);
                startActivity(intent);
            }
        });
    }
        public void init2(){

            Log.i("USer", "username1");

            SharedPreferences sharedPref = getSharedPreferences("username", Context.MODE_PRIVATE);
            String username = sharedPref.getString("User",null);

            Log.i("USer", "username2");

        /*Gson gson = new GsonBuilder().setLenient().create();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(API.BASE_URL).addConverterFactory(GsonConverterFactory.create(gson)).build();
        API gerritAPI = retrofit.create(API.class);
        Call<List<Users>> call = gerritAPI.getFollowers(username);

        call.enqueue(new Callback<List<Users>>() {

            @Override
            public void onResponse(Call<List<Users>> call, Response<List<Users>> response) {
                List<Users> userList =  response.body();
                ListAdapter listAdapter =new ListAdapter(userList, SecondActivity.this);
                RecyclerView recyclerView = findViewById(R.id.ListRecyclerView);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(SecondActivity.this));
                recyclerView.setAdapter(listAdapter);
            }

            @Override
            public void onFailure(Call<List<Users>> call, Throwable t) {

                Intent intent = new Intent (getApplicationContext(), Error.class);
                startActivity(intent);
            }

        });*/
            Log.i("USer", "username3");

            TextView followers = (TextView) findViewById(R.id.followers);
            TextView repos = (TextView) findViewById(R.id.repositories);

            Gson gson = new GsonBuilder().setLenient().create();
            Retrofit retrofit = new Retrofit.Builder().baseUrl(API.BASE_URL).addConverterFactory(GsonConverterFactory.create(gson)).build();
            API gerritAPI = retrofit.create(API.class);
            Call<Users> call = gerritAPI.getInfo(username);
            Log.i("USer", username);

            call.enqueue(new Callback<Users>() {
                @Override
                public void onResponse(Call<Users> call, Response<Users> response) {
                    Users user =  response.body();
                    followers.setText("Followers: " + user.getFollowers());
                    repos.setText("Repositories: " + user.getRepos());
                }

                @Override
                public void onFailure(Call<Users> call, Throwable t) {
                    Intent intent = new Intent (getApplicationContext(), Error.class);
                    startActivity(intent);
                }
            });

    }}



