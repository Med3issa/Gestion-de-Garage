package com.example.gestiondegarage;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.gestiondegarage.car.CarList;
import com.example.gestiondegarage.cur.Curatif;
import com.example.gestiondegarage.doc.Doclist;
import com.example.gestiondegarage.prev.PrevList;


public class MyCarAdapter extends FragmentPagerAdapter{

    public MyCarAdapter(@NonNull FragmentManager fm) {
        super(fm,FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: CarList cars= new CarList();
                return cars;
            case 1:PrevList prev =new PrevList();
            return prev;
            case 2 :
                Doclist doc= new Doclist();
            return doc;
            case 3:
                Curatif cur = new Curatif();
                return cur;

            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
