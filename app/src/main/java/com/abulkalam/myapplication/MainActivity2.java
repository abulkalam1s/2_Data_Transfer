package com.abulkalam.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView name, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = findViewById(R.id.getName);
        number = findViewById(R.id.getNumber);

        //Getting data sent from previous activity
        Intent intent = getIntent();
        String nameR = intent.getStringExtra("name");
        String numberR = intent.getStringExtra("number");

        // Showing data in 2nd Activity after getting
        name.setText(nameR);
        number.setText(numberR);

    }
}