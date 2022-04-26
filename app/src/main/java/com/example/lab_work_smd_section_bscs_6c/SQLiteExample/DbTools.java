package com.example.lab_work_smd_section_bscs_6c.SQLiteExample;

import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObservable;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class DbTools extends SQLiteOpenHelper {
    public DbTools(@Nullable Context context) {
        super(context, "ContactsDB", null,1);
        Log.d("TA","data base created");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String Query = "CREATE TABLE CONTACT("
                +"_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                +"firstName Text,"
                +"secondName TEXT,"
                +"phoneNumber TEXT,"
                +"emailAddress TEXT,"
                +"homeAddress TEXT)";
        db.execSQL(Query);
    }
    public void AddContact(HashMap<String,String> contact){
        SQLiteDatabase db= getWritableDatabase();
        ContentValues contentValue = new ContentValues();
        contentValue.put("_id",contact.get("_id"));
        contentValue.put("firstName",contact.get("firstName"));
        contentValue.put("lastName",contact.get("lastName"));
        contentValue.put("homeAddress",contact.get("homeAddress"));
        contentValue.put("emailAddress",contact.get("emailAddress"));
        contentValue.put("phoneNumber",contact.get("phoneNumber"));


        long i=db.insert("CONTACTS",null,contentValue);
        if (i!=-1){
            Log.d("TAG","NEWCONTACT inserted");
        }
        else {
            Log.d("TAG","failed");
        }
//        db.close();


    }

    public ArrayList<HashMap<String, String>> getallContacts() {
        SQLiteDatabase db= getReadableDatabase();
        ArrayList<HashMap<String,String>> contactList= new ArrayList<HashMap<String,String>>();
        String Query= "SELECT * FROM CONTACTS";
        Cursor cursor= db.rawQuery(Query,null);
        if (cursor.moveToFirst()) {
        do {
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("firstName", cursor.getString(1));
            hashMap.put("secondName", cursor.getString(2));
            hashMap.put("phoneNumber", cursor.getString(3));
            hashMap.put("emailAddress", cursor.getString(4));
            hashMap.put("homeAddress", cursor.getString(5));
        }while (cursor.moveToNext());

        }
        return contactList;
        }

        public HashMap<String,String> getSingleContact(String id){
        SQLiteDatabase db = getReadableDatabase();
        HashMap<String,String> singleContact = new HashMap<String, String>();
        String Query = "SELECT @ FROM CONTACTS WHERE _id="+id;
        Cursor cursor= db.rawQuery(Query,null);
        if (cursor.moveToNext()){
            singleContact.put("_id",cursor.getString(0));
            singleContact.put("firstName",cursor.getString(1));
            singleContact.put("secondName",cursor.getString(2));
            singleContact.put("phoneNumber",cursor.getString(3));
            singleContact.put("emailAddress",cursor.getString(4));
            singleContact.put("homeAddress",cursor.getString(5));


        }
        return singleContact;
        }




    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
