package com.example.calculator_1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText ed;
    boolean input = true;
    String op = "+";
    String p_num="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed = findViewById(R.id.edit);
    }

    @SuppressLint("NonConstantResourceId")
    public void activity(View view){

        if(input)
            ed.setText("");
        input = false;
        String number = ed.getText().toString();

        switch (view.getId()){
            case R.id.button_0:
                number += "0";
                break;
            case R.id.button_1:
                number += "1";
                break;
            case R.id.button_2:
                number += "2";
                break;
            case R.id.button_3:
                number += "3";
                break;
            case R.id.button_4:
                number += "4";
                break;
            case R.id.button_5:
                number += "5";
                break;
            case R.id.button_6:
                number += "6";
                break;
            case R.id.button_7:
                number += "7";
                break;
            case R.id.button_8:
                number += "8";
                break;
            case R.id.button_9:
                number += "9";
                break;
            case R.id.button_decimal:
                number += ".";
                break;
        }
       ed.setText(number);
    }

    @SuppressLint("NonConstantResourceId")
    public void operation(View view){
        input=true;
        p_num=ed.getText().toString();
        switch(view.getId()){
            case R.id.divide: op = "÷";break;
            case R.id.button_mul: op = "×";break;
            case R.id.button_add: op = "+";break;
            case R.id.button_sub: op = "-";break;
            case R.id.change_sign: op = " ^ ";break;
        }
    }
    public void click_equal(View view){
        String n_Num = ed.getText().toString();
        double result = 0.0;
        switch (op){
            case "+":
                result=Double.parseDouble(p_num)+Double.parseDouble(n_Num);
                break;
            case "-":
                result=Double.parseDouble(p_num) - Double.parseDouble(n_Num);
                break;
            case "×":
                result=Double.parseDouble(p_num) * Double.parseDouble(n_Num);
                break;
            case "÷":
                result=Double.parseDouble(p_num) / Double.parseDouble(n_Num);
                break;
            case " ^ ":
                result=Math.pow(Double.parseDouble(p_num),Double.parseDouble(n_Num));
                break;
        }
        ed.setText(result+"");
    }
    public void clear_content(View view){
        ed.setText("0");
        input=true;
    }
    public void percentage(View view){
        double no = Double.parseDouble(ed.getText().toString())/100;
        ed.setText(no+"");
        input=true;
    }
}