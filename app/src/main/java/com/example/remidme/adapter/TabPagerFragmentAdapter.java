package com.example.remidme.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.remidme.Fragment.ExampleFragment;

public class TabPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "Tab1",
                "Напоминания",
                "Tab2"
        };
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return  tabs[position];
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return ExampleFragment.getInstance();
            case 1:
                return ExampleFragment.getInstance();
            case 2:
                return ExampleFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
