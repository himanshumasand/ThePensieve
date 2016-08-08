package com.hmasand.thepensieve.models;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by hmasand on 1/7/16.
 */

public class Entry {

    private DatabaseReference mDatabase;

    private String body;

    public Entry() {
        super();
    }

    public Entry(String body) {
        setBody(body);

        String date = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date());
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("entries").child(date).setValue("hello");
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

//    public static ArrayList<Entry> getAllEntries() {
//        final ArrayList<Entry> entries = new ArrayList<>();
//
//        ParseQuery<Entry> query = ParseQuery.getQuery(Entry.class);
//        query.findInBackground(new FindCallback<Entry>() {
//            @Override
//            public void done(List<Entry> objects, ParseException e) {
//                if(e == null) {
//                    entries.addAll(objects);
//
//                }
//                else {
//                    Log.d("DEBUG", "Parse Exception: " + e);
//                }
//            }
//        });
//
//        return entries;
//    }
}
