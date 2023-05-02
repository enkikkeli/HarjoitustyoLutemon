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

public class BattleAdapter extends RecyclerView.Adapter<BattleHolder> {

    private Context context;
    private ArrayList<Lutemon> lutemons = new ArrayList<>();


    public BattleAdapter(Context context, ArrayList<Lutemon> lutemons) {
        this.context = context;
        this.lutemons = new ArrayList<>(lutemons);
    }

    @NonNull
    @Override
    public BattleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BattleHolder(LayoutInflater.from(context).inflate(R.layout.lutemon_inbattle, parent, false));
    }

    public void onBindViewHolder(@NonNull BattleHolder holder, int position) {
        Lutemon lutemon = lutemons.get(position);
        holder.lmonName.setText(lutemon.getName() + " (" + lutemon.getColor() + ")");
        holder.lmonImage.setImageResource(lutemons.get(position).getImage());
        holder.setIsRecyclable(false);
        holder.moveCombat.setOnClickListener(View -> {
            int pos = holder.getAdapterPosition();
            CombatStorage.getInstance().addLutemon(lutemon);
        });
    }
    @Override
    public int getItemCount(){
        return lutemons.size();
    }
}
