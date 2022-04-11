package com.example.meuaplicativopaycoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity_registroInicial extends AppCompatActivity {

    ImageButton registroInicial_imgbtn_voltarLogin;
    Button registroInicial_btn_registroFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_inicial);

        //Função que oculta a barra superior e o título do projeto
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        registroInicial_imgbtn_voltarLogin = findViewById(R.id.registroInicial_imgbtn_voltarLogin);
        registroInicial_btn_registroFinal = findViewById(R.id.registroInicial_btn_registroFinal);


        registroInicial_imgbtn_voltarLogin.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(it);
        });

        registroInicial_btn_registroFinal.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_registroFinal.class);
            startActivity(it);
        });




    }
}