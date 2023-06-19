package com.example.hubtahan;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {

    private Conexao con;
    private SQLiteDatabase bd_hubtahan;

    public PessoaDAO(Context context) {
    con = new Conexao(context);
    bd_hubtahan = con.getWritableDatabase();

    }

    public long inserir (Pessoa pessoa){

        ContentValues contentValues = new ContentValues();

        contentValues.put("nome", pessoa.getNome());
        contentValues.put("resultado", pessoa.getResultado());

        return bd_hubtahan.insert("imc", null, contentValues);

    }

    public List<Pessoa> listar(){

        List<Pessoa> lista = new ArrayList<Pessoa>();
        Cursor cursor = bd_hubtahan.rawQuery("SELECT * FROM imc", null);
        while(cursor.moveToNext()){
            lista.add(new Pessoa(cursor.getString(0), cursor.getDouble(1)));

        }
        return lista;

    }


}
