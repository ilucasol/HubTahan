package com.example.hubtahan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class RegistrosImc extends AppCompatActivity {

    List<Pessoa> lPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registros_imc);

        ListView listViewImc = findViewById(R.id.listViewImc);
        PessoaDAO pessoaDAO = new PessoaDAO(this);
        lPessoa = pessoaDAO.listar();

        ArrayAdapter<Pessoa> adapter = new ArrayAdapter<Pessoa>(this, android.R.layout.simple_list_item_1,lPessoa);

        listViewImc.setAdapter(adapter);


    }


}