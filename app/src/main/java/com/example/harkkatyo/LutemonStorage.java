package com.example.harkkatyo;


import android.content.Context;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class LutemonStorage {

    private ArrayList<Lutemon> lutemons = new ArrayList<>();

    private static LutemonStorage lutemonStorage = null;

    private LutemonStorage() {
    }

    public static LutemonStorage getInstance() {
        if (lutemonStorage == null) {
            lutemonStorage = new LutemonStorage();
        }
        return lutemonStorage;
    }

    public ArrayList<Lutemon> getLutemons() {
        return lutemons;
    }

    public void addLutemon(Lutemon lutemon) {
        lutemons.add(lutemon);
    }

    public Lutemon getLutemonById(int id) {
        return lutemons.remove(id);
    }
    public void removeLutemon(Lutemon lutemon) {
        lutemons.remove(lutemon);
    }
}
