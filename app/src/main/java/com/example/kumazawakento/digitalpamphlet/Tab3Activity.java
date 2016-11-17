package com.example.kumazawakento.digitalpamphlet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tab3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab3);
        TextView view = new TextView(this);
        view.setText("testTab3");
        setContentView(view);
    }
}
