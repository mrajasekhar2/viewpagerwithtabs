package mobiroad.com.viewpagerandtabs.pagerwithicontabs;

import android.media.Image;
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
import mobiroad.com.viewpagerandtabs.viewpagerwithfragment.fragment.FragmentTwo;

public class SimpleTabIcons extends AppCompatActivity {
    TabLayout tab_icon;
    ViewPager pager_icon;
    SimpleTabUconAdapter adapter;
    List<Fragment> frag_list = new ArrayList<>();
    List<String> title_list = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_icon);

        pager_icon = findViewById(R.id.pager_icon);
        tab_icon = findViewById(R.id.tab_icon);

        getData();

        adapter = new SimpleTabUconAdapter(getSupportFragmentManager(), frag_list, title_list);
        pager_icon.setAdapter(adapter);

        tab_icon.setupWithViewPager(pager_icon);
        tab_icon.getTabAt(0).setIcon(R.drawable.ic_launcher_foreground);
        tab_icon.getTabAt(1).setIcon(R.drawable.ic_launcher_background);

    }

    private void getData() {

        frag_list.add(new FragmentOne());
        title_list.add("HEy");

        frag_list.add(new FragmentTwo());
        title_list.add("Hello");
    }


}
