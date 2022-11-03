package com.example.gui_app;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    View screenView;
    Button background;
    int[] color;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        color=new int[]{Color.BLUE,Color.GREEN,Color.YELLOW,Color.CYAN,Color.MAGENTA,Color.GRAY,Color.RED};

        screenView= findViewById(R.id.rView);
        background= (Button) findViewById(R.id.button3);
        background.setOnClickListener(v -> {
            int aryLength = color.length;

            Random random = new Random();
            int cNum = random.nextInt(aryLength);
            screenView.setBackgroundColor(color[cNum]);
        });
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(v -> openChange_size());

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(v -> openChange_color());

        Button b4= findViewById(R.id.button4);
        b4.setOnClickListener(v -> finish());
    }
    public void openChange_size() {
        Intent intent = new Intent(this,Size_change.class);
        startActivity(intent);
    }
    public void openChange_color() {
        Intent intent = new Intent(this,Color_change.class);
        startActivity(intent);
    }
}
