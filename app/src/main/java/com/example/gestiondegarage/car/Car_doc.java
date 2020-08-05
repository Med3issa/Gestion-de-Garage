package com.example.gestiondegarage.car;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gestiondegarage.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Car_doc extends Fragment {

    public Car_doc() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_car_doc, container, false);
    }
}
