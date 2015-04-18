package twistedkinaesthetix.gallowight.state;

import android.graphics.Canvas;

import twistedkinaesthetix.gallowight.graphics.Drawing;
import twistedkinaesthetix.gallowight.world.EntityActorNPC;
import twistedkinaesthetix.gallowight.world.EntityActorPlayer;
import twistedkinaesthetix.gallowight.world.EntityNature;

public class StateWorld extends State
{
    private EntityActorNPC[] actorNPCArray = new EntityActorNPC[50];
    private EntityActorPlayer actorPlayer;
    private EntityNature[] natureArray = new EntityNature[90];
    private boolean timePause = false;
    private int viewDrawX = 0;
    private int viewDrawY = 0;
    private int viewSizeX = 0;
    private int viewSizeY = 0;

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