package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(@NonNull Context context,  @NonNull List<Earthquake> objects) {
        super(context, 0, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false
            );
        }

        Earthquake current = getItem(position);

        TextView magnitudeView = listItemView.findViewById(R.id.magnitude);
        magnitudeView.setText(current.getmMagnitude());

        TextView locationView = listItemView.findViewById(R.id.location);
        locationView.setText(current.getmLocation());

        TextView dateView = listItemView.findViewById(R.id.date);
        dateView.setText(current.getmDate());

        return listItemView;
    }
}
