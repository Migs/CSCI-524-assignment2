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

    public CanvasView(Context context){
        super(context);
    }
    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);

        // Sets pos to the current position
        pos = trafficLight.getCurrent_position_index();
        paint.setColor(trafficLight.getCurrentColor());
        canvas.drawCircle(this.getWidth()/2, this.getHeight()*pos, 70, paint);
    }
}
