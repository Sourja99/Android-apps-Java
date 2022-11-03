package com.example.gui_app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Size_change extends AppCompatActivity
{
    float font1=40;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size_change);
        final TextView t= findViewById(R.id.textView);
        Button b5= findViewById(R.id.button5);
        b5.setOnClickListener(v ->{
            t.setTextSize(font1+5);
            font1 = font1 + 5;
            if (font1 == 90) {
                font1 = 40;
                Toast.makeText(getApplicationContext(), "Text font size cannot be increased further", Toast.LENGTH_LONG).show();
            }
        });
        Button b6= findViewById(R.id.button6);
        b6.setOnClickListener(v -> {
            t.setTextSize(font1-5);
            font1 = font1 - 5;
            if (font1 == 20) {
                font1 = 40;
                Toast.makeText(getApplicationContext(), "Text font size cannot be decreased further", Toast.LENGTH_LONG).show();
            }
        });
        Button b7= findViewById(R.id.button7);
        b7.setOnClickListener(v -> finish());
    }
}
