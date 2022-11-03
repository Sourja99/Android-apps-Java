package com.example.myapplication_7;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    myCanvas myCanvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myCanvas = new myCanvas(this);
        myCanvas.setBackgroundColor(Color.LTGRAY);
        setContentView(myCanvas);
    }
}