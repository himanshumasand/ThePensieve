package com.hmasand.thepensieve.models;

import android.util.Log;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import com.parse.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hmasand on 1/7/16.
 */
@ParseClassName("Entry")
public class Entry extends ParseObject{

    public Entry() {
        super();
    }

    public Entry(String body) {
        super();
        setBody(body);
    }

    public String getBody() {
        return getString("body");
    }

    public void setBody(String body) {
        put("body", body);
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
