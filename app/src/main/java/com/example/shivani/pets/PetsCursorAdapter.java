package com.example.shivani.pets;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

/**
 * Created by shivani on 7/19/2017.
 */

public class PetsCursorAdapter extends CursorAdapter{
    public PetsCursorAdapter(Context context, Cursor c) {
        super(context, c,0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView nameView=(TextView) view.findViewById(R.id.name);
        TextView breedView=(TextView) view.findViewById(R.id.breed);
        String name=cursor.getString(cursor.getColumnIndex("name"));
        String breed=cursor.getString(cursor.getColumnIndex("breed"));
        nameView.setText(name);
        breedView.setText(breed);

    }
}
