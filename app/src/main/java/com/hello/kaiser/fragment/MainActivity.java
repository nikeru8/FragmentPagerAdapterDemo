package com.hello.kaiser.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private CustomFragmentAdapter mAdapter;

    private TabLayout mTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initSet();
    }

    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mTab = (TabLayout) findViewById(R.id.view_tab);
    }

    private void initSet() {
        mTab.addTab(mTab.newTab().setText("第一頁"));
        mTab.addTab(mTab.newTab().setText("第二頁"));

        mAdapter = new CustomFragmentAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);
        mAdapter.setDataOne("你好第一頁");
        mAdapter.setDataTwo("歡迎光靈第二頁 hello ");


        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTab));
        mTab.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

        mTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
