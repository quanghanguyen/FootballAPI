package com.example.footballapi.BL;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapterBL extends FragmentPagerAdapter {

    private final List<Fragment> lstFragmentBL = new ArrayList<>();
    private final List<String> lstTitleBL = new ArrayList<>();

    public ViewPagerAdapterBL(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return lstFragmentBL.get(position);
    }

    @Override
    public int getCount() {
        return lstTitleBL.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return lstTitleBL.get(position);
    }

    public void AddFragmentBL (Fragment fragment, String title) {
        lstFragmentBL.add(fragment);
        lstTitleBL.add(title);
    }
}
