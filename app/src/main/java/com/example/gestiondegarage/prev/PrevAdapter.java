package com.example.gestiondegarage.prev;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PrevAdapter extends FragmentPagerAdapter {


    public PrevAdapter(@NonNull FragmentManager fm) {
        super(fm,FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch ( position){
            case 0 :Cboujie boujie =new Cboujie();
                    return boujie;
            case 1: Cpneu pneu=new Cpneu();
                    return  pneu;
            case 2 : Cchaine chaine = new Cchaine() ;
                    return chaine ;
            case 3: Cfiltre filtre= new Cfiltre() ;
                    return filtre;
            case 4: Cvidange vidange = new Cvidange() ;
                    return vidange;
            default: return  null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
