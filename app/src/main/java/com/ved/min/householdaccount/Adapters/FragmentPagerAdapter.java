package com.ved.min.householdaccount.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.ved.min.householdaccount.Fragments.ItemInputFragment;
import com.ved.min.householdaccount.Fragments.ItemListFragment;

public class FragmentPagerAdapter extends FragmentStatePagerAdapter {

    final int numOfFragments = 2;

    public FragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:{
                return new ItemInputFragment();
            }
            case 1:{
                return new ItemListFragment();
            }
        }
        return null;
    }

    @Override
    public int getCount() {
        return numOfFragments;
    }
}
