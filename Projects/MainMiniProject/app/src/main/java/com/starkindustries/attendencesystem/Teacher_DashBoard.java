package com.starkindustries.attendencesystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class Teacher_DashBoard extends AppCompatActivity {
    public static final int RESULT_CODE=22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_dash_board);
        AppCompatButton open_camera = findViewById(R.id.open_camera);
        open_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(camera_intent,RESULT_CODE);
            }
        });
    }
}