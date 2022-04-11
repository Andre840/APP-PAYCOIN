package com.example.meuaplicativopaycoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity_pagarQrCode extends AppCompatActivity {

    ImageButton pagarQrCode_imgbtn_voltarMetodoPagamento;
    Button pagarQrCode_btn_detalharPagamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagar_qr_code);

        //Função que oculta a barra superior e o título do projeto
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pagarQrCode_imgbtn_voltarMetodoPagamento = findViewById(R.id.pagarQrCode_imgbtn_voltarMetodoPagamento);
        pagarQrCode_btn_detalharPagamento = findViewById(R.id.pagarQrCode_btn_detalharPagamento);

        pagarQrCode_imgbtn_voltarMetodoPagamento.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_metodoPagamento.class);
            startActivity(it);
        });

        pagarQrCode_btn_detalharPagamento.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_detalhesPagamento.class);
            startActivity(it);
        });
    }
}