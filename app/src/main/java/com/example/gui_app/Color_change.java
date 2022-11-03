package com.example.gui_app;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Color_change extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_change);
        final TextView t = findViewById(R.id.textView);

        Button b8 = findViewById(R.id.button8);
        b8.setOnClickListener(v -> t.setTextColor(Color.YELLOW));

        Button b9 = findViewById(R.id.button9);
        b9.setOnClickListener(v -> t.setTextColor(Color.BLUE));

        Button b10 = findViewById(R.id.button10);
        b10.setOnClickListener(v -> t.setTextColor(Color.RED));

        Button b11 = findViewById(R.id.button11);
        b11.setOnClickListener(v -> t.setTextColor(Color.GREEN));

        Button b12 = findViewById(R.id.button12);
        b12.setOnClickListener(v -> t.setTextColor(Color.GRAY));

        Button b13 = findViewById(R.id.button13);
        b13.setOnClickListener(v -> finish());
    }
}

