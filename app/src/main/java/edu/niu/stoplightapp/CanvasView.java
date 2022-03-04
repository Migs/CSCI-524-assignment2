package edu.niu.stoplightapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class CanvasView extends View {

    private Paint paint = new Paint();
    private TrafficLight trafficLight = new TrafficLight();

    public CanvasView(Context context){
        super(context);
    }
    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);

        paint.setColor(trafficLight.getCurrentColor());
        canvas.drawCircle(50, 50, 70, paint);
    }
}
