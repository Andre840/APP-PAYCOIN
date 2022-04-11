package com.example.meuaplicativopaycoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity_digiteCodigoBarras extends AppCompatActivity {

    ImageButton digiteCodigoBarras_imgbtn_voltarMetodoPagamento;
    Button digiteCodigoBarras_btn_detalharPagamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digite_codigo_barras);

        //Função que oculta a barra superior e o título do projeto
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        digiteCodigoBarras_imgbtn_voltarMetodoPagamento = findViewById(R.id.digiteCodigoBarras_imgbtn_voltarMetodoPagamento);
        digiteCodigoBarras_btn_detalharPagamento = findViewById(R.id.digiteCodigoBarras_btn_detalharPagamento);

        digiteCodigoBarras_imgbtn_voltarMetodoPagamento.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_metodoPagamento.class);
            startActivity(it);
        });

        digiteCodigoBarras_btn_detalharPagamento.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_detalhesPagamento.class);
            startActivity(it);
        });
    }
}