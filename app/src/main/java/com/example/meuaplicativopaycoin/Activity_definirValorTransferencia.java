package com.example.meuaplicativopaycoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity_definirValorTransferencia extends AppCompatActivity {

    ImageButton valorTransferencia_imgbtn_voltarRealizarTransferencia;
    Button valorTransferencia_btn_inserirPixTransferencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definir_valor_transferencia);

        //Função que oculta a barra superior e o título do projeto
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        valorTransferencia_imgbtn_voltarRealizarTransferencia = findViewById(R.id.valorTransferencia_imgbtn_voltarRealizarTransferencia);
        valorTransferencia_btn_inserirPixTransferencia = findViewById(R.id.valorTransferencia_btn_inserirPixTransferencia);


        valorTransferencia_imgbtn_voltarRealizarTransferencia.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_realizarTransferencia.class);
            startActivity(it);
        });

        valorTransferencia_btn_inserirPixTransferencia.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_inserirPixTransferencia.class);
            startActivity(it);
        });
    }
}