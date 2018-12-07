package com.sesikova.android.marvel;

import android.content.Context;
import android.graphics.Canvas;



public class SpiderMan extends Hero implements Touchable,Drawable {


    SpiderMan(float x, float y, float size, Context context) {

        super(x, y, size, context, R.drawable.spiderman);
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