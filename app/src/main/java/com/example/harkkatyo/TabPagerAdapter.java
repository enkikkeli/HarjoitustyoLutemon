package com.example.harkkatyo;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.harkkatyo.Fragments.Home;
import com.example.harkkatyo.Fragments.Graveyard;
import com.example.harkkatyo.Fragments.Battle;

public class TabPagerAdapter extends FragmentStateAdapter {
    public TabPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Home();
            case 1:
                return new Battle();
            case 2:
                return new Graveyard();

            default:
                return new Home();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
