package com.example.yuvaraj.myapplication;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuvaraj on 2/10/15.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    public List<Feed> items;
    public Feed f;

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        public ImageView icon;
        public TextView title;

        public ViewHolder(View v)
        {
            super(v);
            icon = (ImageView)v.findViewById(R.id.imageView);
            title = (TextView)v.findViewById(R.id.textView);


        }

    }


    public MyAdapter(List<Feed> items)
    {
        this.items=items;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        ViewHolder vh = new ViewHolder(v);
        Log.d("check","Oncreate View is created");

        return vh;


    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.icon.setImageResource(items.get(position).getImage());
        holder.title.setText(items.get(position).getTitle());
        Log.d("check","onBindView is called");


    }



    @Override
    public int getItemCount() {
        return items.size();
    }
}
