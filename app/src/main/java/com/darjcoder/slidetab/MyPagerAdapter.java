package com.darjcoder.slidetab;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.darjcoder.slidetab.fragment.FragmentA;
import com.darjcoder.slidetab.fragment.FragmentB;
import com.darjcoder.slidetab.fragment.FragmentC;

public class MyPagerAdapter extends FragmentPagerAdapter{

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        Fragment f = null;
        switch (i) {
            case 0:
                f = new FragmentA();
                break;
            case 1:
                f = new FragmentB();
                break;
            case 2:
                f = new FragmentC();
                break;
        }

        return f;
    }

    @Override
    public int getCount() {
        return 3;
    }

}
