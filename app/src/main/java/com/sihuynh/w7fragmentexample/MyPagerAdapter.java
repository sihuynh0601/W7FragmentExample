package com.sihuynh.w7fragmentexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by User on 22/10/2017.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    public static final int FRAGMENT_COUNT = 3;

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                //TODO: add fragment one
                return new OneFragment();
            case 1:
                //TODO :add fragment two
                return new TwoFragment();
            case 2:
                //TODO: add fragment three
                break;
            default:
                return null;
        }
        return null;
    }

    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                //TODO: add fragment one
                return "fragment one";
            case 1:
                //TODO :add fragment two
                return "fragmnet two";
            case 2:
                //TODO: add fragment three
                return "fragment 3";
            default:
                return "";

        }
    }

}
