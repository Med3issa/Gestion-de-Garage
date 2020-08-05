package com.example.gestiondegarage.doc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.gestiondegarage.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Leasing extends Fragment {
    private ListView list;

    public Leasing() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_leasing, container, false);
        list = view.findViewById(R.id.leasing_list);


        ArrayList<Doc_item> values= new ArrayList();
        values.add(new Doc_item("Polo","12/10/2020"));
        values.add(new Doc_item("Citroen","12/10/2020"));
        values.add(new Doc_item("Kia","12/10/2020"));



        Doc_item_adapter adapter=new Doc_item_adapter(getContext(),R.layout.doc_item,values);
        list.setAdapter(adapter);

        return view;
    }
}
