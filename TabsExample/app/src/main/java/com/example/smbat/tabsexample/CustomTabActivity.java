package com.example.smbat.tabsexample;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class CustomTabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_tab);
        final TabLayout mTabLayout = findViewById(R.id.tab_layout);
        final ViewPager mViewPager = findViewById(R.id.view_slider);

        final List<GirlModel> list = new ArrayList<>();
        list.add(new GirlModel(R.drawable.ksenia1, ""));
        list.add(new GirlModel(R.drawable.ksenia2, ""));
        list.add(new GirlModel(R.drawable.ksenia3, ""));
        list.add(new GirlModel(R.drawable.ksenia4, ""));
        final CustomViewPagerAdapter adapter =
                new CustomViewPagerAdapter(list, this);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager, true);
    }

}
