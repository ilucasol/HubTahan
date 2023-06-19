package com.example.hubtahan;

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

    public void imc(View v) {

        Intent main = new Intent(MainActivity.this, Imc.class);
        startActivity(main);

    }

    public void media(View v) {

        Intent main = new Intent(MainActivity.this, Media.class);
        startActivity(main);

    }

    public void real(View v) {

        Intent main = new Intent(MainActivity.this, Real.class);
        startActivity(main);

    }

    public void medidas(View v) {

        Intent main = new Intent(MainActivity.this, Medidas.class);
        startActivity(main);

    }

    public void malba(View v) {

        Intent main = new Intent(MainActivity.this, Malba.class);
        startActivity(main);

    }

    public void sobre(View v) {

        Intent main = new Intent(MainActivity.this, Sobre.class);
        startActivity(main);

    }

}


