package com.example.ebooking;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyEventArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mEvents;
    private String[] mCuisines;

    public MyEventArrayAdapter(Context mContext, int resource, String[] mEvents) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mEvents = mEvents;
//        this.mCuisines = mCuisines;
    }

    @Override
    public Object getItem(int position) {
        String event = mEvents[position];
//        String cuisine = mCuisines[position];
        return String.format("%s \nServes great: %s", event);
    }

    @Override
    public int getCount() {
        return mEvents.length;
    }
}