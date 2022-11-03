package com.example.multithreading;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit;
    TextView textView1;
    TextView textView2;
    Button button;
    boolean twice = false;
    Thread t=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = findViewById(R.id.edit);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runthread();
                runthread1();
            }
        });
    }
    private void runthread1() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                textView1.setText("Ass_ 9 _ Multithreading ");
            }
        });
    }
    private void runthread() {
        twice = true;
        if (twice) {
            final String s1 = edit.getText().toString();
            t = new Thread(new Runnable() {
                @Override
                public void run() {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            textView2.setText(t.getName());
                            twice = false;
                        }
                    });
                }
            });
            t.start();
            t.setName(s1);
            t.setPriority(Thread.MAX_PRIORITY);
        }
    }
}