package edu.niu.stoplightapp;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;

import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;


public class TrafficLight {

    private static int colors[] = new int[3];
    private static int current_color_index = 0;

    // Constructor
    public TrafficLight() {
        colors = new int[3];
        colors[0] = 0xFFFF0000;
        colors[1] = 0xFFFFFF00;
        colors[2] = 0xFF00FF00;
    }//end Constructor

    public void change(){
        current_color_index++;
        if(current_color_index > 2) {
            current_color_index = 0;
        }
    }//end change

    public int getCurrentColor(){
        return colors[current_color_index];
    }
}
