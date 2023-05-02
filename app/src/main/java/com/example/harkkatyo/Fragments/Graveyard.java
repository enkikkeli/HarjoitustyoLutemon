package com.example.harkkatyo.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.harkkatyo.GraveyardStorage;
import com.example.harkkatyo.Lutemon;
import com.example.harkkatyo.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Graveyard#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Graveyard extends Fragment {
    GraveyardStorage graveyardStorage = GraveyardStorage.getInstance();
    ArrayList<Lutemon> lutemons = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Graveyard() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Kuollut.
     */
    // TODO: Rename and change types and number of parameters
    public static Graveyard newInstance(String param1, String param2) {
        Graveyard fragment = new Graveyard();
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
        View view = inflater.inflate(R.layout.fragment_graveyard, container, false);
        TextView yard = view.findViewById(R.id.graveyard);
        lutemons = graveyardStorage.getLutemons();
        for (Lutemon lutemon : lutemons) {
            yard.append(lutemon.getName() + " (" + lutemon.getColor() + ")\n");
        }
        // Inflate the layout for this fragment
        return view;
    }


}

