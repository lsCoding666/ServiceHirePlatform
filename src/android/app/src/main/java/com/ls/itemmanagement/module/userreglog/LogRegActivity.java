package com.ls.itemmanagement.module.userreglog;

import android.Manifest;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.gyf.immersionbar.ImmersionBar;
import com.ls.itemmanagement.R;
import com.ls.itemmanagement.base.BaseActivity;
import com.ls.itemmanagement.base.BasePresenter;
import com.ls.itemmanagement.module.userreglog.adapter.IndentFragmentAdapter;
import com.ls.itemmanagement.util.PermissionTool.PermissionHelper;
import com.ls.itemmanagement.util.PermissionTool.PermissionInterface;

import java.util.ArrayList;
import java.util.List;

public class LogRegActivity extends BaseActivity implements View.OnClickListener, PermissionInterface {
    private RadioButton login;
    private RadioButton reg;
    private RadioGroup rGroup;
    private FragmentManager manager;
    private FragmentTransaction transaction;
    private Fragment fraLogin;
    private Fragment frareg;
    private PermissionHelper permissionHelper;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;


    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_user_main;
    }

    @Override
    protected void initView() {
        permissionHelper = new PermissionHelper(this, this);
        if (Build.VERSION.SDK_INT >= 23) {
            String permissions[] = {Manifest.permission.CAMERA,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION};
            ActivityCompat.requestPermissions(this,permissions,1);
        }
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
        initStatusBar();
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        initViewPager();
    }

    @Override
    protected void initData() {

    }

    private void initViewPager(){
        //????????????????????????
        mTabLayout = (TabLayout) findViewById(R.id.tabs);
        List<String> titles = new ArrayList<>();
        titles.add("??????");
        titles.add("??????");

        //?????????????????????
        for (int i = 0; i < titles.size(); i++) {
            mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(i)));
        }

        List<androidx.fragment.app.Fragment> fragments = new ArrayList<>();
        fragments.add(new FragmentLogin());
        fragments.add(new FragmentRegister());
        IndentFragmentAdapter mFragmentAdapteradapter =
                new IndentFragmentAdapter(getSupportFragmentManager(), fragments, titles);

        //???ViewPager???????????????(???????????????)
        mViewPager.setAdapter(mFragmentAdapteradapter);
        //???TabLayout???ViewPager???????????????
        mTabLayout.setupWithViewPager(mViewPager);
        //???TabLayout???????????????
        mTabLayout.setTabsFromPagerAdapter(mFragmentAdapteradapter);

    }

    @Override
    public void onClick(View view) {

    }
    private void hideFragment(FragmentTransaction transaction) {
        if (fraLogin != null) {
            //transaction.hide(f1);????????????????????????????????????????????????????????????????????????
            transaction.remove(fraLogin);
        }
        if (frareg != null) {
            //transaction.hide(f2);
            transaction.remove(frareg);
        }
    }

    @Override
    public void requestPermissionsSuccess(int callBackCode) {

    }

    @Override
    public void requestPermissionsFail(int callBackCode) {
        Toast.makeText(this, "????????????", Toast.LENGTH_SHORT).show(); // ????????????
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        permissionHelper.requestPermissionsResult(requestCode, permissions, grantResults);
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void initStatusBar() {
        ImmersionBar.with(this)
                .statusBarColor(R.color.colorPrimary)
                .statusBarDarkFont(false)
                .fitsSystemWindows(true)  //?????????????????????????????????????????????????????????????????????????????????
                .init();
    }
}

