package com.example.gestiondegarage.prev;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.gestiondegarage.R;

import java.util.ArrayList;
import java.util.List;

public class Prev_Item_Adapter extends ArrayAdapter<Prev_item> {
    Context context;
    int resource;

    public Prev_Item_Adapter(@NonNull Context context, int resource, ArrayList<Prev_item>  objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(resource,parent,false);
        TextView text1=convertView.findViewById(R.id.text1);

        TextView text3=convertView.findViewById(R.id.text3);

        TextView text5=convertView.findViewById(R.id.text5);

        Prev_item prev =  getItem(position);
        text1.setText(prev.getName());
        text3.setText(prev.getDate_c());

        text5.setText(prev.getDate_p());


        return convertView;
    }
}
