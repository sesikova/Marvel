package com.sesikova.android.marvel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;



public class HeroView extends View  {
    int heroIndex=0;
    int heroX=10;
    int heroY=10;
    float heroSize=300;

    Hero[] heroes;


    public HeroView(Context context) {
        super(context);

        heroes = new Hero[3];

        heroes[0]=new SpiderMan(heroX,heroY,heroSize,context);
        heroes[1]=new IronMan(heroX,heroY,heroSize,context);
        heroes[2]=new CapAmerica(heroX,heroY,heroSize,context);

        setBackgroundColor(Color.LTGRAY);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (heroes[heroIndex] instanceof SpiderMan) {
            ((SpiderMan) heroes[heroIndex ]).onDraw(canvas);

        }

        if (heroes[heroIndex] instanceof IronMan) {
            ((IronMan) heroes[heroIndex ]).onDraw(canvas);

        }

        if (heroes[heroIndex] instanceof CapAmerica) {
            ((CapAmerica) heroes[heroIndex ]).onDraw(canvas);

        }

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        ((SpiderMan)heroes[0]).onTouch(x,y);
        ((IronMan)heroes[1]).onTouch(x,y);
        ((CapAmerica)heroes[2]).onTouch(x,y);

        invalidate();

        return true;
    }


    public void changeIndex() {
        heroIndex+=1;

        if (heroIndex>2)
        {
            heroIndex=0;
        }
        invalidate();

    }

    public void maxSize(float koef) {
        heroSize = heroSize*koef;

        ((SpiderMan)heroes[0]).size=heroSize;
        ((IronMan)heroes[1]).size=heroSize;
        ((CapAmerica)heroes[2]).size=heroSize;

         invalidate();
    }

    public void minSize(int koef) {
        heroSize = heroSize/koef;

        ((SpiderMan)heroes[0]).size=heroSize;
        ((IronMan)heroes[1]).size=heroSize;
        ((CapAmerica)heroes[2]).size=heroSize;

        invalidate();
    }
}
