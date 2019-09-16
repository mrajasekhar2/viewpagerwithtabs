package mobiroad.com.viewpagerandtabs.ViewPagerWithTabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import mobiroad.com.viewpagerandtabs.R;
import mobiroad.com.viewpagerandtabs.viewpagerwithfragment.fragment.FragmentOne;
import mobiroad.com.viewpagerandtabs.viewpagerwithfragment.fragment.FragmentThree;
import mobiroad.com.viewpagerandtabs.viewpagerwithfragment.fragment.FragmentTwo;

public class SimpleTabWithText extends AppCompatActivity {
    ViewPager pager;
    TabLayout tablayout;
    List<Fragment> frag_list = new ArrayList<>();
    List<String> titles_list = new ArrayList<>();
    TabTextAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_text);

        getData();

        pager = findViewById(R.id.pager);

        tablayout = findViewById(R.id.tablayout);

        adapter = new TabTextAdapter(getSupportFragmentManager(), frag_list, titles_list);
        pager.setAdapter(adapter);
        tablayout.setupWithViewPager(pager);

    }

    private void getData() {

//        frag_list.add(new FragmentOne());
//        titles_list.add("ONE");
//
//        frag_list.add(new FragmentTwo());
//        titles_list.add("TWO");
//
//        frag_list.add(new FragmentThree());
//        titles_list.add("THREE");

        add(new FragmentOne(), "ONE");
        add(new FragmentTwo(), "TWO");
        add(new FragmentThree(), "THREE");

    }

    private void add(Fragment fragment, String title) {
        frag_list.add(fragment);
        titles_list.add(title);
    }
}
