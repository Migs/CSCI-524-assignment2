/*************************************************************************
 *                                                                       *
 *   Class Name: TrafficLight                                            *
 *                                                                       *
 *      Purpose: Provides the main model (or logic/rules) for the app    *
 *               and related functions                                   *
 *                                                                       *
 *************************************************************************/

package edu.niu.stoplightapp;

public class TrafficLight {

    private static int colors[] = new int[3];
    private static int current_color_index = 0;

    // Holds the correct ratio to calculate y coordinate for the circle
    private static float position[] = new float[3];
    private static int current_position_index = 0;

    /*************************************************************************
     * Constructs TrafficLight object                                        *
     *************************************************************************/
    public TrafficLight() {
        //assigns correct color to colors[]
        colors = new int[3];
        colors[0] = 0xFFFF0000;
        colors[1] = 0xFFFFFF00;
        colors[2] = 0xFF00FF00;

        //assigns ratio to position
        position = new float[3];
        position[0] = (float) 0.1;
        position[1] = (float) 0.4;
        position[2] = (float) 0.7;

    } // End constructor

    /*************************************************************************
     * change updates color and position of circle representing the active   *
     * traffic light                                                         *
     *************************************************************************/
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

    } // End change

    /*************************************************************************
     * getCurrentColor returns current color index                           *
     *************************************************************************/
    public int getCurrentColor(){
        return colors[current_color_index];
    }

    /*************************************************************************
     * getCurrent_position_index returns current position index              *
     *************************************************************************/
    public float getCurrent_position_index() { return position[current_position_index]; }
}
