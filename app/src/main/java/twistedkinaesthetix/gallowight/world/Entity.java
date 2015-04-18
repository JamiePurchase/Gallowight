package twistedkinaesthetix.gallowight.world;

import android.graphics.Canvas;

public abstract class Entity
{
    private String entityRef;
    private int locationDrawX;
    private int locationDrawY;
    private int locationFace;

    public Entity(String ref)
    {
        entityRef = ref;
    }

    public abstract void render(Canvas canvas);
    public abstract void tick();
}