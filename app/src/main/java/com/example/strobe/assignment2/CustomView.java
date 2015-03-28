package com.example.strobe.assignment2;

/**
 * Created by strobe on 27/03/15.
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;



public class CustomView extends View {
    //declaring colours private Paint red, green, blue;
    private boolean touches[];
    private float touchx[];
    private float touchy[];
    private int first;
    private boolean touch;
    private Paint black, grey, white, blue, green, yellow, red;
    Rect top;
    public CustomView(Context context) {
        super(context);
        //the init object should initialise paint object for the colours and it should reset the game
        init();
    }
    //constructor that takes in a context, attributes that are set through xml
    public CustomView(Context context, AttributeSet as){
        super(context,as);
        init();
    }
    //constructor that takes in context, attribute set and a default view in case view is to be styled
    //in a certain way
    public CustomView(Context context, AttributeSet as, int default_style){
        super(context, as, default_style);

    }
    public void init(){

        //this method should also reset the game
        black = new Paint(Paint.ANTI_ALIAS_FLAG);
        grey = new Paint(Paint.ANTI_ALIAS_FLAG);
        white = new Paint(Paint.ANTI_ALIAS_FLAG);
        blue = new Paint(Paint.ANTI_ALIAS_FLAG);
        green = new Paint(Paint.ANTI_ALIAS_FLAG);
        yellow = new Paint(Paint.ANTI_ALIAS_FLAG);
        red = new Paint(Paint.ANTI_ALIAS_FLAG);
        red.setColor(0xFFFF0000);
        green.setColor(0xFF00FF00);
        blue.setColor(0xFF0000FF);
        black.setColor(0x000000);




        //initialse all the touch arrays to have 16 elements
        //initialse the rectangle
        for(int i=0;i<16;i++){
            top = new Rect(-100, -100, 100, 100);
        }
        touch = false;
    }

    public void onDraw(Canvas canvas) {
        //call the superclass method

        super.onDraw(canvas);
        canvas.drawRect(top, red);
    }

    public boolean onTouchEvent(MotionEvent event){
        return super.onTrackballEvent(event);
    }





    public void ResetGame(){
        //clear out the game board
        //place 20 mines in a 10x10 grid
        //calculate how many mines surround it
    }

}
