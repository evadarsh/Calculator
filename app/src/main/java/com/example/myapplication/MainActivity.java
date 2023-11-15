package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText no1,no2,result;
    Button plus;
    Button subtract;
    Button multiply;
    Button division;
    Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no1 = findViewById(R.id.editText1);
        no2 = findViewById(R.id.editText2);
        result = findViewById(R.id.editTextresult);
        plus = findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int a  = Integer.parseInt(no1.getText().toString());
                    int b  = Integer.parseInt(no2.getText().toString());
                    int c  = a + b;
                    result.setText(String.valueOf(c));
                }
                catch (NumberFormatException e){
                    result.setText("");
                }
            }
        });
        subtract = findViewById(R.id.subtract);
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int a  = Integer.parseInt(no1.getText().toString());
                    int b  = Integer.parseInt(no2.getText().toString());
                    int c  = a - b;
                    result.setText(String.valueOf(c));
                } catch (NumberFormatException e){
                    result.setText("");
                }

            }
        });
        multiply = findViewById(R.id.multiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int a  = Integer.parseInt(no1.getText().toString());
                    int b  = Integer.parseInt(no2.getText().toString());
                    int c  = a * b;
                    result.setText(String.valueOf(c));
                } catch (NumberFormatException e){
                    result.setText("");
                }

            }
        });
        division = findViewById(R.id.division);
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double a = Integer.parseInt(no1.getText().toString());
                    double b  = Integer.parseInt(no2.getText().toString());
                    double c  = a / b;
                    result.setText(String.valueOf(c));
                }
                catch (NumberFormatException e){
                    result.setText("");
                }

            }
        });
        clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    no1.setText("");
                    no2.setText("");
                    result.setText("");
                }
                catch (NumberFormatException e){
                    result.setText("");
                }

            }
        });
    }
}
