package com.example.tugasmodul5;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Deklarasi tombol Login
        Button loginButton = findViewById(R.id.loginButton);

        // Event klik tombol login
        loginButton.setOnClickListener(v -> {
            Toast.makeText(Login.this, "Login clicked!", Toast.LENGTH_SHORT).show();
        });
    }
}
