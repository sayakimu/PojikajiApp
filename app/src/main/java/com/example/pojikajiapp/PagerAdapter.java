package com.example.pojikajiapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PagerAdapter extends FragmentStateAdapter {

    public PagerAdapter(@NonNull FragmentActivity fragmentActivity){super(fragmentActivity);}

    @NonNull
    @Override
    public Fragment createFragment(int position){
        ColorSelectState state = ColorSelectState.values()[position];
        return ColorSelectFragment.newInstance(state);
    }

    @Override
    public int getItemCount(){ return ColorSelectState.values().length;}

}
