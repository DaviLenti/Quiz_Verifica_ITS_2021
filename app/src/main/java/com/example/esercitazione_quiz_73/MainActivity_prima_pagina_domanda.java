package com.example.esercitazione_quiz_73;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity_prima_pagina_domanda extends AppCompatActivity {
    public static class Punteggio {
        public static int val_pt = 0;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_prima_pagina_domanda);
        RadioButton Risposta_corretta_2= findViewById(R.id.risp2_prima_domanda);
        RadioButton Risp_1_prima_domanda= findViewById(R.id.risp1_prima_domanda);
        RadioButton Risp_3_prima_domanda= findViewById(R.id.risp3_prima_domanda);
        RadioButton Risp_4_prima_domanda= findViewById(R.id.risp4_prima_domanda);
        Button Button_next_prima_pagina = findViewById(R.id.button_Next_prima_Pagina);
        RadioGroup radiogroup= findViewById(R.id.radiogroupprimapagina);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_200)));
        this.setTitle("DOMANDA N°1");
        Button_next_prima_pagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            if(Risposta_corretta_2.isChecked()){
                Punteggio.val_pt++;
            }

            startActivity(new Intent(MainActivity_prima_pagina_domanda.this,MainActivity_seconda_pagina_domanda.class));


            }
        });
    }
    @Override
    public void onBackPressed(){

    }
}