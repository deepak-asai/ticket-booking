package com.example.deepak.ticket_booking;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import java.util.Objects;

/**
 * Created by deepak on 9/7/16.
 */
public class MovieDBHandler extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION=1;
    private static  final String DATABASE_NAME="movieTicketsDB.db";
    public static final String table="movieTickets";
    public static final String col_mid="mid";
    public static final String col_mname="mname";
    public static final String col_nseats="nseats";
    public static final String col_seats="seats";

    public MovieDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String query="CREATE TABLE IF NOT EXISTS "+table+"("+
                col_mid+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
                col_mname+" TEXT, "+
                col_nseats+" INTEGER, "+
                col_seats+" TEXT "+
                ");";


        db.execSQL(query);
        Log.i("msg", query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        Log.i("msg", "its been called");
        db.execSQL("DROP TABLE IF EXISTS "+table);
        onCreate(db);
    }

    public void addSeats(Movie movie){


        Log.i("msg", "in add seats");

        ContentValues values = new ContentValues();


        values.put(col_mname, movie.getMname());
        values.put(col_nseats, movie.getNseats());
        values.put(col_seats, movie.getSeats());

        SQLiteDatabase db=this.getWritableDatabase();
        db.insert(table, null, values);
        db.close();


    }

   public String databasetostring(String m){
        SQLiteDatabase db=this.getWritableDatabase();
        String dbString=" ";
        Log.i("msg", "ENTERED DATABSETOSTRING");
        String query ="SELECT * FROM "+table+";";

        Cursor c=db.rawQuery(query, null);
        c.moveToFirst();


        while(!c.isAfterLast()) {
            Log.i("msg", "ENTERED WHILE LOOP");
            Log.i("msg", "#"+m+"#");
            Log.i("msg", "#"+c.getString(c.getColumnIndex("mname"))+"#");

            if (Objects.equals(c.getString(c.getColumnIndex("mname")), m)){
                Log.i("msg", "ENTERED if condition");
                dbString+=c.getString(c.getColumnIndex("mid"));
                dbString+="\n";
                dbString+=c.getString(c.getColumnIndex("mname"));
                dbString+="\n";
                dbString+=c.getString(c.getColumnIndex("nseats"));
                dbString+="\n";
                dbString+=c.getString(c.getColumnIndex("seats"));
                dbString+="\n";
            }
            c.moveToNext();
        }

        Log.i("msg", dbString);
        db.close();
        return dbString;
    }

     /*public String databasetostring(String m){
        SQLiteDatabase db=this.getWritableDatabase();
        String dbString=" ";
        Log.i("msg", "ENTERED DATABSETOSTRING");
        String query ="SELECT * FROM "+table+" WHERE mname="+"'"+m+"'";

        Cursor c=db.rawQuery(query, new String[] {table, col_mname});

        Log.i("msg", query);


                dbString+=c.getString(c.getColumnIndex("mid"));
                dbString+="\n";
                dbString+=c.getString(c.getColumnIndex("mname"));
                dbString+="\n";
                dbString+=c.getString(c.getColumnIndex("nseats"));
                dbString+="\n";
                dbString+=c.getString(c.getColumnIndex("seats"));
                dbString+="\n";



        Log.i("msg", dbString);
        db.close();
        return dbString;
    }*/
}
