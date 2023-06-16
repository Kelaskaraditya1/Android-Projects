package com.starkindustries.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
  public void adddata(View view)
  {
      Toast.makeText(this, "Adding Data to Databases", Toast.LENGTH_SHORT).show();
  }
    public void updatedata(View view)
    {
        Toast.makeText(this, "Updating Data to Database", Toast.LENGTH_SHORT).show();
    }
    public void deletedata(View view)
    {
        Toast.makeText(this, "Deleting Data from Database", Toast.LENGTH_SHORT).show();
    }
    public void enter(View view) {
        Toast.makeText(this, "Enter the name of the User", Toast.LENGTH_SHORT).show();
    }
}