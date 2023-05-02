package com.example.harkkatyo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LutemonStorage s = LutemonStorage.getInstance();
        context = MainActivity.this;
    }


    public void switchToAddLutemon(View view) {
        Intent intent = new Intent(this, AddLutemonActivity.class);
        startActivity(intent);
    }
    public void switchToLutemonList(View view){
        Intent intent = new Intent(this, LutemonListActivity.class);
        startActivity(intent);

    }
    public void switchToFragmentActivity(View view) {
        Intent intent = new Intent(this, FragmentActivity.class);
        startActivity(intent);
    }
    public void switchToBattleActivity(View view) {
        Intent intent = new Intent(this, BattleActivity.class);
        startActivity(intent);
    }
}