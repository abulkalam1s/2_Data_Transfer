package com.abulkalam.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Declaring Variable
    EditText name, number;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Hooke
        name   = findViewById(R.id.etName);
        number = findViewById(R.id.etNumber);
        btn      = findViewById(R.id.btn);
        
        //On Clicking Button
        btn.setOnClickListener(new View.OnClickListener() {
           
            @Override
            public void onClick(View v) {
                //getting data for passing to next Activity
                String nameP = name.getText().toString();
                String numberP = number.getText().toString();
                
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                
                //passing data to next activity
                intent.putExtra("name", nameP); //passing variable name & its value
                intent.putExtra("number", numberP);
                startActivity(intent);
            }
        });
    }
}