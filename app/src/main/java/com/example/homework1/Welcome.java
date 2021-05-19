package com.example.homework1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.Navigation;

public class Welcome extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        Button btn = findViewById(R.id.button_enter);
        btn.setOnClickListener(new Button.OnClickListener(){@Override
        public void onClick( View v){




           Intent intent=new Intent(Welcome.this,MainActivity.class);//前面是this 後面指到class
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);//刷掉前面的Activity
            //Navigation.findNavController(v).navigate(R.id.Fragment_show);
            startActivity(intent);

            //startActivityFromFragment(intent);

        }});



    }




}
