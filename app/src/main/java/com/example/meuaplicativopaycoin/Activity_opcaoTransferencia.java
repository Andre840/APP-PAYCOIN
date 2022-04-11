package com.example.meuaplicativopaycoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity_opcaoTransferencia extends AppCompatActivity {

    ImageButton opcaoTransferencia_imgbtn_voltarHome;
    Button opcaoTransferencia_btn_enviarTransferencia, opcaoTransferencia_btn_receberTransferencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcao_transferencia);

        //Função que oculta a barra superior e o título do projeto
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        opcaoTransferencia_imgbtn_voltarHome = findViewById(R.id.opcaoTransferencia_imgbtn_voltarHome);
        opcaoTransferencia_btn_receberTransferencia = findViewById(R.id.opcaoTransferencia_btn_receberTransferencia);
        opcaoTransferencia_btn_enviarTransferencia = findViewById(R.id.opcaoTransferencia_btn_enviarTransferencia);


        opcaoTransferencia_imgbtn_voltarHome.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_Home.class);
            startActivity(it);
        });

        opcaoTransferencia_btn_receberTransferencia.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_receberTransferencia.class);
            startActivity(it);
        });

        opcaoTransferencia_btn_enviarTransferencia.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_realizarTransferencia.class);
            startActivity(it);
        });
    }
}