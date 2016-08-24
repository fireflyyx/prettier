package com.neo.http.prettier.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/7/16 0016.
 */
public class MyFragmnetPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> list;
    List<String> tabnamelist;

    public MyFragmnetPagerAdapter(FragmentManager fm, List<Fragment> list, List<String> tabnamelist) {
        super(fm);
        this.list = list;
        this.tabnamelist=tabnamelist;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return tabnamelist.get(position);
    }

}
