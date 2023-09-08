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

        // Memeriksa apakah ada data tersimpan saat rotate
        if (savedInstanceState != null) {
            hitung = savedInstanceState.getInt("hitung");
            scoreTV.setText(String.valueOf(hitung));
        }
    }

    @Override
    public void onClick(View view) {
        String currentscore = scoreTV.getText().toString();
        int currentscoreInt = Integer.valueOf(currentscore);

        hitung = currentscoreInt + 1;
        scoreTV.setText(String.valueOf(hitung));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // Simpan data yang perlu dipertahankan saat rotate
        outState.putInt("hitung", hitung);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle state) {
        super.onRestoreInstanceState(state);
        // Pulihkan data yang disimpan saat rotate
        hitung = state.getInt("hitung");
        scoreTV.setText(String.valueOf(hitung));
    }
}
