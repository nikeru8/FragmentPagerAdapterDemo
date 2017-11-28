package com.hello.kaiser.fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private CustomFragmentAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initSet();
    }

    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
    }

    private void initSet() {
        mAdapter = new CustomFragmentAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);
        mAdapter.setDataOne("你好第一頁");
        mAdapter.setDataTwo("歡迎光靈第二頁 hello ");
    }
}
