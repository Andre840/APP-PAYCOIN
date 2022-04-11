package com.example.meuaplicativopaycoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

public class Activity_confirmacao extends AppCompatActivity {

    Button confirmacao_btn_extrato, confirmacao_btn_voltarHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacao);

        //Função que oculta a barra superior e o título do projeto
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        confirmacao_btn_extrato = findViewById(R.id.confirmacao_btn_extrato);
        confirmacao_btn_voltarHome = findViewById(R.id.confirmacao_btn_voltarHome);

        confirmacao_btn_extrato.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_extratos.class);
            startActivity(it);
        });

        confirmacao_btn_voltarHome.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_Home.class);
            startActivity(it);
        });
    }
}