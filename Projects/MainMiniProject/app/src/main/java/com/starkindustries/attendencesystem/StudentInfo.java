package com.starkindustries.attendencesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class StudentInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);
        ArrayList<String> department = new ArrayList<String>();
        department.add("Computer");
        department.add("IT");
        department.add("Electronics");
        department.add("Civil");
        department.add("Mechanical");
        department.add("AI&DS");
        department.add("Chemical");
        department.add("Humanities");
        Spinner department_spinner= findViewById(R.id.department);
        ArrayAdapter<String> department_adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,department);
        department_spinner.setAdapter(department_adapter);
        ArrayList<String> year = new ArrayList<String>();
        year.add("FE");
        year.add("SE");
        year.add("TE");
        year.add("BE");
        Spinner year_spinner = findViewById(R.id.year);
        ArrayAdapter<String> year_adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,year);
        year_spinner.setAdapter(year_adapter);
        ArrayList<String> div = new ArrayList<String>();
        div.add("A");
        div.add("B");
        Spinner div_spinner = findViewById(R.id.div);
        ArrayAdapter<String> div_adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,div);
        div_spinner.setAdapter(div_adapter);
        Button sumbit = findViewById(R.id.submit);
        sumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inext = new Intent(getApplicationContext(),StudentProfile.class);
                TextInputEditText name = findViewById(R.id.name);
                TextInputEditText phone_no=findViewById(R.id.phone_no);
                TextInputEditText username = findViewById(R.id.username);
                TextInputEditText studentid = findViewById(R.id.studentid);
                TextInputEditText parents_phone=findViewById(R.id.parents_no);
                inext.putExtra("name",name.getText().toString());
                inext.putExtra("phone_no",phone_no.getText().toString());
                inext.putExtra("username",username.getText().toString());
                inext.putExtra("student_id",studentid.getText().toString());
                inext.putExtra("parents_phone_no",parents_phone.getText().toString());
department_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        inext.putExtra("department",department_spinner.getSelectedItem().toString());
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
});
//                year_spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                    @Override
//                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                        String y=year.get(position);
//                        inext.putExtra("year",y);
//                    }
//                });
//                div_spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                    @Override
//                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                        String d = div.get(position);
//                        inext.putExtra("division",d);
//                    }
//                });
                startActivity(inext);
            }
        });

    }
}