package com.starkindustries.multiplescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String key="com.starkindustries.multiplescreen.order";
    public void placeorder(View view)
    {
        TextView txt1 = findViewById(R.id.textview1);
        TextView txt2 = findViewById(R.id.textview2);
        TextView txt3 = findViewById(R.id.textview3);
        String message1 = "Placing order for "+txt1.getText().toString()+" , "+txt2.getText().toString()+" & "+txt3.getText().toString();
        TextView txt4=findViewById(R.id.textview4);
        txt4.setText(message1);
        String message2="Order Placed Sucessfully";
        TextView txt5 = findViewById(R.id.textview5);
        txt5.setText(message2);
        Intent intent = new Intent(this,secondactivity.class);
        intent.putExtra(key,message1);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}