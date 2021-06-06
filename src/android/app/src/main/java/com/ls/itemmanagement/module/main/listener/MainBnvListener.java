package com.ls.itemmanagement.module.main.listener;


import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ls.itemmanagement.R;

public class MainBnvListener implements BottomNavigationView.OnNavigationItemSelectedListener {
    private ViewPager mViewPager;

    public MainBnvListener(ViewPager viewPager) {
        mViewPager = viewPager;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.navigation_project:
                mViewPager.setCurrentItem(0);
                return true;
            case R.id.navigation_user:
                mViewPager.setCurrentItem(1);
                return true;
            case R.id.navigation_schedule:
                mViewPager.setCurrentItem(2);
                return true;
            case R.id.navigation_mine:
                mViewPager.setCurrentItem(3);
                return true;
            default:
                break;
        }
        return false;
    }
}
