package com.example.gestiondegarage.cur;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.example.gestiondegarage.R;
import com.example.gestiondegarage.car.car_item;

import java.util.ArrayList;
import java.util.Objects;

import static com.example.gestiondegarage.R.layout.cur_item1;

public class Cur_Adapter extends ArrayAdapter<Cur_item> {

    public Cur_Adapter(@NonNull Context context, ArrayList<Cur_item>   objects) {
        super(context, cur_item1, Objects.requireNonNull(objects));
    }


    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(cur_item1,parent,false);

//        xml -> data
        TextView name = convertView.findViewById(R.id.name);
        TextView price = convertView.findViewById(R.id.price);
        TextView label = convertView.findViewById(R.id.label);

        Cur_item item = getItem(position);

        name.setText(item.getName());
        price.setText(item.getPrice());
        label.setText(item.getLabel());

        return convertView;
    }
}
