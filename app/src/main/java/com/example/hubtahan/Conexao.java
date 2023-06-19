package com.example.hubtahan;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class Conexao extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "bd_hubtahan";
    private static final int DATABASE_VERSION = 1;

    public Conexao (Context context){
        super (context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        try{

            sqLiteDatabase.execSQL(
                    "CREATE TABLE imc ( "+
                    "nome VARCHAR(100) not null," +
                    "resultado double not null);"
            );

        } catch (SQLException ex) {
            Log.e("imc", ex.getMessage());
        }

    }

}