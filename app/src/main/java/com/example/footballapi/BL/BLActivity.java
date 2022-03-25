package com.example.footballapi.BL;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.footballapi.R;
import com.google.android.material.tabs.TabLayout;

public class BLActivity extends AppCompatActivity {

    private TabLayout tlBL;
    private ViewPager vpBL;
    private ViewPagerAdapterBL viewPagerAdapterBL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blactivity);
        getSupportActionBar().hide();

        tlBL = (TabLayout) findViewById(R.id.tlBL);
        vpBL = (ViewPager) findViewById(R.id.vpBL);
        viewPagerAdapterBL = new ViewPagerAdapterBL(getSupportFragmentManager());

        //Add Fragment
        viewPagerAdapterBL.AddFragmentBL(new FragmentTeamBL(), "Team");
        viewPagerAdapterBL.AddFragmentBL(new FragmentChartBL(), "Chart");
        vpBL.setAdapter(viewPagerAdapterBL);
        tlBL.setupWithViewPager(vpBL);

    }
}