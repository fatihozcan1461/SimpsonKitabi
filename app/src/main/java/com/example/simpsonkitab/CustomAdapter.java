package com.example.simpsonkitab;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Simpson>{

    private ArrayList<Simpson> simpsons;
    private Activity context;

    public CustomAdapter(ArrayList<Simpson> simpsons, Activity context){
        super(context,R.layout.customview,simpsons);
        this.simpsons = simpsons;
        this.context  = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        View customView = layoutInflater.inflate( R.layout.customview,null,true );

        TextView nameView = customView.findViewById( R.id.textView_custom );
        nameView.setText( simpsons.get( position ).getName() );
        return customView;
    }
}
