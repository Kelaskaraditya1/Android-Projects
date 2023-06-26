package com.starkindustries.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText weight=findViewById(R.id.weightkg);
        EditText heightft=findViewById(R.id.heightft);
        EditText heightin=findViewById(R.id.heightinch);
        Button enter = findViewById(R.id.enter);
        TextView result=findViewById(R.id.result);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int weightkg=Integer.parseInt(weight.getText().toString());
                int feet=Integer.parseInt(heightft.getText().toString());
                int inch=Integer.parseInt(heightin.getText().toString());
                int totalin=feet*12+inch;
                double tootalcm=totalin*2.53;
                double totalm=tootalcm/100;
                double bmi=weightkg/Math.pow(totalm,2);
                if(bmi>25)
                result.setText("You are OverWeight");
                else if(bmi<18)
                    result.setText("You are UnderWeight");
                else if((bmi>18)&&(bmi<25))
                    result.setText("You Weight is appropriate");
            }
        });

    }
}