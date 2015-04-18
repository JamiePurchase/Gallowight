package twistedkinaesthetix.gallowight.state;

import twistedkinaesthetix.gallowight.graphics.Drawing;
import android.graphics.Canvas;

import twistedkinaesthetix.gallowight.GamePanel;

public class StateIntro extends State
{
    private int tickTime;

    public StateIntro()
    {
        tickTime = 0;
    }

    public void render(Canvas canvas)
    {
        Drawing.fillScreen(canvas, 0, 0, 0);
    }

    public void tick()
    {
        tickTime++;
        if(tickTime > 100)
        {
            GamePanel.setState(new StateTitle());
        }
    }

}