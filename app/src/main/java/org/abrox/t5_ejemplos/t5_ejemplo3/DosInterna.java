package org.abrox.t5_ejemplos.t5_ejemplo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class DosInterna extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos_interna);
    }

    public void cerrar(View v){
        finish();
    }
}