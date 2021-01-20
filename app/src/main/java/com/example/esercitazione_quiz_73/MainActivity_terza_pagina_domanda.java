package com.example.esercitazione_quiz_73;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity_terza_pagina_domanda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_terza_pagina_domanda);

        RadioButton Risposta_corretta= findViewById(R.id.risp2_terza_domanda);
        Button Button_next_terza_pagina = findViewById(R.id.button_Next_terza_Pagina);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_200)));
        this.setTitle("DOMANDA N°3");
        Button_next_terza_pagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Risposta_corretta.isChecked()){
                    MainActivity_prima_pagina_domanda.Punteggio.val_pt++;
                }
                startActivity(new Intent(MainActivity_terza_pagina_domanda.this,MainActivity_quarta_pagina_domanda.class));
            }
        });
    }
    @Override
    public void onBackPressed(){

    }
}