package com.example.footballapi.L1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapterL1 extends FragmentPagerAdapter {

    private final List<Fragment> lstFragmentL1 = new ArrayList<>();
    private final List<String> lstTitleL1 = new ArrayList<>();


    public ViewPagerAdapterL1(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return lstFragmentL1.get(position);
    }

    @Override
    public int getCount() {
        return lstTitleL1.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return lstTitleL1.get(position);
    }

    public void AddFragmentL1 (Fragment fragment, String title) {

        lstFragmentL1.add(fragment);
        lstTitleL1.add(title);

    }

}
