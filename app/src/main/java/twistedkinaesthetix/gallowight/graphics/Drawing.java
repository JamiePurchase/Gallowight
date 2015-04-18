package twistedkinaesthetix.gallowight.graphics;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

import twistedkinaesthetix.gallowight.GamePanel;
import twistedkinaesthetix.gallowight.R;

public class Drawing
{

    public static void fillScreen(Canvas canvas, int r, int g, int b)
    {
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.rgb(r, g, b));
        canvas.drawRect(rect, paint);
    }

    public static void imageDraw(Canvas canvas, String image, int drawX, int drawY)
    {
        //Bitmap bitmap = BitmapFactory.decodeResource(GamePanel.getRes(), R.drawable.grassbg1);
        //canvas.drawBitmap(bitmap, drawX, drawY, null);
        if(image=="temp")
        {
            Drawable imageObject = GamePanel.getRes().getDrawable(R.drawable.logo);
            imageObject.draw(canvas);
        }
    }

    public static void textWrite(Canvas canvas, String text, int drawX, int drawY)
    {
        textWrite(canvas, text, drawX, drawY, 16, 0, 0, 0);
    }

    public static void textWrite(Canvas canvas, String text, int drawX, int drawY, int size)
    {
        textWrite(canvas, text, drawX, drawY, size, 0, 0, 0);
    }

    public static void textWrite(Canvas canvas, String text, int drawX, int drawY, int r, int g, int b)
    {
        textWrite(canvas, text, drawX, drawY, 16, r, g, b);
    }

    public static void textWrite(Canvas canvas, String text, int drawX, int drawY, int size, int r, int g, int b)
    {
        Paint paint = new Paint();
        canvas.drawPaint(paint);
        paint.setColor(Color.BLACK);
        paint.setTextSize(size);
        canvas.drawText(text, drawX, drawY, paint);
    }
}