package com.example.harkkatyo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LutemonViewHolder extends RecyclerView.ViewHolder{
    TextView lutemonName, lutemonAttack, lutemonDefence, lutemonExperience, lutemonHealth;
    ImageView lutemonImage;

    public LutemonViewHolder(@NonNull View itemView){
        super(itemView);
        lutemonName = itemView.findViewById(R.id.LutemonName);
        lutemonAttack = itemView.findViewById(R.id.Attack);
        lutemonDefence = itemView.findViewById(R.id.Defence);
        lutemonExperience = itemView.findViewById(R.id.Experience);
        lutemonHealth = itemView.findViewById(R.id.Health);
        lutemonImage = itemView.findViewById(R.id.pictures);
    }

}
