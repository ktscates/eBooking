package com.example.ebooking;

import android.content.Context;
import android.widget.ArrayAdapter;

public class OptionsArrayAdapter extends ArrayAdapter {

    private Context content;
    private String[] listOfOption;
    private String[] description;

    public OptionsArrayAdapter(Context content, int resource, String[] listOfOption, String[] description){
        super(content, resource);
        this.content = content;
        this.listOfOption = listOfOption;
        this.description = description;
    }

    @Override
    public Object getItem(int place){
        String options = listOfOption[place];
        String descriptions = description[place];
        return String.format("%s \n%s", options, descriptions);
    }

    @Override
    public int getCount(){
        return listOfOption.length;
    }
}
