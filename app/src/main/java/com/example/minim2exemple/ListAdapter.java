//package com.example.minim2exemple;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.minim2exemple.API.Users;
import com.squareup.picasso.Picasso;

import java.util.List;

//public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{
/*
    private List<Users> dades;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<Users> userList, Context context) {
        this.dades = userList;
        this.mInflater = LayoutInflater.from((Context) context);
        this.context = (Context) context;
    }

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = mInflater.inflate(R.layout.activity_user_list, null);
        return new ListAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {
        holder.bindData(dades.get(position));
    }

    @Override
    public int getItemCount() {
        return dades.size();
    }

    public void setItems(List<Users> items){
        dades=items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView username;

        ViewHolder(View itemView){
            super(itemView);
            image=itemView.findViewById(R.id.image);
            username=itemView.findViewById(R.id.username);
        }

        void bindData(final Users user){
            username.setText(user.getUsername());
            Picasso.get().load(user.getAvatar()).into(image);
        }


    }*/
//}
