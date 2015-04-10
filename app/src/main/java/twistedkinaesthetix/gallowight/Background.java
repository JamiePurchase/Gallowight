package twistedkinaesthetix.gallowight;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

public class Background
{
    //private Bitmap image;
    private int x, y;

    //public Background(Bitmap res)
    public Background()
    {
        //image = res;
    }

    public void update()
    {

    }

    public void draw(Canvas canvas)
    {
        Paint paint = new Paint();
        Rect r = new Rect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.rgb(202, 245, 122));
        canvas.drawRect(r, paint);
    }
}
