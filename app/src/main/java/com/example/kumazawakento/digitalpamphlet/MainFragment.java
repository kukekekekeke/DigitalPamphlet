package com.example.kumazawakento.digitalpamphlet;

import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class MainFragment extends Fragment {
    private final static String BACKGROUND_COLOR = "background_color";

    public static MainFragment newInstance(@ColorRes int IdRes) {
        MainFragment fragment = new MainFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(BACKGROUND_COLOR, IdRes);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, null);
        LinearLayout linearLayout = (LinearLayout)view.findViewById(R.id.sample_fragment);
        linearLayout.setBackgroundResource(getArguments().getInt(BACKGROUND_COLOR));

        return view;
    }
}
