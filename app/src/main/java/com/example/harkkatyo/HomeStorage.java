package com.example.harkkatyo;

import java.util.ArrayList;

public class HomeStorage {
    private ArrayList<Lutemon> koti = new ArrayList<>();

    private static HomeStorage homeStorage = null;

    private HomeStorage() {
    }

    public static HomeStorage getInstance() {
        if (homeStorage == null) {
            homeStorage = new HomeStorage();
        }
        return homeStorage;
    }

    public ArrayList<Lutemon> getLutemons() {
        return koti;
    }

    public void addLutemon(Lutemon lutemon) {
        koti.add(lutemon);
    }

    public Lutemon getLutemonById(int id) {
        return koti.remove(id);
    }

    public void removeLutemon(Lutemon lutemon) {
        koti.remove(lutemon);
    }
}
