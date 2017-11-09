package com.example.rebcesp.tareaebdip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.rebcesp.tareaebdip.R.string.texto3;

public class Main2Activity extends AppCompatActivity {

    Button bt;
    Button bt1;
    TextView alumno;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bt = (Button)findViewById(R.id.btnCorto);
        bt1 = (Button)findViewById(R.id.btnLargo);
        alumno = (TextView)findViewById(R.id.txt2);

        alumno.setText(String.format(getString(R.string.texto2),getIntent().getStringExtra("nombre")));





    }


        public void ejectutarCorto(View v){

            Intent corto = new Intent(this, Main4Activity.class);
            corto.putExtra("nombre",alumno.getText().toString()); //pasamos el texto al activity 4
            startActivity(corto);

        }

        public void ejecutarLargo(View v){



                Intent largo = new Intent(this, Main3Activity.class);
                startActivity(largo);
        }

}
