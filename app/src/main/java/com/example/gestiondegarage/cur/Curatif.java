package com.example.gestiondegarage.cur;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ListView;

import com.example.gestiondegarage.R;

import java.util.ArrayList;

public class Curatif extends Fragment {
    private ListView list;
    public Curatif() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view =  inflater.inflate(R.layout.fragment_curatif, container, false);
        list = view.findViewById(R.id.cur_list);
        ArrayList<Cur_item>values= new ArrayList();
       values.add(new Cur_item("honda","50","lllllllllll"));
       values.add(new Cur_item("isuzu","50","mlkjhgfdrtyujb"));



       Cur_Adapter adapter=new Cur_Adapter(getActivity(),values );
        list.setAdapter(adapter);


        return view;


    }
}
