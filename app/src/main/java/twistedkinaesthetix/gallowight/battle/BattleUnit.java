package twistedkinaesthetix.gallowight.battle;

import android.graphics.Canvas;

public class BattleUnit
{

    private int actionCharge;
    private String actionState;

    public BattleUnit()
    {

    }

    public void advance()
    {
        actionCharge--;
        if(actionCharge<1) {actionState = "IDLE";}
    }

    public void render(Canvas canvas)
    {

    }

}