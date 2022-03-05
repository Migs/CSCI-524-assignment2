/*************************************************************************
 *                                                                       *
 *   Class Name: CanvasView                                              *
 *                                                                       *
 *      Purpose: This class is responsible for drawing the the actual    *
 *               stop light when the button is pushed                    *
 *                                                                       *
 *************************************************************************/
package edu.niu.stoplightapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class CanvasView extends View {

    private Paint paint = new Paint();

    // Holds y coordinate ratio for circle
    private float pos;

    private TrafficLight trafficLight = new TrafficLight();

    /*************************************************************************
     * Constructs Canvas view                                                *
     *************************************************************************/
    public CanvasView(Context context){
        super(context);
    }

    /*************************************************************************
     * onDraw draws the stop light to the correct specifications given by    *
     * the TrafficLight class                                                *
     *************************************************************************/
    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Sets current position
        pos = trafficLight.getCurrent_position_index();

        // Sets proper color
        paint.setColor(trafficLight.getCurrentColor());

        // Draws circle representing the active traffic light
        canvas.drawCircle(this.getWidth()/2, this.getHeight()*pos, 70, paint);
    }
}
