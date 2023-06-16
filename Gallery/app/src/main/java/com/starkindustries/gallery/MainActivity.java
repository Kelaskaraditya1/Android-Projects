package com.starkindustries.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
   static int count=1;
public void nextimage(View view)
{
        switch(count)
    {
        case 1:
            ImageView img0=findViewById(R.id.image1);
            img0.setImageResource(R.drawable.ironman1);
            TextView txt1 = findViewById(R.id.text1);
            txt1.setText("");
            count++;

            break;
        case 2:
            ImageView img1=findViewById(R.id.image1);
            img1.setImageResource(R.drawable.patrik);
            TextView txt2 = findViewById(R.id.text1);
            txt2.setText("");
            count++;
            break;
        case 3:
            ImageView img2=findViewById(R.id.image1);
            img2.setImageResource(R.drawable.chotaadi);
            TextView txt3 = findViewById(R.id.text1);
            txt3.setText("");
            count++;
            break;
        case 4:
            ImageView img=findViewById(R.id.image1);
            img.setImageResource(R.drawable.aditya);
            count++;
            TextView txt4 = findViewById(R.id.text1);
            txt4.setText("You are viewing the last Image");
            break;
    }
    }
    static int count2=3;
    public void previousimage(View view)
    {
        switch(count2)
        {
            case 3:
                ImageView img3 =findViewById(R.id.image1);
                img3.setImageResource(R.drawable.chotaadi);
                count--;
                TextView txt3 = findViewById(R.id.text1);
                txt3.setText("");

                break;
            case 2:
                ImageView img2 =findViewById(R.id.image1);
                img2.setImageResource(R.drawable.patrik);
                count--;
                TextView txt2 = findViewById(R.id.text1);
                txt2.setText("");

                break;
            case 1:
                ImageView img1 =findViewById(R.id.image1);
                img1.setImageResource(R.drawable.ironman1);
                count--;
                TextView txt1 = findViewById(R.id.text1);
                txt1.setText("");

                break;
            case 0:
                ImageView img0 =findViewById(R.id.image1);
                img0.setImageResource(R.drawable.maharaj);
                count--;
                TextView txt=findViewById(R.id.text1);
                txt.setText("You are Viewing the 1st Image");
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}