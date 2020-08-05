package com.example.gestiondegarage.car;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.gestiondegarage.R;

public class List_Car_Adapter extends ArrayAdapter<car_item> {
    public List_Car_Adapter(@NonNull Context context,  @NonNull car_item[] objects) {
        super(context, R.layout.sigle_item, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.sigle_item,parent,false);

//        xml -> data
        TextView name = convertView.findViewById(R.id.name);
        TextView num = convertView.findViewById(R.id.num);

        car_item item = getItem(position);

        name.setText(item.getName());
        num.setText(item.getMat());

        return convertView;
    }

}
