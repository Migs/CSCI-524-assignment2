/*************************************************************************
 *                                                                       *
 * CSCI 428-1/524-1             Assignment 2                Spring 2022  *
 *                                                                       *
 *   Class Name: MainActivity.java                                       *
 *                                                                       *
 * Developer(s): Katelyn Kozinski (Z167824), Miguel Williams (Z1880434)  *
 *     Due date: March 4, 2022                                           *
 *                                                                       *
 *      Purpose: Serves as the entry point to a simple traffic light     *
 *      simulation.                                                      *
 *                                                                       *
 *************************************************************************/

package edu.niu.stoplightapp;

import android.app.Activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TrafficLight model;
    private CanvasView canvas;
    private LightDisplayFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creates traffic light model
        if (model == null)
            model = new TrafficLight();

        // Gets fragment manager
        FragmentManager fragmentManager = getFragmentManager();

        // Creates traffic light fragment and adds to layout
        if (fragmentManager.findFragmentById(R.id.light_display) == null) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            fragment = new LightDisplayFragment();
            transaction.add(R.id.light_display, fragment);
            transaction.commit();
        }

        // Creates button fragment and adds to layout
        if (fragmentManager.findFragmentById(R.id.light_control) == null) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            LightControlFragment fragment = new LightControlFragment();
            transaction.add(R.id.light_control, fragment);
            transaction.commit();
        }
    }

    // Changes light color upon button click
    public void change(View view) {
        model.change();
        canvas.postInvalidate();
    }
}