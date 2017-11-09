package com.example.rebcesp.tareaebdip;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void entrarWeb(View v){
        Uri uri = Uri.parse("https://developer.android.com/guide/components/intents-filters.html");
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(i);

    }

    public void salirJuego(View v){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);


    }
}
