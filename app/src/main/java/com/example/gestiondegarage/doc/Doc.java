package com.example.gestiondegarage.doc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gestiondegarage.R;
import com.example.gestiondegarage.prev.PrevAdapter;
import com.example.gestiondegarage.prev.Preventif;
import com.google.android.material.tabs.TabLayout;

public class Doc extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    Button btndoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc);


        tabLayout = findViewById(R.id.mytablayout1);
        viewPager = findViewById(R.id.vp1);
        btndoc = findViewById(R.id.btndoc);


        btndoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Doc.this,Doclist.class);
                startActivity(intent);
            }
        });


        tabLayout.addTab(tabLayout.newTab().setText("Assurance"));
        tabLayout.addTab(tabLayout.newTab().setText("Leasing"));
        tabLayout.addTab(tabLayout.newTab().setText("Taxe"));
        tabLayout.addTab(tabLayout.newTab().setText("Visite"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);

        DocAdapter adapter = new DocAdapter(getSupportFragmentManager());
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
