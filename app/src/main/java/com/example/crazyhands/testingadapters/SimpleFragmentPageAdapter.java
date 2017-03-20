package com.example.crazyhands.testingadapters;

/**
 * Created by crazyhands on 19/03/2017.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPageAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }
    private String tabTitles[] = new String[] { "All activities", "pool"};
    private Context context;
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ListOfAllCFragment();
        } else {
            return new ListOfPoolCFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return 2;
    }
}
