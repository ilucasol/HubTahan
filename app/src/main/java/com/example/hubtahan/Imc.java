package com.example.hubtahan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Imc extends AppCompatActivity {

    Double peso, altura, imc;
    EditText editTextPeso, editTextAltura, editTextNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        editTextPeso = findViewById(R.id.editTextPeso);
        editTextAltura = findViewById(R.id.editTextAltura);
        editTextNome = findViewById(R.id.editTextNome);

    }

    public void calcular(View v) {

        // verifica se os campos estão vazios
        if(editTextPeso.getText().toString().equals("")) {
            alerta("Preencha o campo PESO", "ATENÇÃO!");
            editTextPeso.requestFocus();
        }else if(editTextAltura.getText().toString().equals("")){
            alerta("Preencha o campo ALTURA", "ATENÇÃO!");
            editTextAltura.requestFocus();
        }else if(editTextNome.getText().toString().equals("")){
            alerta("Preencha seu NOME", "ATENÇÃO!");
            editTextNome.requestFocus();
        }else{

            // converter o que o usuario digitou em double para manipular
            peso = Double.parseDouble(editTextPeso.getText().toString());
            altura = Double.parseDouble(editTextAltura.getText().toString());
            imc = peso / (altura * altura);


            if (imc <18.5){
                alerta("Você está abaixo do peso", "Seu IMC é: " + imc);
            }else if (imc >= 18.6 && imc <= 24.9){
                alerta("Parabéns! Você está no peso ideal!", "Seu IMC é: " + imc);
            }else if (imc >= 25.0 && imc <= 29.9){
                alerta("VocÊ está levemente acima do peso", "Seu IMC é: " + imc);
            }else if ( imc>=30.0 && imc <= 34.9){
                alerta("Você está com obesidade Grau 1", "Seu IMC é: " + imc);
            }else if (imc >= 35.0 && imc <=39.9){
                alerta("Você está com obesidade Grau 2", "Seu IMC é: " + imc);
            }else if (imc>= 40){
                alerta("Cuidado! Você está com Obesidade Grau 3", "Seu IMC é: " + imc);
            }

            Pessoa pessoa = new Pessoa(editTextNome.getText().toString(), Double.parseDouble(imc.toString()));

            PessoaDAO pessoaDAO = new PessoaDAO(this);
            long id = pessoaDAO.inserir(pessoa);

            Toast.makeText(this, "IMC Registrado! Id: " + id, Toast.LENGTH_LONG).show();

        }

    }

    public void registros(View v) {

        Intent main = new Intent(Imc.this, RegistrosImc.class);
        startActivity(main);

    }

    public void alerta(String msg, String titulo) {
        // método para exibir uma mensagem com um botão
        AlertDialog.Builder alert =
                new AlertDialog.Builder(Imc.this);
        alert.setTitle(titulo);
        alert.setMessage(msg);
        alert.setNeutralButton("OK", null);
        alert.show();

    }

}