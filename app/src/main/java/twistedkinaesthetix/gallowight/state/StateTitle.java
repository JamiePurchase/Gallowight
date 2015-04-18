package twistedkinaesthetix.gallowight.state;

import twistedkinaesthetix.gallowight.ui.UI;
import twistedkinaesthetix.gallowight.ui.UIMenu;
import twistedkinaesthetix.gallowight.ui.UIMenuItem;
import twistedkinaesthetix.gallowight.graphics.Drawing;
import android.graphics.Canvas;

public class StateTitle extends State
{
    private UI[] uiArray = new UI[50];

    public StateTitle()
    {
        UIMenu menu = new UIMenu("titleMenu");
        menu.addMenuItem(new UIMenuItem("titleMenuNew", "New Game", 300, 150, 200, 200));
        menu.addMenuItem(new UIMenuItem("titleMenuNew", "Continue", 300, 250, 200, 200));
        menu.addMenuItem(new UIMenuItem("titleMenuNew", "Exit Game", 300, 350, 200, 200));
        addUI(menu);
    }

    public void addUI(UI ui)
    {
        uiArray[uiArray.length] = ui;
    }

    public void render(Canvas canvas)
    {
        Drawing.fillScreen(canvas, 255, 255, 255);
        Drawing.imageDraw(canvas, "temp", 0, 0);
        for(int ui=0; ui<uiArray.length; ui++)
        {
            uiArray[ui].render(canvas);
        }
    }

    public void tick()
    {
        //
    }

}