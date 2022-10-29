package com.hijraotji.fragmentlayout_f55121051;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.hijraotji.FragmentHome;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.hijraotji.FragmentAccount;
import com.hijraotji.FragmentExplore;
import com.hijraotji.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout_id);
        appBarLayout = (AppBarLayout) findViewById(R.id.appBar_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        //Adding Fragment
        adapter.AddFragment(new FragmentHome(), "Home");
        adapter.AddFragment(new FragmentExplore(), "Explore");
        adapter.AddFragment(new FragmentAccount(), "Account");
        //Adding Adapter
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}