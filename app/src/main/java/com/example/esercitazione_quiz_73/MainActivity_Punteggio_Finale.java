package com.example.esercitazione_quiz_73;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
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
        String strI = String.valueOf(MainActivity_prima_pagina_domanda.Punteggio.val_pt);//->IL PUNTEGGIO VIENE CONVERTITO IN STRINGA
        TextView text_variabile= findViewById(R.id.textView_punteggio_varibile);
        TextView text_frase_variabile= findViewById(R.id.textView_frase_variabile);
        text_variabile.setText(strI);//->IL PUNTEGGIO VIENE IMPOSTATO COME TESTO DELLA VARIABILE (text_variabile)
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_200)));
        this.setTitle("PUNTEGGIO FINALE");
        //BLOCCO DI FRASI E SUONI CONDIZIONATE DAL PUNTEGGIO FINALE
        if(MainActivity_prima_pagina_domanda.Punteggio.val_pt==0){
            text_frase_variabile.setText("Non hai indovinato nessuna domanda!Riprova!");
            final MediaPlayer mp_sad= MediaPlayer.create(this, R.raw.sad_sound_effect);
            mp_sad.start();
        }
        if(MainActivity_prima_pagina_domanda.Punteggio.val_pt>0&&MainActivity_prima_pagina_domanda.Punteggio.val_pt<=5){
            text_frase_variabile.setText("Non è andata molto male...Ma devi riprovare");
            final MediaPlayer mp_sad2= MediaPlayer.create(this, R.raw.sad_sound_effect);
            mp_sad2.start();

        }
        if(MainActivity_prima_pagina_domanda.Punteggio.val_pt>5&&MainActivity_prima_pagina_domanda.Punteggio.val_pt<=10){
            text_frase_variabile.setText("Accidenti, eri quasi riuscito ad arrivare al massimo punteggio");
            final MediaPlayer mp_aww= MediaPlayer.create(this, R.raw.aww_sound_effects);
            mp_aww.start();

        }
        if(MainActivity_prima_pagina_domanda.Punteggio.val_pt==10){
            text_frase_variabile.setText("Complimenti!!!Hai raggiunto il massimo punteggio");
            final MediaPlayer mp_happy= MediaPlayer.create(this, R.raw.audience_clapping_sound_effect);
            mp_happy.start();
        }
        //BLOCCO DI FRASI E SUONI CONDIZIONATE DAL PUNTEGGIO FINALE

        button_ricomincia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //->SE IL TASTO RICOMINCIA VIENE PREMUTO IL PUNTEGGIO VIENE RESETTATO E SI RIPARTE DALLA PRIMA ACTIVITY
                MainActivity_prima_pagina_domanda.Punteggio.val_pt=0;
                startActivity(new Intent(MainActivity_Punteggio_Finale.this,MainActivity.class));
            }
        });
    }
    @Override
    public void onBackPressed(){

    }
}