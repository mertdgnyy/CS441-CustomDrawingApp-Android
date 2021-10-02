package com.example.hw3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import androidx.annotation.NonNull;


public class DrawLine extends SurfaceView implements SurfaceHolder.Callback {
    public SurfaceHolder surfaceHolder = null;
    private float x,y;
    private Paint paint = null;

    public DrawLine(Context context){
        super(context);
        paint = new Paint();
        paint.setColor(Color.WHITE);
    }

    public void draw() {

        surfaceHolder = getHolder();
        Canvas canvas = surfaceHolder.lockCanvas();

        Rect ourRect = new Rect();
        ourRect.set(0,0,canvas.getWidth(), canvas.getHeight());

        Paint black = new Paint();
        black.setColor(Color.BLACK);
        black.setStyle(Paint.Style.FILL);

        canvas.drawRect(ourRect, black);

        paint.setColor(Color.WHITE);
        canvas.drawLine(x,y,100,100,paint);

        surfaceHolder.unlockCanvasAndPost(canvas);
        x += 100;
        y +=100;
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

    public void setX(float x) {
        this.x = 100;
    }
    public void setY(float y) {
        this.y = 100 ;
    }

}