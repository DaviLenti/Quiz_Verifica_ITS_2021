package com.example.esercitazione_quiz_73;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity_seconda_pagina_domanda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_seconda_pagina_domanda);

        RadioButton Risposta_corretta_seconda_domanda= findViewById(R.id.risp2_seconda_domanda);
        Button Button_next_seconda_pagina = findViewById(R.id.button_Next_seconda_pagina);
        RadioGroup radiogroup= findViewById(R.id.radiogroupsecondapagina);

        Button_next_seconda_pagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Risposta_corretta_seconda_domanda.isChecked()){
                    MainActivity_prima_pagina_domanda.Punteggio.val_pt++;
                }

                startActivity(new Intent(MainActivity_seconda_pagina_domanda.this,MainActivity_terza_pagina_domanda.class));
                radiogroup.clearCheck();
            }
        });

    }
    @Override
    public void onBackPressed(){

    }
}