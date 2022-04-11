package com.example.meuaplicativopaycoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity_metodoPagamento extends AppCompatActivity {

    ImageButton metodoPagamento_imgbtn_voltarHome;
    Button metodoPagamento_imgbtn_scannerCodigo, metodoPagamento_imgbtn_scannerbarras, metodoPagamento_imgbtn_scannerQrcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metodo_pagamento);


        //Função que oculta a barra superior e o título do projeto
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        metodoPagamento_imgbtn_scannerCodigo = findViewById(R.id.metodoPagamento_imgbtn_scannerCodigo);
        metodoPagamento_imgbtn_voltarHome = findViewById(R.id.metodoPagamento_imgbtn_voltarHome);
        metodoPagamento_imgbtn_scannerbarras = findViewById(R.id.metodoPagamento_imgbtn_scannerbarras);
        metodoPagamento_imgbtn_scannerQrcode = findViewById(R.id.metodoPagamento_imgbtn_scannerQrcode);

        metodoPagamento_imgbtn_scannerCodigo.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_pagarCodigoBarras.class);
            startActivity(it);
        });

        metodoPagamento_imgbtn_voltarHome.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_Home.class);
            startActivity(it);
        });

        metodoPagamento_imgbtn_scannerbarras.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_digiteCodigoBarras.class);
            startActivity(it);
        });

        metodoPagamento_imgbtn_scannerQrcode.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_pagarQrCode.class);
            startActivity(it);
        });
    }
}