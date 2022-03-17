package com.example.footballapi.PL;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.footballapi.R;
import com.google.android.material.tabs.TabLayout;

public class Home2 extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter2 viewPagerAdapter2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        getSupportActionBar().hide();


        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPagerAdapter2 = new ViewPagerAdapter2(getSupportFragmentManager());

        // Add Fragment here

        viewPagerAdapter2.AddFragment(new FragmentTeam2(), "Team");
        viewPagerAdapter2.AddFragment(new FragmentChart2(), "Chart");


        viewPager.setAdapter(viewPagerAdapter2);
        tabLayout.setupWithViewPager(viewPager);
    }
}