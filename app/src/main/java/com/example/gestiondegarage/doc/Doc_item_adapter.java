package com.example.gestiondegarage.doc;

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

public class Doc_item_adapter  extends ArrayAdapter<Doc_item> {
    Context context;
    int resource;

    public Doc_item_adapter(@NonNull Context context, int resource, ArrayList<Doc_item> objects) {
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



        Doc_item doc =  getItem(position);
        text1.setText(doc.getName());
        text3.setText(doc.getDate());




        return convertView;
    }

}
