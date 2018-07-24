package com.example.smbat.tabsexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import java.util.List;

class CustomViewPagerAdapter extends PagerAdapter {

    private final Context mContext;
    private final List<GirlModel> mSliderProducts;

    CustomViewPagerAdapter(final List<GirlModel> products, final Context context) {
        mSliderProducts = products;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mSliderProducts.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        final LayoutInflater mLayoutInflater =
                (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (null == mLayoutInflater) {
            return new Object();
        }
        final View sliderView =
                mLayoutInflater.inflate(R.layout.slider_view, container, false);
        final ImageView sliderImage = sliderView.findViewById(R.id.img);
        sliderImage.setImageResource(mSliderProducts.get(position).getImageResId());
        container.addView(sliderView);
        return sliderView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((FrameLayout) object);
    }
}
