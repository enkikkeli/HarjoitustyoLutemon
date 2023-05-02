package com.example.harkkatyo.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.harkkatyo.LutemonCheckAdapter;
import com.example.harkkatyo.R;
import com.example.harkkatyo.BattleStorage;

public class Battle extends Fragment {

    private BattleStorage battleStorage;
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.check_lutemons, container, false);
        recyclerView = view.findViewById(R.id.rv_LutemonCheck);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new LutemonCheckAdapter(getActivity().getApplicationContext(), BattleStorage.getInstance().getLutemons()));
        view.invalidate();
        return view;
    }
}