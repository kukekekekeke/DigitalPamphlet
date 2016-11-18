package com.example.kumazawakento.digitalpamphlet;


import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

import com.viewpagerindicator.TitlePageIndicator;

public class MainActivity extends AppCompatActivity {

    private MainFragmentPagerAdapter mAdapter;
    private ViewPager mPager;
    private TitlePageIndicator mIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initTabs();

        mAdapter = new MainFragmentPagerAdapter(getSupportFragmentManager());

        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        TitlePageIndicator indicator = (TitlePageIndicator)findViewById(R.id.indicator);
        mIndicator = indicator;
        indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;
        indicator.setBackgroundColor(0x18FF0000);
        indicator.setFooterColor(0xFFAA2222);
        indicator.setFooterLineHeight(1 * density); //1dp
        indicator.setFooterIndicatorHeight(3 * density); //3dp
        indicator.setFooterIndicatorStyle(TitlePageIndicator.IndicatorStyle.Underline);
        indicator.setTextColor(0xAA000000);
        indicator.setSelectedColor(0xFF000000);
        indicator.setSelectedBold(true);

    }

    protected void initTabs() {
        try {
            TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
            tabHost.setup();
            TabHost.TabSpec spec;

            // Tab1
            spec = tabHost.newTabSpec("Tab1")
                    .setIndicator("Home", ContextCompat.getDrawable(this, R.drawable.gidai))
                    .setContent(R.id.linearLayout);
            tabHost.addTab(spec);

            // Tab2
            spec = tabHost.newTabSpec("Tab2")
                    .setIndicator("Time Table", ContextCompat.getDrawable(this, R.drawable.gidai))
                    .setContent(R.id.linearLayout2);
            tabHost.addTab(spec);

            // Tab3
            spec = tabHost.newTabSpec("Tab3")
                    .setIndicator("Food", ContextCompat.getDrawable(this, R.drawable.gidai))
                    .setContent(R.id.linearLayout3);
            tabHost.addTab(spec);

            // Tab4
            spec = tabHost.newTabSpec("Tab4")
                    .setIndicator("Map", ContextCompat.getDrawable(this, R.drawable.gidai))
                    .setContent(R.id.linearLayout4);
            tabHost.addTab(spec);


            tabHost.setCurrentTab(0);


        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

}
