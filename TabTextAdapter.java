package mobiroad.com.viewpagerandtabs.AppbarLayout;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class TabTextAdapter extends FragmentStatePagerAdapter {

    List<Fragment> frag_list;
    List<String> titles_list;

    public TabTextAdapter(FragmentManager fm, List<Fragment> frag_list, List<String> titles_list) {
        super(fm);
        this.frag_list = frag_list;
        this.titles_list = titles_list;
    }

    @Override
    public Fragment getItem(int i) {

        return frag_list.get(i);
    }

    @Override
    public int getCount() {
        return frag_list.size();
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles_list.get(position);
    }
}
