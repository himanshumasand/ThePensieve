package com.hmasand.thepensieve.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.hmasand.thepensieve.R;
import com.hmasand.thepensieve.adapters.EntriesArrayAdapter;
import com.hmasand.thepensieve.models.Entry;

import java.util.ArrayList;

/**
 * Created by hmasand on 1/7/16.
 */
public class DayViewFragment extends Fragment {

    private ArrayList<Entry> mEntriesArray;
    private EntriesArrayAdapter mEntriesAdapter;
    private ListView mLvEntries;

    private View fragmentView;

    public DayViewFragment() {}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        fragmentView = inflater.inflate(R.layout.fragment_dayview, container, false);

        setupViewObjects();
        populateEntries();

        return fragmentView;
    }

    private void setupViewObjects() {
        mLvEntries = (ListView) fragmentView.findViewById(R.id.lvEntries);
        mEntriesArray = new ArrayList<>();
        mEntriesAdapter = new EntriesArrayAdapter(getActivity(), mEntriesArray);
        mLvEntries.setAdapter(mEntriesAdapter);
    }

    private void populateEntries() {
//        ParseQuery<Entry> query = ParseQuery.getQuery(Entry.class);
//        query.findInBackground(new FindCallback<Entry>() {
//            @Override
//            public void done(List<Entry> objects, ParseException e) {
//                if (e == null) {
//                    mEntriesArray.addAll(objects);
//                    mEntriesAdapter.notifyDataSetChanged();
//
//                } else {
//                    Log.d("DEBUG", "Parse Exception: " + e);
//                }
//            }
//        });
    }

}
