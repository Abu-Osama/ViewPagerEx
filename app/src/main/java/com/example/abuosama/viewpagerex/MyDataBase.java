package com.example.abuosama.viewpagerex;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Abu Osama on 18-01-2017.
 */
//step create database class
public class MyDataBase {

    MyHelper myHelper;
    SQLiteDatabase sqLiteDatabase;//for dml operation

    public  MyDataBase(Context context){

        myHelper=new MyHelper(context,"tech.db",null,1);


    }

     public  void  open(){

         sqLiteDatabase=myHelper.getWritableDatabase();
     }

    public void insertStudent(String sname,String scourse){
        ContentValues contentValues=new ContentValues();
        contentValues.put("sname",sname);
        contentValues.put("scourse",scourse);
        sqLiteDatabase.insert("student",null,contentValues);



    }

    public Cursor queryStydent(){
        Cursor cursor=null;

        cursor=sqLiteDatabase.query("student",null,null,null,null,null,null);


        return cursor;
    }

    public  void close(){

        sqLiteDatabase.close();
    }

    //step 2: create a myhelper class extends SQLiteOpemHelper
    public class  MyHelper extends SQLiteOpenHelper{


        public MyHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            //step 3: create table
            sqLiteDatabase.execSQL("create table student(_id primary key,sname text,scourse text);");

        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        }
    }
}
