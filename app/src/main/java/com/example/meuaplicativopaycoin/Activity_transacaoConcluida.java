package com.example.meuaplicativopaycoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

public class Activity_transacaoConcluida extends AppCompatActivity {

    Button transacaoConcluida_btn_voltarLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transacao_concluida);

        //Função que oculta a barra superior e o título do projeto
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        transacaoConcluida_btn_voltarLogin = findViewById(R.id.transacaoConcluida_btn_voltarLogin);

        transacaoConcluida_btn_voltarLogin.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_Home.class);
            startActivity(it);
        });
    }
}