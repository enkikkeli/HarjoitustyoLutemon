package com.example.harkkatyo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BattleActivity extends AppCompatActivity {

    private BattleStorage battleStorage;
    private RecyclerView recyclerView3;
    private CombatStorage combatStorage = CombatStorage.getInstance();
    private ArrayList<Lutemon> lutemons = combatStorage.getLutemons();
    private GraveyardStorage graveyardStorage = GraveyardStorage.getInstance();
    private LutemonStorage lutemonStorage = LutemonStorage.getInstance();
    private ArrayList<Lutemon> lutemonss = lutemonStorage.getLutemons();
    private LutemonListAdapter lutemonListAdapter;
    public Button battleButton;
    private int amount1;
    private int amount2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lutemon_battle);

        battleStorage = BattleStorage.getInstance();

        recyclerView3 = findViewById(R.id.rvBattle);

        recyclerView3.setLayoutManager(new LinearLayoutManager(this));
        recyclerView3.setAdapter(new BattleAdapter(getApplicationContext(), battleStorage.getLutemons()));


        battleButton = findViewById(R.id.btnBattle);

        battleButton.setOnClickListener(View -> {
            TextView battleLog = findViewById(R.id.battleLog);

            Lutemon first = lutemons.get(0);
            Lutemon second = lutemons.get(1);
            battleLog.append("1: " + first.getColor() + "(" + first.getName() + ") att: " + first.getAttack() + "; def: " + first.getDefence() + "; health: " + first.getHealth() + "/" + first.getMaxHealth() + "\n");
            battleLog.append("2: " + second.getColor() + "(" + second.getName() + ") att: " + second.getAttack() + "; def: " + second.getDefence() + "; health: " + second.getHealth() + "/" + second.getMaxHealth() + "\n");

            while (first.getHealth() > 0 && second.getHealth() > 0) {
                battleLog.append(first.getColor() + "(" + first.getName() + ") hyökkää kohti " + second.getName() + ":a\n");
                second.setHealth(second.getHealth() - (first.getAttack() - second.getDefence()));
                battleLog.append("1: " + first.getColor() + "(" + first.getName() + ") att: " + first.getAttack() + "; def: " + first.getDefence() + "; health: " + first.getHealth() + "/" + first.getMaxHealth() + "\n");
                battleLog.append("2: " + second.getColor() + "(" + second.getName() + ") att: " + second.getAttack() + "; def: " + second.getDefence() + "; health: " + second.getHealth() + "/" + second.getMaxHealth() + "\n");
                if (second.getHealth() <= 0) {
                    battleLog.append(second.getColor() + "(" + second.getName() + ") kuolee\n");
                    graveyardStorage.addLutemon(second);
                    battleStorage.getInstance().removeLutemon(second);
                    break;
                }
                battleLog.append(second.getColor() + "(" + second.getName() + ") hyökkää kohti " + first.getName() + ":a\n");
                first.setHealth(first.getHealth() - (second.getAttack() - first.getDefence()));
                if (first.getHealth() <= 0) {
                    battleLog.append(first.getColor() + "(" + first.getName() + ") kuolee\n");
                    graveyardStorage.addLutemon(first);
                    battleStorage.getInstance().removeLutemon(first);
                    lutemonss.remove(first);
                    break;
                }


            }


            battleLog.append("Taistelu päättyy.");
            combatStorage.getInstance().removeLutemon(first);
            combatStorage.getInstance().removeLutemon(second);


        });
    }
}
