package com.hacktiv08.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView scoreTV;
    Button counter;
    EditText namaET;
    private int hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreTV = findViewById(R.id.score);
        counter = findViewById(R.id.button_count);
        counter.setOnClickListener(this);
        namaET = findViewById(R.id.editTextText);

    }

    @Override
    public void onClick(View view) {
        hitung = hitung+1;
        scoreTV.setText(String.valueOf(hitung));
    }
}