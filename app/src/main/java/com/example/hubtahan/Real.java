package com.example.hubtahan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Real extends AppCompatActivity {

    Double real, dolar, resultReal, resultDolar;
    EditText editTextReal, editTextDolar;
    String txtReal, txtDolar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real);

        editTextReal = findViewById(R.id.editTextReal);
        editTextDolar = findViewById(R.id.editTextDolar);

    }

    public void calcularreal(View v) {

        // verifica se os campos estão vazios
        if(editTextReal.getText().toString().equals("")) {
            alerta("Preencha o campo REAL", "ATENÇÃO!");
            editTextReal.requestFocus();
        } else{

            // converter o que o usuario digitou em double para manipular
            real = Double.parseDouble(editTextReal.getText().toString());
            String txtReal = editTextReal.getText().toString();

            resultReal = real * 5;

            alerta(txtReal + " Reais é Aproximadamente: "+ resultReal + " Dólares", "RESULTADO");

        }

    }

    public void calculardolar(View v) {

        // verifica se os campos estão vazios
        if(editTextDolar.getText().toString().equals("")) {
            alerta("Preencha o campo DÓLAR", "ATENÇÃO!");
            editTextDolar.requestFocus();
        } else{

            // converter o que o usuario digitou em double para manipular
            dolar = Double.parseDouble(editTextDolar.getText().toString());
            String txtDolar = editTextDolar.getText().toString();

            resultDolar = dolar / 5;

            alerta(txtDolar + " Dólares é Aproximadamente: "+ resultDolar + " Reais", "RESULTADO");

        }

    }

    public void alerta(String msg, String titulo) {
        // método para exibir uma mensagem com um botão
        AlertDialog.Builder alert =
                new AlertDialog.Builder(Real.this);
        alert.setTitle(titulo);
        alert.setMessage(msg);
        alert.setNeutralButton("OK", null);
        alert.show();

    }

}