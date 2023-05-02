package com.example.harkkatyo;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LutemonHomeHolder extends RecyclerView.ViewHolder {
    public TextView lutemonName;
    public Button moveBattle;
    public ImageView lutemonImage;


    public LutemonHomeHolder(@NonNull View itemView) {
        super(itemView);
        lutemonName = itemView.findViewById(R.id.LutemonName);
        moveBattle = itemView.findViewById(R.id.moveBattle);
        lutemonImage = itemView.findViewById(R.id.pictures);
    }
}

