package com.example.harkkatyo;

import java.util.ArrayList;

public class BattleStorage {
    private ArrayList<Lutemon> taistelu = new ArrayList<>();

    private static BattleStorage battleStorage = null;

    private BattleStorage() {
    }

    public static BattleStorage getInstance() {
        if (battleStorage == null) {
            battleStorage = new BattleStorage();
        }
        return battleStorage;
    }

    public ArrayList<Lutemon> getLutemons() {
        return taistelu;
    }

    public void addLutemon(Lutemon lutemon) {
        taistelu.add(lutemon);
    }

    public Lutemon getLutemonById(int id) {
        return taistelu.remove(id);
    }

    public void removeLutemon(Lutemon lutemon) {
        taistelu.remove(lutemon);
    }
}
