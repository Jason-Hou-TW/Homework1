package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//連結layout


//            FragmentManager fragmentManager = getSupportFragmentManager();
//            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//            Fragment_detail fg = new Fragment_detail();
//            Fragment_show fr = new Fragment_show();
//            fragmentTransaction.replace(R.id.fragment_show, new Fragment_detail());
//            //fragmentTransaction.remove(fg);
//            fragmentTransaction.commit();
            //startActivityFromFragment(intent);

//        Button btn = findViewById(R.id.button_switch);
//        btn.setOnClickListener(new Button.OnClickListener(){@Override
//        public void onClick( View v){
//
////            Intent intent=new Intent(MainActivity.this, Fragment_detail.class);//前面是this 後面指到class
////
////            startActivity(intent);
//
//            FragmentManager fragmentManager = getFragmentManager();
//            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//            Fragment_detail fg = new Fragment_detail();
//            fragmentTransaction.replace(R.id.fragment_show,fg);
//            fragmentTransaction.commit();
//            //startActivityFromFragment(intent);
//
//        }});
    }


}
//public class Fragment_detail extends Fragment {
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_detail, container, false);
//    }
//}
//public class Fragment_show extends Fragment  {
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_show, container, false);
//    }
//}
