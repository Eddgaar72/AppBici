package com.example.ac_basedades.sqlite;

public class Contract {
    public static final String TABLE_NAME = "bicis";
    public static final String COLUMN_MARCA = "marca";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_MODEL= "model";
    public static final String COLUMN_COLOR = "color";
    public static final String COLUMN_MIDA = "mida";


    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    COLUMN_ID+ " INTEGER PRIMARY KEY," +
                    COLUMN_MARCA + " TEXT," +
                    COLUMN_MODEL + " TEXT," +
                    COLUMN_COLOR + " TEXT," +
                    COLUMN_MIDA + " INTEGER)";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + TABLE_NAME;
}
