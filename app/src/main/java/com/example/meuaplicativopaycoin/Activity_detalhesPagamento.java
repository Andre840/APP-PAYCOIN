package com.example.meuaplicativopaycoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

public class Activity_detalhesPagamento extends AppCompatActivity {

    Button detalhesPagamento_btn_autenticar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_pagamento);

        //Função que oculta a barra superior e o título do projeto
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        detalhesPagamento_btn_autenticar = findViewById(R.id.detalhesPagamento_btn_autenticar);

        detalhesPagamento_btn_autenticar.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_autenticacao.class);
            startActivity(it);
        });
    }
}