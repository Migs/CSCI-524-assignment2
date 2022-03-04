package edu.niu.stoplightapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.app.Fragment;
import android.widget.TextView;

public class LightControlFragment extends Fragment {
    // Constructor
    public LightControlFragment() {
        // Empty
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflates fragment layout
        return inflater.inflate(R.layout.fragment_light_control, container, false);
    }
}