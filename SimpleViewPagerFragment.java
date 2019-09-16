package mobiroad.com.viewpagerandtabs.viewpagerwithfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import mobiroad.com.viewpagerandtabs.viewpagerwithfragment.fragment.FragmentOne;
import mobiroad.com.viewpagerandtabs.viewpagerwithfragment.fragment.FragmentThree;
import mobiroad.com.viewpagerandtabs.viewpagerwithfragment.fragment.FragmentTwo;

public class SimpleViewPagerFragment extends FragmentStatePagerAdapter {
    public SimpleViewPagerFragment(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {

            case 0:
                return new FragmentOne();
            case 1:
                return new FragmentTwo();
            case 2:
                return new FragmentThree();
        }
        return new FragmentOne();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
