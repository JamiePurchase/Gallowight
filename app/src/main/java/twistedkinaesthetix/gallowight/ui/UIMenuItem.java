package twistedkinaesthetix.gallowight.ui;

import android.graphics.Canvas;

import twistedkinaesthetix.gallowight.graphics.Drawing;

public class UIMenuItem extends UI
{

    private String itemText;

    public UIMenuItem(String ref, String text, int drawX, int drawY, int sizeX, int sizeY)
    {
        super(ref, true);
        itemText = text;
        setAnim(drawX, drawY, sizeX, sizeY);
    }

    public void render(Canvas canvas)
    {
        Drawing.textWrite(canvas, itemText, getAnimDrawX(), getAnimDrawY());
    }

}