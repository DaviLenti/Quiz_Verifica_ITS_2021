package com.example.esercitazione_quiz_73;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //PAGINA INIZIALE INTRODUTTIVA
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Button_Pagina_Iniziale= findViewById(R.id.button_Pagina_Iniziale);
        getSupportActionBar().hide(); //->NASCONDE ACTION BAR

        Button_Pagina_Iniziale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity_prima_pagina_domanda.class));//->CAMBIA ACTIVITY
            }
        });
    }


}