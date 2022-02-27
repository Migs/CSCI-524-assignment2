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

import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}