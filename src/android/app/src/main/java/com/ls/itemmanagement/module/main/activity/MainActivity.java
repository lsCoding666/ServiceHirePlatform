package com.ls.itemmanagement.module.main.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ls.itemmanagement.R;
import com.ls.itemmanagement.base.BaseActivity;
import com.ls.itemmanagement.base.BasePresenter;
import com.ls.itemmanagement.module.main.adapter.MainViewPagerAdapter;
import com.ls.itemmanagement.module.main.listener.MainBnvListener;
import com.ls.itemmanagement.module.main.listener.MainVpListener;

import butterknife.BindView;

public class MainActivity extends BaseActivity {
    @BindView(R.id.vp_main)
    ViewPager mVpMain;
    @BindView(R.id.bnv_main)
    BottomNavigationView mBnvMain;

    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        initViewPager();
        initListeners();
    }

    private void initViewPager() {
        MainViewPagerAdapter adapter = new MainViewPagerAdapter(getSupportFragmentManager());
        mVpMain.setOffscreenPageLimit(2);
        mVpMain.setAdapter(adapter);
    }


    private void initListeners() {
        MainBnvListener bnvListener = new MainBnvListener(mVpMain);
        MainVpListener vpListener = new MainVpListener(mBnvMain);
        mVpMain.addOnPageChangeListener(vpListener);
        mBnvMain.setOnNavigationItemSelectedListener(bnvListener);
    }

    @Override
    protected void initData() {

    }


    @Override
    public void initStatusBar() {

    }
}