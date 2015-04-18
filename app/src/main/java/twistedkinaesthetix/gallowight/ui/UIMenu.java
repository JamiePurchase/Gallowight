package twistedkinaesthetix.gallowight.ui;

import android.graphics.Canvas;

public class UIMenu extends UI
{
    private UIMenuItem[] menuItemArray = new UIMenuItem[20];
    private int menuItemFocus = 0;

    public UIMenu(String ref)
    {
        super(ref, false);
    }

    public void addMenuItem(UIMenuItem item)
    {
        menuItemArray[menuItemArray.length] = item;
    }

    public void render(Canvas canvas)
    {
    }

}