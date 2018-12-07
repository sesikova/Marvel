package com.sesikova.android.marvel;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;

abstract class Hero {
    private Vector pos;
    private float size;
    private Bitmap pic;


    Hero(float x, float y, float hero_size, Context context, int picResId) {
        pos = new Vector(x, y);
        size = hero_size;
        pic = BitmapFactory.decodeResource(context.getResources(), picResId);
    }


    void draw(Canvas canvas) {
        float k = (float)pic.getHeight()/pic.getWidth();
        RectF rect = new RectF(pos.x, pos.y,pos.x + size, pos.y + size * k );
        canvas.drawBitmap(pic, null, rect, null);
    }


    void touch (float x, float y)
    {
        pos.set(x, y);
    }


}
