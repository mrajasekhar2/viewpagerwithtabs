package mobiroad.com.viewpagerandtabs.simpleviewpager;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import mobiroad.com.viewpagerandtabs.R;

public class MainActivity extends FragmentActivity {
    ViewPager pager;
    Context ctx;
    ScreenSlidePageFragment pageFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ctx = this;

        List<DataModel> itemsList = getdata();

        pager = findViewById(R.id.pager);
        pageFragment = new ScreenSlidePageFragment(ctx, itemsList);
        pager.setAdapter(pageFragment);

    }

    private List<DataModel> getdata() {

        List<DataModel> list = new ArrayList<>();
        String[] titles = new String[]{"One", "two", "three", "Four"};
        int[] images = new int[]{R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground};

        for (int i = 0; i <= titles.length - 1; i++) {
            list.add(new DataModel(titles[i], images[i]));
        }
        return list;
    }


}
