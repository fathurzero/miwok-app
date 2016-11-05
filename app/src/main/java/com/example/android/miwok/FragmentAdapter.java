package com.example.android.miwok;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentAdapter extends FragmentPagerAdapter {

    public  FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
//
        switch (position) {
            case 0:
                return new ColorsFragment();
            case 1:
                return new FamilyFragment();
            case 2:
                return new NumbersFragment();
            default:
                return new PhrasesFragment();

        }

    }
    @Override
    public int getCount () {

        return 4;
    }

}