package com.example.meuaplicativopaycoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity_receberTransferencia extends AppCompatActivity {

    ImageButton receberTransferencia_imgbtn_voltarOpcaoTransferencia;
    Button receberTransferencia_btn_receberViaPix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receber_transferencia);

        //Função que oculta a barra superior e o título do projeto
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        receberTransferencia_imgbtn_voltarOpcaoTransferencia = findViewById(R.id.receberTransferencia_imgbtn_voltarOpcaoTransferencia);
        receberTransferencia_btn_receberViaPix = findViewById(R.id.receberTransferencia_btn_receberViaPix);

        receberTransferencia_imgbtn_voltarOpcaoTransferencia.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_opcaoTransferencia.class);
            startActivity(it);
        });

        receberTransferencia_btn_receberViaPix.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_recebimentoPix.class);
            startActivity(it);
        });
    }
}