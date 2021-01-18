package com.example.esercitazione_quiz_73;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity_ottava_pagina_domanda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ottava_pagina_domanda);

        CheckBox Risposta_corretta_ottava_pagina_1= findViewById(R.id.risp1_ottava_domanda);
        CheckBox Risposta_corretta_ottava_pagina_2= findViewById(R.id.risp4_ottava_domanda);
        CheckBox Risposta_3= findViewById(R.id.risp3_ottava_domanda);
        CheckBox Risposta_4= findViewById(R.id.risp4_ottava_domanda);
        Button Button_next_ottava_pagina = findViewById(R.id.button_Next_ottava_Pagina);

        Button_next_ottava_pagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Risposta_corretta_ottava_pagina_1.isChecked()&&Risposta_corretta_ottava_pagina_2.isChecked()){
                    MainActivity_prima_pagina_domanda.Punteggio.val_pt=MainActivity_prima_pagina_domanda.Punteggio.val_pt+2;
                }
                if(Risposta_corretta_ottava_pagina_1.isChecked()){
                    MainActivity_prima_pagina_domanda.Punteggio.val_pt++;
                }
                startActivity(new Intent(MainActivity_ottava_pagina_domanda.this,MainActivity_nona_pagina_domanda.class));
               Risposta_corretta_ottava_pagina_1.setChecked(false);
                Risposta_corretta_ottava_pagina_2.setChecked(false);
                Risposta_3.setChecked(false);
                Risposta_4.setChecked(false);
            }
        });


    }
}