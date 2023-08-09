package com.starkindustries.attendencesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class TeacherInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_info);
        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inext = new Intent(getApplicationContext(),TeacherProfile.class);
                TextInputEditText name = findViewById(R.id.name);
                TextInputEditText phone_no = findViewById(R.id.phone_no);
                TextInputEditText username = findViewById(R.id.username);
                inext.putExtra("name",name.getText().toString());
                inext.putExtra("phone_no",phone_no.getText().toString());
                inext.putExtra("username",username.getText().toString());
                startActivity(inext);
            }
        });
    }
}