package com.example.harkkatyo;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LutemonCheckHolder extends RecyclerView.ViewHolder {
    public TextView lutemonName;
    public Button moveHome;
    public Button moveBattle;
    public ImageView lutemonImage;


    public LutemonCheckHolder(@NonNull View itemView) {
        super(itemView);
        lutemonName = itemView.findViewById(R.id.LutemonName);
        moveHome = itemView.findViewById(R.id.moveHome);
        moveBattle = itemView.findViewById(R.id.moveBattle);
        lutemonImage = itemView.findViewById(R.id.pictures);
    }
}
