package com.example.esercitazione_quiz_73;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity_Punteggio_Finale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__punteggio__finale);

        String strI = String.valueOf(MainActivity_prima_pagina_domanda.Punteggio.val_pt);
        TextView text= findViewById(R.id.textView2);
        text.setText(strI);
    }
}