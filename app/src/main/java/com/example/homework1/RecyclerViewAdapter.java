package com.example.homework1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder>{

    private String save_mac;
    private String save_signal;
    private int  mNumberItems;

    public RecyclerViewAdapter(String mac,String signal){
        save_mac = mac;
        save_signal = signal;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        Context context = viewGroup.getContext();
        //建立連結物件
        int LayoutIDforlistitem = R.layout.row_item;
        //紀錄item id
        LayoutInflater inflater = LayoutInflater.from(context);
        //新群組
        boolean shouldattachimmediately =false;//不知道幹嘛用的

        View view = inflater.inflate(LayoutIDforlistitem,viewGroup,shouldattachimmediately);
        //
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    //@Override
    public void onBindViewHolder(ViewHolder holder,int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mNumberItems;
    }
}
