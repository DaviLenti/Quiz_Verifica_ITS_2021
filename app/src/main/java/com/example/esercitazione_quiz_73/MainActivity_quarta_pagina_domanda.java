package com.example.esercitazione_quiz_73;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity_quarta_pagina_domanda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_quarta_pagina_domanda);

        RadioButton Risposta_corretta_quarta_pagina= findViewById(R.id.risp3_quarta_domanda);
        Button Button_next_quarta_pagina = findViewById(R.id.button_Next_quarta_Pagina);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_200)));
        this.setTitle("DOMANDA N°4");
        Button_next_quarta_pagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Risposta_corretta_quarta_pagina.isChecked()){
                    MainActivity_prima_pagina_domanda.Punteggio.val_pt++;
                }
                startActivity(new Intent(MainActivity_quarta_pagina_domanda.this,MainActivity_quinta_pagina_domanda.class));
            }
        });
    }
    @Override
    public void onBackPressed(){

    }
}