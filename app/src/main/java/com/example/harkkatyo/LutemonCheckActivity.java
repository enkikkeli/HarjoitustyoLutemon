package com.example.harkkatyo;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class LutemonCheckActivity extends AppCompatActivity {

    private LutemonStorage lutemonStorage;
    private RecyclerView recyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_lutemons);

        lutemonStorage = LutemonStorage.getInstance();

        recyclerView2 = findViewById(R.id.rv_LutemonCheck);

        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        recyclerView2.setAdapter(new LutemonCheckAdapter(getApplicationContext(), lutemonStorage.getLutemons()));
    }
}
