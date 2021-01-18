package com.example.esercitazione_quiz_73;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity_prima_pagina_domanda extends AppCompatActivity {
    public static class Punteggio {
        public static int val_pt = 0;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_prima_pagina_domanda);
        RadioButton Risposta_corretta= findViewById(R.id.risp1941);
        Button Button_next_prima_pagina = findViewById(R.id.button_Next_prima_Pagina);


        Button_next_prima_pagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(Risposta_corretta.isSelected()){
                Punteggio.val_pt++;
            }
            startActivity(new Intent(MainActivity_prima_pagina_domanda.this,MainActivity_seconda_pagina_domanda.class));
            }
        });
    }
}