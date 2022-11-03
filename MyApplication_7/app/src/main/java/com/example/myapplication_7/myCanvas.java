package com.example.myapplication_7;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.view.View;
import androidx.annotation.RequiresApi;

public class myCanvas extends View {
    Paint paint,paint1;
    Path path,path1,path2;
    int ax,ay,half;
    int x,y,halfW;

    public myCanvas(Context context) {
        super(context);
        paint = new Paint();
        paint1 = new Paint();
        path = new Path();
        path1 = new Path();
        path2 = new Path();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.BLACK);
        paint.setTextSize(50);

        /*    Rectangle   */
        paint1.setColor(Color.YELLOW);
        canvas.drawText("Rectangle", 100, 150, paint);
        canvas.drawRect(100, 200, 350, 700, paint1);

        /*    Square   */
        paint1.setColor(Color.CYAN);
        canvas.drawText("Square", 120, 800, paint);
        canvas.drawRect(50, 850, 350, 1150, paint1);

        /*    Circle   */
        paint1.setColor(Color.GREEN);
        canvas.drawText("Circle", 520, 150, paint);
        canvas.drawCircle(600, 350, 150,paint1);

        /*    Triangle   */
        half=180;
        ax=600;
        ay=950;
        paint1.setColor(Color.RED);
        canvas.drawText("Triangle", 520, 700, paint);
        path.moveTo(ax,ay- half);
        path.lineTo(ax - half, ay + half);
        path.lineTo(ax + half, ay + half);
        path.lineTo( ax,ay - half);
        path.close();
        canvas.drawPath(path, paint1);

        /*    Line   */
        canvas.drawText("Line", 880, 600, paint);
        canvas.drawLine(920, 650, 920, 1150, paint);

        /*    Arc   */
        paint1.setColor(Color.MAGENTA);
        canvas.drawText("Arc", 850, 150, paint);
        canvas.drawArc(590,10,1020,450,0F,60F,true,paint1);

        /*    Rhombus   */
        x=320;
        y=1500;
        halfW=270;
        paint1.setColor(Color.BLUE);
        canvas.drawText("Rhombus", 200, 1850, paint);
        path1.moveTo(x, y + halfW); // Top
        path1.lineTo(x - halfW, y); // Left
        path1.lineTo(x, y - halfW); // Bottom
        path1.lineTo(x + halfW, y); // Right
        path1.lineTo(x, y + halfW); // Back to Top
        path1.close();
        canvas.drawPath(path1, paint1);

        //
        paint1.setTextSize(80);
        paint1.setColor(Color.MAGENTA);
        paint1.setStrokeWidth(5);
        paint1.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.MAGENTA);
        paint.setTextSize(120);
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawText("Shapes using", 599, 1500, paint1);
        canvas.drawText("CANVAS", 600, 1640, paint);
        }
    }

