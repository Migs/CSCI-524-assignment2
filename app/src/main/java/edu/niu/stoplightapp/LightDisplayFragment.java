package edu.niu.stoplightapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.app.Fragment;

public class LightDisplayFragment extends Fragment {
    // Constructor
    public LightDisplayFragment() {
        // Empty
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflates fragment layout
        return inflater.inflate(R.layout.fragment_light_display, container, false);
    }

}
