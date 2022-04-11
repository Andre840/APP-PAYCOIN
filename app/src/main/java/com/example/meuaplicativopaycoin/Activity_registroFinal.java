package com.example.meuaplicativopaycoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Activity_registroFinal extends AppCompatActivity {

    Button registroFinal_btn_concluido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_final);

        Button registroFinal_btn_concluido = findViewById(R.id.registroFinal_btn_concluido);

        registroFinal_btn_concluido.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_concluido.class);
            startActivity(it);

        });

    }
}