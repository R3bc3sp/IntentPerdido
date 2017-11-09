package com.example.rebcesp.tareaebdip;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button bt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        bt = (Button)findViewById(R.id.btnLlamar);




    }

    public void realizarLlamada(View v){

        Uri telf = Uri.parse("tel:917407272"); //Importante declara siempre tel:
        Intent llamada = new Intent (Intent.ACTION_DIAL, telf);
        if(llamada.resolveActivity(getPackageManager()) != null){ // Me aseguro que al aplicacion llamada pueda resolver esta actividad ...

            startActivity(llamada);

        }


    }




}
