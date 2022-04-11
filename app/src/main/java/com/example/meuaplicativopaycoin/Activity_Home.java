package com.example.meuaplicativopaycoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class Activity_Home extends AppCompatActivity {

    ImageButton Home_imgbtn_pagamentos, Home_imgbtn_extratos, Home_imgbtn_perfil, Home_imgbtn_transferencia;
    Spinner Home_spinner;
    Button Home_btn_sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Função que oculta a barra superior e o título do projeto
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this,
                R.array.moedas_array, R.layout.spinner_style);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        Home_imgbtn_pagamentos = findViewById(R.id.Home_imgbtn_pagamentos);
        Home_imgbtn_extratos = findViewById(R.id.Home_imgbtn_extratos);
        Home_imgbtn_perfil = findViewById(R.id.Home_imgbtn_perfil);
        Home_imgbtn_transferencia = findViewById(R.id.Home_imgbtn_transferencia);
        Home_spinner = findViewById(R.id.Home_spinner);
        Home_btn_sair = findViewById(R.id.Home_btn_sair);

        Home_imgbtn_pagamentos.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_metodoPagamento.class);
            startActivity(it);
        });

        Home_imgbtn_extratos.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_extratos.class);
            startActivity(it);
        });

        Home_imgbtn_perfil.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_perfil.class);
            startActivity(it);
        });

        Home_imgbtn_transferencia.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_opcaoTransferencia.class);
            startActivity(it);
        });

        Home_btn_sair.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(it);

        });
    }
}