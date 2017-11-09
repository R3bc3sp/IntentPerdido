package com.example.rebcesp.tareaebdip;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main4Activity extends AppCompatActivity {

    public static int LLAVE = 1; //Creamo suna constante

    TextView et;
    String nombre;
    boolean llave = false; //Tiene para abrir o no abrir


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        et = (TextView) findViewById(R.id.txtCamino);
        et.setText(String.format(getString(R.string.texto3), getIntent().getStringExtra("nombre")));

    }


    public void abrirLaPuerta(View v) {

        if (llave) { //Es true hasta que pueda coger cogido la llave

            Intent puerta = new Intent(this, Main6Activity.class);
            puerta.putExtra("nombre", et.getText().toString());
           startActivity(puerta);


        } else

            Toast.makeText(this, getString(R.string.acceso_sin_llave), Toast.LENGTH_SHORT).show();

    }


    public void cogerLlave(View v) {


        Intent i = new Intent(this, Main5Activity.class);
        startActivityForResult(i,LLAVE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode==RESULT_OK){
            llave=true;
            Toast.makeText(this,getString(R.string.okllave),Toast.LENGTH_SHORT).show();

        }else{

            Toast.makeText(this,getString(R.string.nollave),Toast.LENGTH_SHORT).show();

        }
    }
}



