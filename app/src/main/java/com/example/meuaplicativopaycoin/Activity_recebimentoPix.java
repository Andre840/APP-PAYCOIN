package com.example.meuaplicativopaycoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity_recebimentoPix extends AppCompatActivity {

    ImageButton recebimentoPix_imgbtn_rebeberTransferencia;
    Button recebimentoPix_btn_confirmaPagamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebimento_pix);

        //Função que oculta a barra superior e o título do projeto
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        recebimentoPix_imgbtn_rebeberTransferencia = findViewById(R.id.recebimentoPix_imgbtn_rebeberTransferencia);
        recebimentoPix_btn_confirmaPagamento = findViewById(R.id.recebimentoPix_btn_confirmaPagamento);

        recebimentoPix_imgbtn_rebeberTransferencia.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_receberTransferencia.class);
            startActivity(it);
        });

        recebimentoPix_btn_confirmaPagamento.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), Activity_confirmacao.class);
            startActivity(it);
        });
    }
}