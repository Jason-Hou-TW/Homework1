package com.example.homework1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment_detail extends Fragment {

//    public Fragment_detail Fragment_detail(){
//
//        return this;
//
//    }



        @Override
        public void onCreate(Bundle savedInstanceState)
        {
            // Fragment建立時執行
            super.onCreate(savedInstanceState);


        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Fragment即將在螢幕上顯示時執行此方法




        View v =inflater.inflate(R.layout.fragment_detail, container, false);
        return v;
        //Button button = v.findViewById(R.id.search);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        // 在這個方法中取得並定義Fragment的介面元件
        super.onActivityCreated(savedInstanceState);

        TextView tv = getView().findViewById(R.id.text_detail);
        Fragment_showArgs args = Fragment_showArgs.fromBundle(getArguments());
        String detail = args.getMessage();
        tv.setText(detail);

        //mTxtR = (TextView) getView().findViewById(R.id.txtR);
        //...
    }

    @Override
    public void onPause()
    {
        // 當Fragment要從螢幕消失時執行此方法
        super.onPause();
    }

}
