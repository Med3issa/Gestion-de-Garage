package com.example.gestiondegarage.car;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.gestiondegarage.R;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

/**
 * A simple {@link Fragment} subclass.
 */
public class CarList extends Fragment {
    private ListView list;
    public CarList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_car_list, container, false);

        list = view.findViewById(R.id.car_list);
        UpdateUI();

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "mari7bé pos:"+position, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
      }



    private void UpdateUI() {
        Ion.with(getActivity())
                .load("https://garage-backend.herokuapp.com/car/all")
                .asJsonArray()
                .setCallback(new FutureCallback<JsonArray>() {
                    @Override
                    public void onCompleted(Exception e, JsonArray result) {
                        if(e!=null)
                            Toast.makeText(getActivity(), "Exception "+e.getMessage(), Toast.LENGTH_SHORT).show();
                        else
                        {
                            Gson gson = new Gson();
                            car_item[] tab = gson.fromJson(result.toString(),car_item[].class);

                            List_Car_Adapter adapter = new List_Car_Adapter(getActivity(),tab);
                            list.setAdapter(adapter);
                        }

                    }
                });
    }
}
