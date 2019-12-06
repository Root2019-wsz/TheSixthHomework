package com.example.thesixthhomework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private List<Fragment> mFragmentList;
    private List<String> mTitleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initTitle();
        initFragment();
        mViewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager(), mFragmentList, mTitleList));
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private void initTitle() {
        mTitleList = new ArrayList<>();
        mTitleList.add("第一页");
        mTitleList.add("第二页");
        mTitleList.add("第三页");
        mTitleList.add("第四页");
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mTabLayout.addTab(mTabLayout.newTab().setText(mTitleList.get(0)));
        mTabLayout.addTab(mTabLayout.newTab().setText(mTitleList.get(1)));
        mTabLayout.addTab(mTabLayout.newTab().setText(mTitleList.get(2)));
        mTabLayout.addTab(mTabLayout.newTab().setText(mTitleList.get(3)));
    }

    private void initFragment() {
        mFragmentList = new ArrayList<>();
        mFragmentList.add(MyFragment.newInstance("第一个界面"));
        mFragmentList.add(MyFragment.newInstance("第二个界面"));
        mFragmentList.add(MyFragment.newInstance("第三个界面"));
        mFragmentList.add(MyFragment.newInstance("第四个界面"));
    }

    private void initView() {
        mTabLayout = (TabLayout)findViewById(R.id.tab_layout);
        mViewPager = (ViewPager)findViewById(R.id.view_pager);
    }
}
