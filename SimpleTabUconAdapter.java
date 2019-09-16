package mobiroad.com.viewpagerandtabs.pagerwithicontabs;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class SimpleTabUconAdapter extends FragmentStatePagerAdapter {
    List<Fragment> frag_list;
    List<String> title_list;

    public SimpleTabUconAdapter(FragmentManager fm, List<Fragment> frag_list, List<String> title_list) {
        super(fm);
        this.frag_list = frag_list;
        this.title_list = title_list;
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
        return title_list.get(position);
    }
}
