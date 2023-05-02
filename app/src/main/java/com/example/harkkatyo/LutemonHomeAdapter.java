package com.example.harkkatyo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LutemonHomeAdapter extends RecyclerView.Adapter<LutemonHomeHolder> {

    private Context context;
    private ArrayList<Lutemon> lutemons = new ArrayList<>();


    public LutemonHomeAdapter(Context context, ArrayList<Lutemon> lutemons) {
        this.context = context;
        this.lutemons = new ArrayList<>(lutemons);
    }

    @NonNull
    @Override
    public LutemonHomeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LutemonHomeHolder(LayoutInflater.from(context).inflate(R.layout.lutemon_home, parent, false));
    }

    public void onBindViewHolder(@NonNull LutemonHomeHolder holder, int position) {
        Lutemon lutemon = lutemons.get(position);
        holder.lutemonName.setText(lutemon.getName() + " (" + lutemon.getColor() + ")");
        holder.lutemonImage.setImageResource(lutemons.get(position).getImage());
        holder.moveBattle.setOnClickListener(View -> {
            int pos = holder.getAdapterPosition();
            BattleStorage.getInstance().addLutemon(lutemons.get(pos));
            HomeStorage.getInstance().getLutemons().remove(pos);
            lutemons.remove(pos);
            notifyItemRemoved(pos);
            notifyDataSetChanged();
        });
    }
    @Override
    public int getItemCount(){
        return lutemons.size();
    }
}
