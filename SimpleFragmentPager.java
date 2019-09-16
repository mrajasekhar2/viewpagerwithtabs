package mobiroad.com.viewpagerandtabs.viewpagerwithfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import mobiroad.com.viewpagerandtabs.R;

public class SimpleFragmentPager extends AppCompatActivity {
    private ViewPager pager;
    SimpleViewPagerFragment viewPagerFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = findViewById(R.id.pager);




        viewPagerFragment = new SimpleViewPagerFragment(getSupportFragmentManager());
        pager.setAdapter(viewPagerFragment);

    }
}
