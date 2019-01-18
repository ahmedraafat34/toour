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

public class TrasportAdapter<T> extends ArrayAdapter<trasnsport> {

    public TrasportAdapter(@NonNull transportaion_Fragment context, int resource, @NonNull List<trasnsport> objects) {
        super(context.getContext(), resource, objects);
    }
    @NonNull
    @Override
    public View getView (int position , @NonNull View convertView , @NonNull ViewGroup parent){

        View list_transport = convertView;
        if (list_transport==null){

            list_transport=LayoutInflater.from(getContext()).inflate(R.layout.list_transport , parent, false);
        }
        trasnsport transnam=getItem(position);
        TextView nam = (TextView)list_transport.findViewById(R.id.transnam);
        nam.setText(transnam.getTransNam());

        trasnsport trasloc=getItem(position);
        TextView loc=(TextView)list_transport.findViewById(R.id.transloc);
        loc.setText(trasloc.getTransloc());

        trasnsport transimg =getItem(position);
        ImageView img=(ImageView)list_transport.findViewById(R.id.transimg);
        img.setImageResource(transimg.getTransimg());
    return list_transport;
    }

}

