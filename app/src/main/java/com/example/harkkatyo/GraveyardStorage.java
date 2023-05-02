package com.example.harkkatyo;

import java.util.ArrayList;

public class GraveyardStorage {
    private ArrayList<Lutemon> yard = new ArrayList<>();

    private static GraveyardStorage graveyardStorage = null;

    private GraveyardStorage() {
    }

    public static GraveyardStorage getInstance() {
        if (graveyardStorage == null) {
            graveyardStorage = new GraveyardStorage();
        }
        return graveyardStorage;
    }

    public ArrayList<Lutemon> getLutemons() {
        return yard;
    }

    public void addLutemon(Lutemon lutemon) {
        yard.add(lutemon);
    }

    public Lutemon getLutemonById(int id) {
        return yard.remove(id);
    }

    public void removeLutemon(Lutemon lutemon) {
        yard.remove(lutemon);
    }
}
