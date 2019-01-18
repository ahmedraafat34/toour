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

public class placesAdapter<P> extends ArrayAdapter<places> {


    public placesAdapter(@NonNull Places_fragment context, int resource, @NonNull List<places> objects) {
        super(context.getContext(), resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {

        View list_places = convertView;
        if (list_places == null) {
            list_places = LayoutInflater.from(getContext()).inflate(R.layout.list_places, parent, false);

        }

        places plcimg = getItem(position);
        ImageView img = (ImageView) list_places.findViewById(R.id.plcimg);
        img.setImageResource(plcimg.getPlcimg());


        places plcnam = getItem(position);
        TextView nam = (TextView)list_places.findViewById(R.id.plcnam);
        nam.setText(plcnam.getPlcNam());


        places plcloc = getItem(position);
        TextView loc = (TextView)list_places.findViewById(R.id.plcloc);
        loc.setText(plcloc.getPlcloc());

return list_places;
    }


}
