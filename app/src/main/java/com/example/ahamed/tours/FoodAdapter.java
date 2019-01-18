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
import java.util.Objects;

public class FoodAdapter<A> extends ArrayAdapter<Food> {


    public FoodAdapter(@NonNull Food_Fragment context, int resource, @NonNull List<Food> food) {
        super(context.getContext(), 0, food);

    }
    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        View list_food = convertView;
        if (list_food == null) {
            list_food = LayoutInflater.from(getContext()).inflate(R.layout.list_food, parent, false);
        }
        Food img = getItem(position);
        ImageView image = (ImageView) list_food.findViewById(R.id.Image);
        image.setImageResource(img.getImage());

        Food name = getItem(position);
        TextView nam = (TextView) list_food.findViewById(R.id.shopname);
        nam.setText(name.getShopName());

        Food loc = getItem(position);
        TextView location = (TextView) list_food.findViewById(R.id.location);
        location.setText(loc.getPlace());
        return list_food;
    }
}
