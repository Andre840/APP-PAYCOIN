package com.example.meuaplicativopaycoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity_realizarTransferencia extends AppCompatActivity {

    ImageButton realizarTransferencia_imgbtn_voltarOpcaoTransferencia;
    Button realizarTransferencia_btn_valorDeTransferencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realizar_transferencia);

        //Função que oculta a barra superior e o título do projeto
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        realizarTransferencia_imgbtn_voltarOpcaoTransferencia = findViewById(R.id.realizarTransferencia_imgbtn_voltarOpcaoTransferencia);
        realizarTransferencia_btn_valorDeTransferencia = findViewById(R.id.realizarTransferencia_btn_valorDeTransferencia);


        realizarTransferencia_imgbtn_voltarOpcaoTransferencia.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_opcaoTransferencia.class);
            startActivity(it);
        });

        realizarTransferencia_btn_valorDeTransferencia.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_definirValorTransferencia.class);
            startActivity(it);
        });
    }
}