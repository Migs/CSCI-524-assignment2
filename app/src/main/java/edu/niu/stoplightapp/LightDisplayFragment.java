package edu.niu.stoplightapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.app.Fragment;
import android.widget.RelativeLayout;

public class LightDisplayFragment extends Fragment {

    // Constructor
    public LightDisplayFragment() {
        // Empty
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflates fragment layout
        View canvasView = inflater.inflate(R.layout.fragment_light_display, container, false);

        RelativeLayout canvasLayout = (RelativeLayout) canvasView.findViewById(R.id.traffic_light);
        canvasLayout.addView(new CanvasView(getActivity()));

        return canvasView;
    }

}
