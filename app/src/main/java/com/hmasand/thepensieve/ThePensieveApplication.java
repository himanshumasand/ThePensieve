package com.hmasand.thepensieve;

import android.app.Application;

import com.hmasand.thepensieve.models.Entry;
import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by hmasand on 1/8/16.
 */
public class ThePensieveApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Entry.class);
        Parse.enableLocalDatastore(this);
        Parse.initialize(this);
    }
}
