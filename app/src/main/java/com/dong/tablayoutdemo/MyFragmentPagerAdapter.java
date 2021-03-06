package com.dong.tablayoutdemo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by zhangld on 2016/6/22.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    public final int COUNT = 5;
    private String[] titles = new String[]{"Tab1","Tab2","Tab3","Tab4","Tab5"};
    private Context context;

    public MyFragmentPagerAdapter(FragmentManager fm,Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position+1);
    }

    @Override
    public int getCount() {
        return COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
