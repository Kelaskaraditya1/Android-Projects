package com.starkindustries.attendencesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class StudentProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_profile);
        Intent iprev = getIntent();
        TextView username = findViewById(R.id.logo_username);
        TextInputEditText name = findViewById(R.id.name);
        TextInputEditText phone_no = findViewById(R.id.phone_no);
        TextInputEditText department = findViewById(R.id.department);
        TextInputEditText year = findViewById(R.id.year);
        TextInputEditText div = findViewById(R.id.div);
        TextInputEditText student_id=findViewById(R.id.student_id);
        TextInputEditText roll_no = findViewById(R.id.roll_no);
        TextInputEditText parents_no=findViewById(R.id.parents_phone_no);
        TextView logo_name = findViewById(R.id.logo_name);
        name.setText(iprev.getStringExtra("name"));
//        div.setText(iprev.getStringExtra("division"));
        phone_no.setText(iprev.getStringExtra("phone_no"));
        username.setText(iprev.getStringExtra("username"));
        logo_name.setText(iprev.getStringExtra("name"));
        student_id.setText(iprev.getStringExtra("student_id"));
//        Log.d("department",iprev.getStringExtra("department"));
        department.setText(iprev.getStringExtra("department"));
//        Toast.makeText(this, iprev.getStringExtra("department"), Toast.LENGTH_SHORT).show();
        parents_no.setText(iprev.getStringExtra("parents_phone_no"));
//        year.setText(iprev.getStringExtra("year"));
//        roll_no.setText(iprev.getStringExtra("ro"));
    }
}