package com.example.ebooking.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.ebooking.BusActivity;
import com.example.ebooking.EventActivity;
import com.example.ebooking.HotelActivity;
import com.example.ebooking.R;
import com.example.ebooking.RestoActivity;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position){
            case 0:
                BusActivity bus = new BusActivity();
                return bus;
            case 1:
                HotelActivity hotel = new HotelActivity();
                return hotel;
            case 2:
                RestoActivity resto = new RestoActivity();
                return resto;
            case 3:
                EventActivity event = new EventActivity();
                return event;
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "Bus";
            case 1:
                return "Hotel";
            case 2:
                return "Resto";
            case 3:
                return "Event";
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 4;
    }
}