package com.example.ac_basedades.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DbBicis extends DBHelper {
    Context context;


    public DbBicis(Context context) {
        super(context);
        this.context = context;
    }
    public long insertarBicis (String marca, String model, String color, int midaMarc){
        DBHelper dbHelper = new DBHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("marca", marca);
        values.put("model", model);
        values.put("color", color);
        values.put("midaMarc", midaMarc);

        long id = db.insert(TABLE_BICIS, null, values);

        return id;

    }
}
