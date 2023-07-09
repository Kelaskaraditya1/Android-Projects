package com.starkindustries.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button translate,rotate,scale,alpha;
    ImageView target;
    public void init()
    {
        translate=findViewById(R.id.translate);
        rotate=findViewById(R.id.rotation);
        scale=findViewById(R.id.scale);
        alpha=findViewById(R.id.alpha);
        target=findViewById(R.id.image);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation translate = AnimationUtils.loadAnimation(MainActivity.this,R.anim.translate);
                target.startAnimation(translate);
            }
        });
        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotate = AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                target.startAnimation(rotate);

            }
        });
        scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation scaling = AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale);
                target.startAnimation(scaling);
            }
        });
        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation alphaing = AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha);
                target.startAnimation(alphaing);
            }
        });
    }
}