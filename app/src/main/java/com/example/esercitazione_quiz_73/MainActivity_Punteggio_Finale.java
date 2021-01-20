package com.example.esercitazione_quiz_73;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity_Punteggio_Finale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__punteggio__finale);
        Button button_ricomincia = findViewById(R.id.button_reset);
        String strI = String.valueOf(MainActivity_prima_pagina_domanda.Punteggio.val_pt);
        TextView text= findViewById(R.id.textView_punteggio_varibile);
        text.setText(strI);

        button_ricomincia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity_prima_pagina_domanda.Punteggio.val_pt=0;
                startActivity(new Intent(MainActivity_Punteggio_Finale.this,MainActivity.class));
            }
        });
    }
    @Override
    public void onBackPressed(){

    }
}