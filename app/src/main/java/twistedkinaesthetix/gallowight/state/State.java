package twistedkinaesthetix.gallowight.state;

import android.graphics.Canvas;

public abstract class State
{
    public abstract void render(Canvas canvas);
    public abstract void tick();
}