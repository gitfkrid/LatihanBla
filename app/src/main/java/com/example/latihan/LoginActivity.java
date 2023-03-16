package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText etUsername, etPassword;
    AppCompatButton btnLogin, btnForgot;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        if(sharedPreferences.contains("username")){
            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(intent);
            etUsername.setText("");
            etPassword.setText("");
        }

        btnLogin.setOnClickListener(v -> {
            String username = etUsername.getText().toString();
            String password = etPassword.getText().toString();
            String alamat = "Jl. Raya Cibadak No. 1";

            if (username.equals("admin") && password.equals("admin")){
                Toast.makeText(this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("username", username);
                editor.putString("alamat", alamat);
                editor.commit();
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);
                etUsername.setText("");
                etPassword.setText("");
            }
            else {
                Toast.makeText(this, "Login Gagal", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void init(){
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnForgot = findViewById(R.id.btnForgot);
        sharedPreferences = getSharedPreferences("login", MODE_PRIVATE);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }
}