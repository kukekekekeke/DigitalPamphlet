package com.example.kumazawakento.digitalpamphlet;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTabs();
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
