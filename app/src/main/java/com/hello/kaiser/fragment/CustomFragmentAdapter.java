package com.hello.kaiser.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by kaiser on 2017/11/27.
 */

public class CustomFragmentAdapter extends FragmentPagerAdapter {

    String mTitleOne, mTitleTwo;

    public CustomFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    public void setDataOne(String messgae) {
        //這邊你可以在activity內獲取資料，再利用getItem傳入CreateFragment
        mTitleOne = messgae;
        notifyDataSetChanged();
    }

    public void setDataTwo(String message) {
        //這邊你可以在activity內獲取資料，再利用getItem傳入CreateFragment
        mTitleTwo = message;
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        //創作每一個Fragment內的內容
        if (position == 0) {//第一頁
            return new CreateFragment().newInstance(position, mTitleOne);
        } else {//第二頁
            return new CreateFragment().newInstance(position, mTitleTwo);
        }
    }

    @Override
    public int getCount() {
        //你得Fragment頁面數
        return 2;
    }
}
