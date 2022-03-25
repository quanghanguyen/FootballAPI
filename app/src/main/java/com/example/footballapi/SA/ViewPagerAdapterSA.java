package com.example.footballapi.SA;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapterSA extends FragmentPagerAdapter {

    private final List<Fragment> lstFragmentSA = new ArrayList<>();
    private final List<String> lstTitle = new ArrayList<>();

    public ViewPagerAdapterSA(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return lstFragmentSA.get(position);
    }

    @Override
    public int getCount() {
        return lstTitle.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return lstTitle.get(position);
    }

    public void AddFragmentSA (Fragment fragment, String title)
    {
        lstFragmentSA.add(fragment);
        lstTitle.add(title);
    }
}
