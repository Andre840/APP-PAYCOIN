package com.example.meuaplicativopaycoin;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    Button mainActivity_btn_login, mainActivity_btn_registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Função que oculta a barra superior e o título do projeto
        Objects.requireNonNull(getSupportActionBar()).hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Linked_components();
        Click_action();
    }
       public void Linked_components(){
        mainActivity_btn_login = findViewById(R.id.mainActivity_btn_login);
        mainActivity_btn_registro = findViewById(R.id.mainActivity_btn_registro);
}

      public void Click_action(){

          mainActivity_btn_login.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_Home.class);
            startActivity(it);
        });

        mainActivity_btn_registro.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_registroInicial.class);
            startActivity(it);
        });

    }
}