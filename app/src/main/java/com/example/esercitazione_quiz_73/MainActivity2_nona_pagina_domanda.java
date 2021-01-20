package com.example.esercitazione_quiz_73;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity2_nona_pagina_domanda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_nona_pagina_domanda);
        CheckBox Risposta_corretta_nona_pagina_1= findViewById(R.id.risp1_nona_domanda);
        CheckBox Risposta_corretta_nona_pagina_2= findViewById(R.id.risp4_nona_domanda);
        CheckBox Risposta_3= findViewById(R.id.risp3_nona_domanda);
        CheckBox Risposta_4= findViewById(R.id.risp4_nona_domanda);
        Button Button_next_nona_pagina = findViewById(R.id.button_Next_nona_Pagina);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_200)));
        this.setTitle("DOMANDA N°8");
        Button_next_nona_pagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(Risposta_corretta_nona_pagina_1.isChecked()&&Risposta_corretta_nona_pagina_2.isChecked()){
                    MainActivity_prima_pagina_domanda.Punteggio.val_pt=MainActivity_prima_pagina_domanda.Punteggio.val_pt+2;
                }

                startActivity(new Intent(MainActivity2_nona_pagina_domanda.this,MainActivity_Punteggio_Finale.class));
                ;
            }
        });
    }
    @Override
    public void onBackPressed(){

    }
}