package com.sesikova.android.marvel;

import android.content.Context;
import android.graphics.Canvas;



public class IronMan extends Hero implements Touchable,Drawable {


    IronMan(float x, float y, float size, Context context) {

        super(x, y, size, context, R.drawable.ironman);
    }


    @Override
    public void onDraw(Canvas canvas) {
        super.draw(canvas);
    }


    @Override
    public void onTouch(float x, float y) {
        super.touch(x, y);
    }

}