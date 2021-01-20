package com.example.esercitazione_quiz_73;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity_Punteggio_Finale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__punteggio__finale);
        Button button_ricomincia = findViewById(R.id.button_reset);
        String strI = String.valueOf(MainActivity_prima_pagina_domanda.Punteggio.val_pt);
        TextView text_variabile= findViewById(R.id.textView_punteggio_varibile);
        TextView text_frase_variabile= findViewById(R.id.textView_frase_variabile);
        text_variabile.setText(strI);

        if(MainActivity_prima_pagina_domanda.Punteggio.val_pt==0){
            text_frase_variabile.setText("Non hai indovinato nessuna domanda!Riprova!");
        }
        if(MainActivity_prima_pagina_domanda.Punteggio.val_pt>0&&MainActivity_prima_pagina_domanda.Punteggio.val_pt<=5){
            text_frase_variabile.setText("Non è andata molto male...Ma devi riprovare");
        }
        if(MainActivity_prima_pagina_domanda.Punteggio.val_pt>=5&&MainActivity_prima_pagina_domanda.Punteggio.val_pt<=10){
            text_frase_variabile.setText("Accidenti, eri quasi riuscito ad arrivare al massimo punteggio");

        }
        if(MainActivity_prima_pagina_domanda.Punteggio.val_pt==10){
            text_frase_variabile.setText("Complimenti!!!Hai raggiunto il massimo punteggio");
        }

        button_ricomincia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity_prima_pagina_domanda.Punteggio.val_pt=0;
                startActivity(new Intent(MainActivity_Punteggio_Finale.this,MainActivity.class));
            }
        });
    }
    @Override
    public void onBackPressed(){

    }
}