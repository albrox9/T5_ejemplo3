package org.abrox.t5_ejemplos.t5_ejemplo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void lanzarDosInterna(View view) {

        //Siempre se lanza una actividad a traves de un intent.

        Intent i = new Intent(this, DosInterna.class);

        //llamo al metodo starActivity para pasarle el intent y pasarla.
        startActivity(i);
    }


    public void lanzarDosExterna(View view) {

        //Quitamos los parametros para lanzar una activity externa
        Intent i = new Intent();
        i.setClassName("org.abrox.t5_ejemplos.t5_ejemplo3_externa",
                    "org.abrox.t5_ejemplos.t5_ejemplo3_externa.MainActivity");
        startActivity(i);



    }
}