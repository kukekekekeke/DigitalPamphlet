package com.example.kumazawakento.digitalpamphlet;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MainFragmentPagerAdapter extends FragmentPagerAdapter {
    public MainFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                System.out.println("page0");
                return MainFragment.newInstance(android.R.color.holo_blue_bright);
            case 1:
                System.out.println("page1");
                return MainFragment.newInstance(android.R.color.holo_green_light);
            case 2:
                System.out.println("page2");
                return MainFragment.newInstance(android.R.color.holo_red_dark);
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "ページ" + (position + 1);
    }

}
