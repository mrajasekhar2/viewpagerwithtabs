package mobiroad.com.viewpagerandtabs.simpleviewpager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import mobiroad.com.viewpagerandtabs.R;

public class ScreenSlidePageFragment extends PagerAdapter {
    List<DataModel> itemsList;
    Context ctx;

    public ScreenSlidePageFragment(Context ctx, List<DataModel> itemsList) {
        this.ctx = ctx;
        this.itemsList = itemsList;
    }

    @Override
    public int getCount() {
        return itemsList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View v = LayoutInflater.from(ctx).inflate(R.layout.fragment_screen_slide_page, container, false);
        ImageView image = v.findViewById(R.id.image);
        TextView text = v.findViewById(R.id.text);

        image.setImageResource(itemsList.get(position).images);
        text.setText("" + itemsList.get(position).Titles);

        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
//        super.destroyItem(container, position, object);
    }


}
