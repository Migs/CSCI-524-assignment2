/*************************************************************************
 *                                                                       *
 *   Class Name: LightControlFragment                                    *
 *                                                                       *
 *      Purpose: This class creates the view fragment that holds the     *
 *               stop light button                                       *
 *                                                                       *
 *************************************************************************/
package edu.niu.stoplightapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.app.Fragment;

public class LightControlFragment extends Fragment {

    /*************************************************************************
     * Constructs LightControl fragment                                      *
     *************************************************************************/
    public LightControlFragment() {
        // Empty
    }

    /*************************************************************************
     * onCreateView inflates the LightControlfragment layout                 *
     *************************************************************************/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflates fragment layout
        return inflater.inflate(R.layout.fragment_light_control, container, false);
    }
}