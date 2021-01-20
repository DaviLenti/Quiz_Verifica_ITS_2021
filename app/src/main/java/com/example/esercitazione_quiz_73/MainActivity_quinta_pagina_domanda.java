package com.example.esercitazione_quiz_73;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity_quinta_pagina_domanda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_quinta_pagina_domanda);

        RadioButton Risposta_corretta_quinta_pagina= findViewById(R.id.risp2_quinta_domanda);
        Button Button_next_quinta_pagina = findViewById(R.id.button_Next_quinta_Pagina);
        RadioGroup radiogroup= findViewById(R.id.radiogroupquintapagina);

        Button_next_quinta_pagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Risposta_corretta_quinta_pagina.isChecked()){
                    MainActivity_prima_pagina_domanda.Punteggio.val_pt++;
                }
                startActivity(new Intent(MainActivity_quinta_pagina_domanda.this,MainActivity_sesta_pagina_domanda.class));
                radiogroup.clearCheck();
            }
        });


    }
    @Override
    public void onBackPressed(){

    }
}