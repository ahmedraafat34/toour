package com.example.ahamed.tours;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.ahamed.tours.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Night_fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Night_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Night_fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Night_fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Night_fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Night_fragment newInstance(String param1, String param2) {
        Night_fragment fragment = new Night_fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        String[] night;
        night= getResources().getStringArray(R.array.nights);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_night_fragment , container, false);
        ArrayList<Night> night = new ArrayList<>();
        night.add(new Night("Nile","zamalek",R.drawable.nil ));
        night.add(new Night("SaintMark","zamalek" ,R.drawable.saintmark));
        night.add(new Night("Johnny's Pub","zamalek" ,R.drawable.kafi ));
        night.add(new Night("Sound & Light Show","Pyramids" ,R.drawable.sound ));
        night.add(new Night("UnderGround","maddi" ,R.drawable.disco ));
        night.add(new Night("La Pacha","Zamalek" ,R.drawable.lapacha));




        NightAdapter<Night> NightsAdapter;
        NightsAdapter= new NightAdapter<Night>(this,R.layout.list_night, night);

        ListView listView = view.findViewById(R.id.listnight);
        listView.setAdapter(NightsAdapter);
        return view;

    }


    // TODO: Rename method, update argument and hook method into UI event
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

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
