package com.example.gestiondegarage.doc;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;



public class DocAdapter extends FragmentPagerAdapter {


    public DocAdapter(@NonNull FragmentManager fm) {
        super(fm,FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch ( position){
            case 0 :
                Assurance assurance =new Assurance();
                return assurance;
            case 1: Leasing leasing=new Leasing();
                return  leasing;
            case 2 : Taxe taxe = new Taxe() ;
                return taxe ;
            case 3: Visite visite= new Visite() ;
                return visite;

            default: return  null;
        }
    }


    @Override
    public int getCount() {
        return 4;
    }
}
