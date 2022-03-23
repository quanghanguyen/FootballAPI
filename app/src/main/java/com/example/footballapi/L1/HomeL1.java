package com.example.footballapi.L1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.footballapi.PL.FragmentChart2;
import com.example.footballapi.R;
import com.google.android.material.tabs.TabLayout;

public class HomeL1 extends AppCompatActivity {

    private ViewPager vpL1;
    private TabLayout tlL1;
    private ViewPagerAdapterL1 viewPagerAdapterL1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_l1);
        getSupportActionBar().hide();

        tlL1 = (TabLayout) findViewById(R.id.tlL1);
        vpL1 = (ViewPager) findViewById(R.id.vpL1);
        viewPagerAdapterL1 = new ViewPagerAdapterL1(getSupportFragmentManager());

        //Add Fragment
        viewPagerAdapterL1.AddFragmentL1(new FragmentTeamL1(), "Team");
        viewPagerAdapterL1.AddFragmentL1(new FragmentChartL1(), "Chart");
        vpL1.setAdapter(viewPagerAdapterL1);
        tlL1.setupWithViewPager(vpL1);

    }
}