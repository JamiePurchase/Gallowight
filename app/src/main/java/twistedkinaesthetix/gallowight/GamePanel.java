package twistedkinaesthetix.gallowight;

import twistedkinaesthetix.gallowight.state.State;
import twistedkinaesthetix.gallowight.state.StateIntro;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GamePanel extends SurfaceView implements SurfaceHolder.Callback
{
    public static final int WIDTH = 1200;
    public static final int HEIGHT = 800;
    private static Resources RESOURCES;
    private static State STATE;
    private MainThread thread;

    public GamePanel(Context context)
    {
        super(context);
        getHolder().addCallback(this);
        thread = new MainThread(getHolder(), this);
        setFocusable(true);
        RESOURCES = getResources();
    }

    public static Resources getRes()
    {
        return RESOURCES;
    }

    public static void setState(State state)
    {
        STATE = state;
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height)
    {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder)
    {
        boolean retry = true;
        while(retry)
        {
            try
            {
                thread.setRunning(false);
                thread.join();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            retry = false;
        }
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder)
    {
        //bg = new Background(BitmapFactory.decodeResource(getResources(), R.drawable.grassbg1));
        setState(new StateIntro());
        thread.setRunning(true);
        thread.start();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        return super.onTouchEvent(event);
    }

    public void tick()
    {
        STATE.tick();
    }

    public void render(Canvas canvas)
    {
        STATE.render(canvas);
    }

}