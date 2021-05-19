package com.example.homework1;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public  class ViewHolder extends RecyclerView.ViewHolder {

    TextView ListItemMACView;
    TextView ListItemSignalView;
    Button ListItemDetail;
    int position;
    TextView ListItemNumberView;
    //定義三個 兩個text 一個 btn

    public  ViewHolder(View itemview){

        super(itemview);

        ListItemMACView = (TextView) itemview.findViewById(R.id.text_mac);
        ListItemSignalView=(TextView)itemview.findViewById(R.id.text_signal);
        ListItemDetail=(Button)itemview.findViewById(R.id.button_detail);
        //綁定三個元件

    }

    public void bind(int listIndex){

//        ListItemMACView.setText(mac);
//        ListItemSignalView.setText(signal);
        ListItemNumberView.setText(String.valueOf(listIndex));
    }

}
