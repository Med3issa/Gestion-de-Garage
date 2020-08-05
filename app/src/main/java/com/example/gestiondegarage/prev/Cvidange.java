package com.example.gestiondegarage.prev;

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
public class Cvidange extends Fragment {
    ListView list;

    public Cvidange() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_cvidange, container, false);
        list = view.findViewById(R.id.vid_list);


        ArrayList<Prev_item> values= new ArrayList();
        values.add(new Prev_item("D-max","12/10/2020","14/15/2020"));

        values.add(new Prev_item("kia","12/10/2020","14/15/2020"));

        Prev_Item_Adapter adapter=new Prev_Item_Adapter(getContext(),R.layout.prev_item,values);
        list.setAdapter(adapter);
        return view;
    }
}
