package com.starkindustries.attendencesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import android.view.ActionMode;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = findViewById(R.id.logo);
        TextView txt1= findViewById(R.id.name);
        Animation animate1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scaling);
        img.startAnimation(animate1);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences pref = getSharedPreferences("login",MODE_PRIVATE);
                Boolean flag = pref.getBoolean("flag",false);
                //1 st Time Login
                if(flag)
                {
                    Intent inext = new Intent(getApplicationContext(), DashBoard.class);
                    startActivity(inext);
                    Log.d("login","1st Time Login");
                }
                else
                {
                    Intent inext = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(inext);
                    Log.d("MainScreen","Already Login go to Main Screen");
                }
                finish();
            }
        },3000);


    }
}