package edu.niu.stoplightapp;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;

import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;


public class TrafficLight {

    private static int colors[] = new int[3];
    private static int current_color_index = 0;

    //variables that hold the correct ratio to calc y coordinate for the circle
    private static float position[] = new float[3];
    private static int current_position_index = 0;


    // Constructor
    public TrafficLight() {
        colors = new int[3];
        colors[0] = 0xFFFF0000;
        colors[1] = 0xFFFFFF00;
        colors[2] = 0xFF00FF00;

        position = new float[3];
        position[0] = (float) 0.1;
        position[1] = (float) 0.4;
        position[2] = (float) 0.7;
    }//end Constructor

    public void change() {
        //updates the color and position index
        current_color_index++;
        current_position_index++;

        //checks if final color/pos has been reached
        if(current_color_index > 2) {
            current_color_index = 0;
        }
        if(current_position_index > 2){
            current_position_index = 0;
        }

    }//end change

    //returns current color index
    public int getCurrentColor(){
        return colors[current_color_index];
    }

    //returns current position index
    public float getCurrent_position_index() { return position[current_position_index]; }
}
