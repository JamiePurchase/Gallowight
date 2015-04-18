package twistedkinaesthetix.gallowight.state;

import twistedkinaesthetix.gallowight.battle.BattleUnit;

import android.graphics.Canvas;

public class StateBattle extends State
{

    private String stateCurrent = "ADVANCE";
    private boolean statePause = false;
    private int timePassed = 0;
    private int unitAllyActive = 0;
    private BattleUnit[] unitAllyArray;
    private int unitEnemyActive = 0;
    private BattleUnit[] unitEnemyArray;

    public StateBattle()
    {

    }

    public void render(Canvas canvas)
    {
        renderBackground(canvas);
        renderUnits(canvas);
        if(statePause==true) {renderPause(canvas);}
        else
        {
            renderInterface(canvas);
            renderEffects(canvas);
        }
    }

    public void renderBackground(Canvas canvas)
    {

    }

    public void renderEffects(Canvas canvas)
    {

    }

    public void renderInterface(Canvas canvas)
    {

    }

    public void renderPause(Canvas canvas)
    {

    }

    public void renderUnits(Canvas canvas)
    {

    }

    public void tick()
    {
        if(statePause==true) {tickPause();}
        else
        {
            timePassed++;
            if(stateCurrent.equals("ACTION")) {tickAction();}
            else if(stateCurrent.equals("MENU")) {tickMenu();}
            else {tickAdvance();}
        }
    }

    public void tickAction()
    {

    }

    public void tickAdvance()
    {
        tickAdvanceAlly();
        tickAdvanceEnemy();
    }

    public void tickAdvanceAlly()
    {
        for(int unit=0; unit<unitAllyArray.length; unit++)
        {
            unitAllyArray[unit].advance();
        }
    }

    public void tickAdvanceEnemy()
    {
        for(int unit=0; unit<unitEnemyArray.length; unit++)
        {
            unitEnemyArray[unit].advance();
        }
    }

    public void tickMenu()
    {

    }

    public void tickPause()
    {

    }

}