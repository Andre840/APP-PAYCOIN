package com.example.meuaplicativopaycoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Activity_concluido extends AppCompatActivity {

    Button concluido_btn_voltarLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concluido);

        concluido_btn_voltarLogin = findViewById(R.id.concluido_btn_voltarLogin);

        concluido_btn_voltarLogin.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(it);
        });
    }
}