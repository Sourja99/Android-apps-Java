package com.example.myapplication_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed = findViewById(R.id.Email);
        Button button1 = findViewById(R.id.button2);
        button1.setOnClickListener(v -> openregister_form());
    }
    public void openregister_form() {
        Intent intent = new Intent(this,Register_form.class);
        startActivity(intent);
    }
}