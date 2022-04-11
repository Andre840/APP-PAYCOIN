package com.example.meuaplicativopaycoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

public class Activity_autenticacao extends AppCompatActivity {

    Button autenticacao_btn_confirmaPagamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autenticacao);

        //Função que oculta a barra superior e o título do projeto
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        autenticacao_btn_confirmaPagamento = findViewById(R.id.autenticacao_btn_confirmaPagamento);

        autenticacao_btn_confirmaPagamento.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_confirmacao.class);
            startActivity(it);
        });
    }
}