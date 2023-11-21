package com.example.ac_basedades.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "bicisDB";
    private static final String TABLE_BICIS = "t_bicis";

    private static final String KEY_ID = "id";
    private static final String KEY_MARCA = "marca";
    private static final String KEY_COLOR = "color";
    private static final String KEY_MIDA = "mida";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL ("CREATE TABLE " + TABLE_BICIS + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + KEY_MARCA + " TEXT,"
                + KEY_COLOR + " TEXT,"
                + KEY_MIDA + " INTEGER"
                + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " + TABLE_BICIS);
        onCreate(db);
    }
}
