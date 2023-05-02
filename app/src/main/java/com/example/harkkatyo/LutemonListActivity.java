package com.example.harkkatyo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;



public class LutemonListActivity extends AppCompatActivity {

    private LutemonStorage lutemonStorage;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_lutemons);

        lutemonStorage = LutemonStorage.getInstance();

        recyclerView = findViewById(R.id.rv_LutemonList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new LutemonListAdapter(getApplicationContext(), lutemonStorage.getLutemons()));
    }
}