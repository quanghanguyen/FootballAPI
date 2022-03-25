package com.example.footballapi.SA;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.footballapi.BL.FragmentChartBL;
import com.example.footballapi.BL.FragmentTeamBL;
import com.example.footballapi.R;
import com.google.android.material.tabs.TabLayout;

public class SAHomeActivity extends AppCompatActivity {

    private TabLayout tlSA;
    private ViewPager vpSA;
    private ViewPagerAdapterSA viewPagerAdapterSA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sahome);
        getSupportActionBar().hide();

        tlSA = (TabLayout) findViewById(R.id.tlSA);
        vpSA = (ViewPager) findViewById(R.id.vpSA);
        viewPagerAdapterSA = new ViewPagerAdapterSA(getSupportFragmentManager());

        //Add Fragment

        viewPagerAdapterSA.AddFragmentSA(new FragmentTeamSA(), "Team");
        viewPagerAdapterSA.AddFragmentSA(new FragmentChartSA(), "Chart");
        vpSA.setAdapter(viewPagerAdapterSA);
        tlSA.setupWithViewPager(vpSA);





    }
}