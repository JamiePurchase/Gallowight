package twistedkinaesthetix.gallowight.ui;

import android.graphics.Canvas;

public abstract class UI
{
    private int animDrawX;
    private int animDrawY;
    private int animSizeX;
    private int animSizeY;
    private boolean animVisual;
    private String uiRef;

    public UI(String ref, boolean visual)
    {
        uiRef = ref;
        animVisual = visual;
    }

    public int getAnimDrawX()
    {
        return animDrawX;
    }

    public int getAnimDrawY()
    {
        return animDrawY;
    }

    public int getAnimSizeX()
    {
        return animSizeX;
    }

    public int getAnimSizeY()
    {
        return animSizeY;
    }

    public abstract void render(Canvas canvas);

    public void setAnim(int drawX, int drawY, int sizeX, int sizeY)
    {
        animDrawX = drawX;
        animDrawY = drawY;
        animSizeX = sizeX;
        animSizeY = sizeY;
    }
}