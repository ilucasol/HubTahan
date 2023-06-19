package com.example.hubtahan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Media extends AppCompatActivity {

    Double nota1, nota2, media;
    EditText editTextNota1, editTextNota2, editTextDisciplina, editTextNomeM;
    String disciplina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        editTextNota1 = findViewById(R.id.editTextNota1);
        editTextNota2 = findViewById(R.id.editTextNota2);
        editTextDisciplina = findViewById(R.id.editTextDisciplina);
        editTextNomeM = findViewById(R.id.editTextNomeM);

    }

    public void calcular(View v) {

        // verifica se os campos estão vazios
        if(editTextNota1.getText().toString().equals("")) {
            alerta("Preencha a NOTA 1", "ATENÇÃO!");
            editTextNota1.requestFocus();
        }else if(editTextNota2.getText().toString().equals("")){
            alerta("Preencha sua NOTA DA PROVA", "ATENÇÃO!");
            editTextNota2.requestFocus();
        }else if(editTextDisciplina.getText().toString().equals("")) {
            alerta("Preencha o campo DISCIPLINA", "ATENÇÃO!");
            editTextDisciplina.requestFocus();
        }else if(editTextNomeM.getText().toString().equals("")) {
            alerta("Preencha seu NOME", "ATENÇÃO!");
            editTextNomeM.requestFocus();

        }else{

            // converter o que o usuario digitou em double para manipular
            nota1 = Double.parseDouble(editTextNota1.getText().toString());
            nota2 = Double.parseDouble(editTextNota2.getText().toString());
            String disciplina = editTextDisciplina.getText().toString();
            media =  (nota1 + nota2) / 2;


            if (media <6){
                alerta("Você Está Abaixo da Média em "+disciplina, "Sua Média é: " + media);
            }else if (media>= 6){
                alerta("PARABÉNS! Você Está na Média em "+disciplina, "Sua Média é: " + media);
            }

        }

    }


    public void alerta(String msg, String titulo) {
        // método para exibir uma mensagem com um botão
        AlertDialog.Builder alert =
                new AlertDialog.Builder(Media.this);
        alert.setTitle(titulo);
        alert.setMessage(msg);
        alert.setNeutralButton("OK", null);
        alert.show();

    }

}