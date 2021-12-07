package com.misiontic2022.packagetracking.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MySQLiteHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "appPackageTracking.sqlite";
    private static final int DB_VERSION = 1;
    private static final String USUARIO_TABLE_CREATE = "CREATE TABLE usuario(usu_celular TEXT, usu_nombre TEXT)";
    private static final String MIEMBROS_TABLE_CREATE = "CREATE TABLE miembros(usu_celular TEXT, mie_celular TEXT, id_grupo INTEGER)";
    private static final String GRUPOS_TABLE_CREATE = "CREATE TABLE grupos(id_grupo INTEGER PRIMARY KEY AUTOINCREMENT, nombre_grupo TEXT)";

    public MySQLiteHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(USUARIO_TABLE_CREATE);
        db.execSQL(MIEMBROS_TABLE_CREATE);
        db.execSQL(GRUPOS_TABLE_CREATE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int antVersion, int nueVersion) {

    }

    public void insertarDatos(String sentencia){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(sentencia);
    }
}
