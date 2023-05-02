package com.example.harkkatyo;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LutemonCheckAdapter extends RecyclerView.Adapter<LutemonCheckHolder> {

    private Context context;
    private ArrayList<Lutemon> lutemons = new ArrayList<>();


    public LutemonCheckAdapter(Context context, ArrayList<Lutemon> lutemons) {
        this.context = context;
        this.lutemons = new ArrayList<>(lutemons);
    }

    @NonNull
    @Override
    public LutemonCheckHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LutemonCheckHolder(LayoutInflater.from(context).inflate(R.layout.lutemon_check, parent, false));
    }

    public void onBindViewHolder(@NonNull LutemonCheckHolder holder, int position) {
        Lutemon lutemon = lutemons.get(position);
        holder.lutemonName.setText(lutemon.getName() + " (" + lutemon.getColor() + ")");
        holder.lutemonImage.setImageResource(lutemons.get(position).getImage());
        holder.moveBattle.setOnClickListener(View -> {
            int pos = holder.getAdapterPosition();
            BattleStorage.getInstance().addLutemon(lutemon);
            HomeStorage.getInstance().removeLutemon(lutemon);
        });
        holder.moveHome.setOnClickListener(View -> {
            int pos = holder.getAdapterPosition();
            HomeStorage.getInstance().addLutemon(lutemon);
            BattleStorage.getInstance().removeLutemon(lutemon);
        });
    }
    @Override
    public int getItemCount(){
        return lutemons.size();
    }
}
