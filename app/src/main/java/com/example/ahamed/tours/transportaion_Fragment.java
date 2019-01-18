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


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link transportaion_Fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link transportaion_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class transportaion_Fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public transportaion_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment transportaion_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static transportaion_Fragment newInstance(String param1, String param2) {
        transportaion_Fragment fragment = new transportaion_Fragment();
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

String[] transport;

transport = getResources().getStringArray(R.array.transport);


        View view =inflater.inflate(R.layout.fragment_transportaion_, container, false);
        setContentView(R.layout.fragment_transportaion_);
        ArrayList<trasnsport> trans = new ArrayList<>();
        trans.add(new trasnsport("Uper","Mobile Application",R.drawable.ubr));
        trans.add(new trasnsport("Careem","Mobile Application" ,R.drawable.carm ));
        trans.add(new trasnsport("Metro","every Main Street" ,R.drawable.mtro ));
        trans.add(new trasnsport("Train","Giza" ,R.drawable.trai ));
        trans.add(new trasnsport("Swvl","Mobile Application" ,R.drawable.swvl));
        trans.add(new trasnsport("taxi","every where" ,R.drawable.tax ));




        TrasportAdapter<trasnsport> trasportAdapters;
        trasportAdapters= new TrasportAdapter<trasnsport>(this,R.layout.list_transport, trans);
        ListView listView = view.findViewById(R.id.listtrans);
        listView.setAdapter(trasportAdapters);

        // Inflate the layout for this fragment
        return view;











    }

    private void setContentView(int fragment_transportaion_) {
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
