package com.panelic.laparuser.fragment;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.panelic.laparuser.MainActivity;
import com.panelic.laparuser.R;
import com.panelic.laparuser.SearchActivity;

import static android.R.attr.button;

/**
 * Created by Sholihin on 12/02/2017.
 * Developer Team : Panelic Studio
 */

public class TabMainFrag extends Fragment {

    Button button;

    public TabMainFrag() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        // Locate the button in activity_main.xml
        button = (Button)v.findViewById(R.id.search);

        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(getActivity(),
                        SearchActivity.class);
                startActivity(myIntent);
            }
        });
        // Inflate the layout for this fragment
        return v;
    }

}
