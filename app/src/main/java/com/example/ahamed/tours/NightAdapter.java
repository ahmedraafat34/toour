package com.example.ahamed.tours;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NightAdapter<N> extends ArrayAdapter<Night> {

    public NightAdapter(@NonNull Night_fragment context, int resource, @NonNull List<Night> objects) {
        super(context.getContext(), resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position , @NonNull View convertView , @NonNull ViewGroup parent){

        View list_night =convertView;
        if (list_night==null){
            list_night = LayoutInflater.from(getContext()).inflate(R.layout.list_night,parent,false);

        }
        Night pic = getItem(position);
        ImageView image = (ImageView)list_night.findViewById(R.id.img);
        image.setImageResource(pic.getPic());

        Night placname = getItem(position);
        TextView nam = (TextView)list_night.findViewById(R.id.locnam);
        nam.setText(placname.getPlacName());

        Night loc = getItem(position);
        TextView location=(TextView)list_night.findViewById(R.id.nigloc);
        location.setText(loc.getLocation());
    return list_night;
    }

}
