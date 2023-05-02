package com.example.harkkatyo;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

import com.example.harkkatyo.Fragments.Battle;
import com.example.harkkatyo.Fragments.Graveyard;
import com.example.harkkatyo.Fragments.Home;

public class FragmentActivity extends AppCompatActivity {

    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        fragment = new Home();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame, fragment)
                .commit();
    }

    public void changeToHome(View view) {
        fragment = new Home();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame, fragment)
                .commit();
    }

    public void changeToBattle(View view) {
        fragment = new Battle();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame, fragment)
                .commit();
    }

    public void changeToGraveyard(View view) {
        fragment = new Graveyard();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame, fragment)
                .commit();
    }
}
