package com.example.harkkatyo;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BattleHolder extends RecyclerView.ViewHolder {
    public TextView lmonName;
    public Button moveCombat;
    public ImageView lmonImage;


    public BattleHolder(@NonNull View itemView) {
        super(itemView);
        lmonName = itemView.findViewById(R.id.LutemonName);
        moveCombat = itemView.findViewById(R.id.moveArena);
        lmonImage = itemView.findViewById(R.id.pictures);
    }
}
