package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    TextView tvHalo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        sharedPreferences = getSharedPreferences("login", MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "");
        tvHalo = findViewById(R.id.tvHalo);
        tvHalo.setText("Halo, " + username);
    }
}