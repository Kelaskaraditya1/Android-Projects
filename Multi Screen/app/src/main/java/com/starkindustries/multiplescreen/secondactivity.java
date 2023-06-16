package com.starkindustries.multiplescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.key);
        TextView txt6 = findViewById(R.id.text6);
        txt6.setText(message);
        TextView txt7 = findViewById(R.id.textview7);
        txt7.setText("Your order is placed Sucessfully");
        setSupportActionBar();
    }
    
}