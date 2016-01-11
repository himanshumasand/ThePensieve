package com.hmasand.thepensieve.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.hmasand.thepensieve.R;
import com.hmasand.thepensieve.models.Entry;

import java.util.List;

/**
 * Created by hmasand on 1/7/16.
 */
public class EntriesArrayAdapter extends ArrayAdapter<Entry> {

    private static class ViewHolder {
        TextView body;
    }

    public EntriesArrayAdapter(Context context, List<Entry> entries) {
        super(context, 0, entries);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final ViewHolder viewHolder;

        if(convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_dayview, parent, false);

            viewHolder.body = (TextView) convertView.findViewById(R.id.tvBody);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        final Entry entry = getItem(position);

        viewHolder.body.setText(entry.getBody());

        return convertView;
    }
}
