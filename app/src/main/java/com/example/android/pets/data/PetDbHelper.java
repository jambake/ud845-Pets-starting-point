package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.pets.data.PetContract.PetEntry;

/**
 * Created by jimbaker on 1/24/17.
 */

public class PetDbHelper extends SQLiteOpenHelper {

    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "shelter.db";

    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

//    private static final String SQL_CREATE_ENTRIES =
//            "CREATE TABLE " + PetEntry.TABLE_NAME + " (" +
//                    PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//                    PetEntry.COLUMN_PET_NAME + " TEXT NOT NULL," +
//                    PetEntry.COLUMN_PET_BREED + " TEXT NOT NULL," +
//                    PetEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL DEFAULT 0," +
//                    PetEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL);";

//    private static final String SQL_DELETE_ENTRIES =
//            "DROP TABLE IF EXISTS " + PetEntry.TABLE_NAME;

    @Override
    public void onCreate(SQLiteDatabase db) {
        //db.execSQL(SQL_CREATE_ENTRIES);
        String SQL_CREATE_PETS_TABLE = "CREATE TABLE " + PetEntry.TABLE_NAME + " (" +
                PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                PetEntry.COLUMN_PET_NAME + " TEXT NOT NULL," +
                PetEntry.COLUMN_PET_BREED + " TEXT NOT NULL," +
                PetEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL DEFAULT 0," +
                PetEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL);";

        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
//        String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + PetEntry.TABLE_NAME;
//
//        db.execSQL(SQL_DELETE_ENTRIES);
//
//        onCreate(db);
    }

}
