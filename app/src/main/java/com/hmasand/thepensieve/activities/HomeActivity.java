package com.hmasand.thepensieve.activities;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hmasand.thepensieve.R;
import com.hmasand.thepensieve.fragments.DayViewFragment;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);

        setupFragment();
    }

    private void setupFragment() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fl_fragment, new DayViewFragment());
        ft.commit();
    }

}

