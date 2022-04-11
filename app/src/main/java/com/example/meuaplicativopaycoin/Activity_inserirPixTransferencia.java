package com.example.meuaplicativopaycoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity_inserirPixTransferencia extends AppCompatActivity {

    ImageButton inserirPixTransferencia_imgbtn_voltarDefinirValores;
    Button inserirPixTransferencia_btn_autenticar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserir_pix_transferencia);

        //Função que oculta a barra superior e o título do projeto
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        inserirPixTransferencia_imgbtn_voltarDefinirValores = findViewById(R.id.inserirPixTransferencia_imgbtn_voltarDefinirValores);
        inserirPixTransferencia_btn_autenticar = findViewById(R.id.inserirPixTransferencia_btn_autenticar);

        inserirPixTransferencia_imgbtn_voltarDefinirValores.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_definirValorTransferencia.class);
            startActivity(it);
        });

        inserirPixTransferencia_btn_autenticar.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_autenticacao.class);
            startActivity(it);
        });
    }
}