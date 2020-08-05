package com.example.gestiondegarage.doc;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.gestiondegarage.MainActivity;
import com.example.gestiondegarage.R;
import com.example.gestiondegarage.prev.Preventif;


public class Doclist extends Fragment {
    Button assurance;
    Button leasing;
    Button visite;
    Button taxe;


    public Doclist() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_doclist, container, false);


        assurance=view.findViewById(R.id.assurance);
        assurance.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent intent = new Intent(getContext(), Doc.class);
                                             startActivity(intent);


                                         }
                                     }

        );


        visite=view.findViewById(R.id.visite);
        visite.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent intent = new Intent(getContext(), Doc.class);
                                             startActivity(intent);


                                         }
                                     }

        );
        leasing=view.findViewById(R.id.leasing);
        leasing.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent intent = new Intent(getContext(), Doc.class);
                                             startActivity(intent);


                                         }
                                     }

        );


        taxe=view.findViewById(R.id.taxe);
        taxe.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent intent = new Intent(getContext(), Doc.class);
                                             startActivity(intent);


                                         }
                                     }

        );





        return view;
    }
}
