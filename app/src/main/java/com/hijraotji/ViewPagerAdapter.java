package com.hijraotji;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> FramentListTitles = new ArrayList<>();

    public ViewPagerAdapter (FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return FramentListTitles.size();
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @NonNull
    @Override
    public CharSequence getPageTitle(int position) {
        return FramentListTitles.get(position);
    }
    public void AddFragment(Fragment fragment, String Title) {
        fragmentList.add(fragment);
        FramentListTitles.add(Title);
    }

}
