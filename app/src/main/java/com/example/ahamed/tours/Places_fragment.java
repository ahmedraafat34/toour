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


public class Places_fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Places_fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Places_fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Places_fragment newInstance(String param1, String param2) {
        Places_fragment fragment = new Places_fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String [] places;
        places = getResources().getStringArray(R.array.places);



        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }   View view =inflater.inflate(R.layout.fragment_places_fragment, container, false);
        setContentView(R.layout.fragment_places_fragment);
        ArrayList place = new ArrayList<>();
        place.add(new places("Cairo Tower","zamalek",R.drawable.towr ));
        place.add(new places("pyramids","Pyramids" ,R.drawable.pyr ));
        place.add(new places("egyption museum","DownTown" ,R.drawable.mus ));
        place.add(new places("Khan l Khalely","DownTown" ,R.drawable.kham ));
        place.add(new places("Mohamed Ali citadel","l Qalaa" ,R.drawable.cita));
        place.add(new places("Moez Street","gamalya" ,R.drawable.moz ));
        placesAdapter<places> placesAdapter;
        placesAdapter= new placesAdapter<places>(this,R.layout.list_places, place);
        ListView list = view.findViewById(R.id.listplace);
        list.setAdapter(placesAdapter);

        // Inflate the layout for this fragment
        return view;
    }

    private void setContentView(int fragment_places_fragment) {
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
