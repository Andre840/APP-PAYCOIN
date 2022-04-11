package com.example.meuaplicativopaycoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity_pagarCodigoBarras extends AppCompatActivity {

    ImageButton pagarCodigoBarras_imgbtn_voltarMetodoPagamento;
    Button pagarCodigoBarras_btn_detalharPagamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagar_codigo_barras);

        //Função que oculta a barra superior e o título do projeto
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pagarCodigoBarras_btn_detalharPagamento = findViewById(R.id.pagarCodigoBarras_btn_detalharPagamento);
        pagarCodigoBarras_imgbtn_voltarMetodoPagamento = findViewById(R.id.pagarCodigoBarras_imgbtn_voltarMetodoPagamento);

        pagarCodigoBarras_btn_detalharPagamento.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_detalhesPagamento.class);
            startActivity(it);
        });

        pagarCodigoBarras_imgbtn_voltarMetodoPagamento.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_metodoPagamento.class);
            startActivity(it);
        });
    }
}