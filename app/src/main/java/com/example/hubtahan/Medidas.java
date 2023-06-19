package com.example.hubtahan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Medidas extends AppCompatActivity {

    Double centimetros, metros, resulCm, resultMetros;
    EditText editTextCentimetros, editTextMetros;
    String Txtcentimetros, Txtmetros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medidas);

        editTextCentimetros = findViewById(R.id.editTextCentimetros);
        editTextMetros = findViewById(R.id.editTextMetros);

    }

    public void calcularcm(View v) {

        // verifica se os campos estão vazios
        if(editTextCentimetros.getText().toString().equals("")) {
            alerta("Preencha o campo CENTÍMETROS", "ATENÇÃO!");
            editTextCentimetros.requestFocus();
        } else{

            // converter o que o usuario digitou em double para manipular
            centimetros = Double.parseDouble(editTextCentimetros.getText().toString());
            String Txtcentimetros = editTextCentimetros.getText().toString();

            resulCm = centimetros / 100;

            alerta(Txtcentimetros + " Centímetros é: "+ resulCm + " Metros", "RESULTADO");

        }

    }

    public void calcularm(View v) {

        // verifica se os campos estão vazios
        if(editTextMetros.getText().toString().equals("")) {
            alerta("Preencha o campo METROS", "ATENÇÃO!");
            editTextMetros.requestFocus();
        } else{

            // converter o que o usuario digitou em double para manipular
            metros = Double.parseDouble(editTextMetros.getText().toString());
            String Txtmetros = editTextMetros.getText().toString();

            resultMetros = metros * 100;

            alerta(Txtmetros + " Metros é: "+ resultMetros + " Centímetros", "RESULTADO");

        }

    }

    public void alerta(String msg, String titulo) {
        // método para exibir uma mensagem com um botão
        AlertDialog.Builder alert =
                new AlertDialog.Builder(Medidas.this);
        alert.setTitle(titulo);
        alert.setMessage(msg);
        alert.setNeutralButton("OK", null);
        alert.show();

    }
}