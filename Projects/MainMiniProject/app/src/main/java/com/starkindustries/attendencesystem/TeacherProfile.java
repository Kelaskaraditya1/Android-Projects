package com.starkindustries.attendencesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class TeacherProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_profile);
        Intent iprev = getIntent();
        TextView name = findViewById(R.id.logo_name);
        TextView user_name = findViewById(R.id.logo_username);
        TextInputEditText name2 = findViewById(R.id.name);
        TextInputEditText phone_no = findViewById(R.id.phone_no);
        name.setText(iprev.getStringExtra("name"));
        user_name.setText(iprev.getStringExtra("username"));
        name2.setText(iprev.getStringExtra("name"));
        phone_no.setText(iprev.getStringExtra("phone_no"));




    }
}