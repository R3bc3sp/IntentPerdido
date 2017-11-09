package com.example.rebcesp.tareaebdip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
        public void volverLlave (View v){

        Intent i = getIntent();

        setResult(RESULT_OK,i); //Metemos dentro del intent que el resultado sera OK

        finish();
    }

    public void volversinLlave(View v){

        Intent i = getIntent();

        setResult(RESULT_CANCELED); //No volvemos con la llave

        finish();
    }


    }

