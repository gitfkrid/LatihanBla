package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    Button btnLogout, btnBack, btnDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();

        btnLogout.setOnClickListener(v -> {
            SharedPreferences sharedPreferences = getSharedPreferences("login", MODE_PRIVATE);
            Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
            startActivity(intent);
            sharedPreferences.edit().remove("username").apply();
            sharedPreferences.edit().remove("alamat").apply();
            finish();
        });

        btnDetail.setOnClickListener(v -> {
            replaceFragment(new ItemFragment());
        });

        btnBack.setOnClickListener(v -> {
            finish();
        });
    }

    public void init(){
        btnLogout = findViewById(R.id.btnLogout);
        btnBack = findViewById(R.id.btnBack);
        btnDetail = findViewById(R.id.btnDetail);
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();
    }
}