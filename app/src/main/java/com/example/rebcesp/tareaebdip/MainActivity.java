package com.example.rebcesp.tareaebdip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tx;
    Button bt;
    EditText nombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.nombreTxt);
        tx = (TextView) findViewById(R.id.textView);
        bt = (Button) findViewById(R.id.btnBusqueda);

    }


    public void ejecutarBusqueda(View v){


             String texto = nombre.getText().toString(); // declaramos el texto del edittext

            if(!nombre.getText().toString().equals("")) //Obtiene el texto del edittext y lo castega a String


    {



        Intent i = new Intent(this, Main2Activity.class); //Abrimos la clase que queremos abrir
        i.putExtra("nombre", texto); //Esto es para recoger el nombre y pasarlo a la segunda clase
        startActivity(i);



    }

            else {

        Toast.makeText(getApplicationContext(), "Introduce un nombre porfavor", Toast.LENGTH_SHORT).show();
        //  Toast toast = Toast.makeText(getApplicationContext(), "Introduce un nombre" + nombre.getText().toString(), Toast.LENGTH_SHORT);


    }

}

    }
















