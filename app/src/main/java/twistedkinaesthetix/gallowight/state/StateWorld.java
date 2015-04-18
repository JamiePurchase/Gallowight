package twistedkinaesthetix.gallowight.state;

import android.graphics.Canvas;

import twistedkinaesthetix.gallowight.graphics.Drawing;

public class StateWorld extends State
{

    public StateWorld()
    {

    }

    public void render(Canvas canvas)
    {
        Drawing.fillScreen(canvas, 202, 245, 122);
    }

    public void tick()
    {

    }

}