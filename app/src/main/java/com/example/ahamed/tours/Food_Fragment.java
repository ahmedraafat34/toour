package com.example.ahamed.tours;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Food_Fragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    public static final String PRINCE = "Prince";

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Food_Fragment() {
    }

    public static Food_Fragment newInstance(String param1, String param2) {
        Food_Fragment fragment = new Food_Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] Food;
        Food = getResources().getStringArray(R.array.food);
    }

    private View setContentView(int fragment_food_) {
        return null;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        View view = inflater.inflate(R.layout.fragment_food_, container, false);
        setContentView(R.layout.fragment_food_);
        ArrayList<Food> food = new ArrayList<Food>();
        food.add(new Food("KFC", " Mall Of Arabia - HotLine  19019", 1775, R.drawable.kfa));
        food.add(new Food("Mc Donald's", "Mall Of Arabia - HotLine  19991", 1254, R.drawable.mac));
        food.add(new Food("Burger King", "Mall Of Arabia - HotLine 16977", 1548, R.drawable.burgrk));
        food.add(new Food("Cinnabon", "Mall Of Arabia - HotLine 16720", 1525, R.drawable.cinabon));
        food.add(new Food("Sobhy Kaber", "Shobra - Phone:0101 598 8898", 4857, R.drawable.sob7));
        food.add(new Food("Abo Tarek", "Qasr an Nile-Phone:02 25775935", 7859, R.drawable.abotrk));
        food.add(new Food(PRINCE, "Bab Al Louq-Phone:02 23937849", 2356, R.drawable.princ));
        food.trimToSize();

        FoodAdapter<Food> FoodsAdapter;
        FoodsAdapter = new FoodAdapter<Food>(this, R.layout.list_food, food);
        ListView listView = view.findViewById(R.id.listfood);
        listView.setAdapter(FoodsAdapter);
        return view;
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
