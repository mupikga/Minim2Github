package com.example.minim2exemple.API;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Users implements Serializable {

    @SerializedName("followers")
    @Expose
    private int followers;

    @SerializedName("public_repos")
    @Expose
    private int repositories;

    @SerializedName("avatar_url")
    @Expose
    private String avatar;

    @SerializedName("login")
    @Expose
    private String username;

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getRepos() {
        return repositories;
    }

    public void setRepos(int following) {
        this.repositories = following;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
