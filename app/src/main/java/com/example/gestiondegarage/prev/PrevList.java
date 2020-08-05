package com.example.gestiondegarage.prev;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


import com.example.gestiondegarage.HomeActivity;
import com.example.gestiondegarage.MainActivity;
import com.example.gestiondegarage.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PrevList extends Fragment {
    LinearLayout l1, l2, l3, l4,l5;


    public PrevList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_prev_list, container, false);

        l1 = view.findViewById(R.id.l1);
        l1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent intent = new Intent(getContext(), Preventif.class);
                                      startActivity(intent);


                                  }
                              }

        );


        l2 = view.findViewById(R.id.l2);
        l2.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent intent = new Intent(getContext(), Preventif.class);
                                      startActivity(intent);


                                  }
                              }

        );
        l3= view.findViewById(R.id.l3);
        l3.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent intent = new Intent(getContext(), Preventif.class);
                                      startActivity(intent);


                                  }
                              }

        );
        l4= view.findViewById(R.id.l4);
        l4.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent intent = new Intent(getContext(), Preventif.class);
                                      startActivity(intent);


                                  }
                              }

        );

        l5= view.findViewById(R.id.l5);
        l5.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent intent = new Intent(getContext(), Preventif.class);
                                      startActivity(intent);


                                  }
                              }

        );
        return view;

    }
}
