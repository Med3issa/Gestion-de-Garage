package com.example.gestiondegarage.prev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.gestiondegarage.HomeActivity;
import com.example.gestiondegarage.R;
import com.google.android.material.tabs.TabLayout;

public class Preventif extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    Button btnservice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preventif);

        tabLayout = findViewById(R.id.mytablayout1);
        viewPager = findViewById(R.id.vp1);
        btnservice = findViewById(R.id.btnservice);

        btnservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Preventif.this, PrevList.class);
                startActivity(intent);
            }
        });


        tabLayout.addTab(tabLayout.newTab().setText("Boujie"));
        tabLayout.addTab(tabLayout.newTab().setText("Pneu"));
        tabLayout.addTab(tabLayout.newTab().setText("Chaine"));
        tabLayout.addTab(tabLayout.newTab().setText("Filtre"));
        tabLayout.addTab(tabLayout.newTab().setText("Vidange"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);

        PrevAdapter adapter = new PrevAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }


        });
    }
}
