package com.example.harkkatyo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class LutemonHomeActivity extends AppCompatActivity {

    private LutemonStorage lutemonStorage;
    private RecyclerView recyclerView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_lutemons);

        lutemonStorage = LutemonStorage.getInstance();

        recyclerView3 = findViewById(R.id.rv_LutemonHome);

        recyclerView3.setLayoutManager(new LinearLayoutManager(this));
        recyclerView3.setAdapter(new LutemonCheckAdapter(getApplicationContext(), lutemonStorage.getLutemons()));

    }
}
