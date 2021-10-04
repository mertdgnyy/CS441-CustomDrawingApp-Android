package com.example.cs441customdrawingandroid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.SurfaceHolder;
import android.view.SurfaceView;



import androidx.annotation.NonNull;

// Ali Mert Doganay
public class DrawLine extends SurfaceView implements SurfaceHolder.Callback {
    public SurfaceHolder surfaceHolder = null;
    private float x = 0;
    private float limit1;
    private float limit2;
    private Paint paint;
    Canvas canvas= null;


    public DrawLine(Context context){
        super(context);
        paint = new Paint();
        paint.setColor(Color.WHITE);


    }

    //Drawing the line (basically rectangle), and if it exceeds the height
    // of the canvas, background changes.
    public void draw() {
        x +=100;
        surfaceHolder = getHolder();
        canvas = surfaceHolder.lockCanvas();

        Rect ourRect = new Rect();
        ourRect.set(0,0,canvas.getWidth(), canvas.getHeight());
        limit2 = canvas.getHeight();
//        Log.d("Width:", Float.toString(limit1));
//        Log.d("Height", Float.toString(limit2));
        Paint black = new Paint();
        black.setColor(Color.BLACK);
        black.setStyle(Paint.Style.FILL);

        canvas.drawRect(ourRect, black);

        paint.setColor(Color.WHITE);
        if(x > limit2){
            Paint white = new Paint();
            white.setColor(Color.WHITE);
            white.setStyle(Paint.Style.FILL);
            canvas.drawRect(ourRect,white);
        }

        canvas.drawRect(550,10,canvas.getWidth()/2,canvas.getHeight()/2+x-700,paint);
        surfaceHolder.unlockCanvasAndPost(canvas);


    }

    //Re-drawing the line
    public void ReDrawLine(){
        x -=100;
        surfaceHolder = getHolder();
        canvas = surfaceHolder.lockCanvas();

        Rect ourRect = new Rect();
        ourRect.set(0,0,canvas.getWidth(), canvas.getHeight());

        Paint black = new Paint();
        black.setColor(Color.BLACK);
        black.setStyle(Paint.Style.FILL);

        canvas.drawRect(ourRect, black);

        paint.setColor(Color.WHITE);

        canvas.drawRect(550,10,canvas.getWidth()/2,canvas.getHeight()/2+x-700,paint);
        surfaceHolder.unlockCanvasAndPost(canvas);

    }


    @Override
    public void surfaceCreated(@NonNull SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder holder) {
        paint = null;
    }


}