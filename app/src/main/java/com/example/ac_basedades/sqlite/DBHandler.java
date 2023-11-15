package com.example.ac_basedades.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "bicisDB";
    private static final String TABLE_BICIS = "bicis";

    private static final String KEY_ID = "id";
    private static final String KEY_MARCA = "marca";
    private static final String KEY_COLOR = "color";
    private static final String KEY_MIDA = "mida";

    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_BICIS_TABLE = "CREATE TABLE " + TABLE_BICIS + "("
                + KEY_ID + " INTEGER PRIMARY KEY,"
                + KEY_MARCA + " TEXT,"
                + KEY_COLOR + " TEXT,"
                + KEY_MIDA + " INTEGER"
                + ")";
        db.execSQL(CREATE_BICIS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_BICIS);
        onCreate(db);
    }
}
