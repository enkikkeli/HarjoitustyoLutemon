package com.example.harkkatyo;

import java.util.ArrayList;

public class CombatStorage {
    private ArrayList<Lutemon> combat = new ArrayList<>();

    private static CombatStorage combatStorage = null;

    private CombatStorage() {
    }

    public static CombatStorage getInstance() {
        if (combatStorage == null) {
            combatStorage = new CombatStorage();
        }
        return combatStorage;
    }

    public ArrayList<Lutemon> getLutemons() {
        return combat;
    }

    public void addLutemon(Lutemon lutemon) {
        combat.add(lutemon);
    }

    public Lutemon getLutemonById(int id) {
        return combat.remove(id);
    }

    public void removeLutemon(Lutemon lutemon) {
        combat.remove(lutemon);
    }
}
