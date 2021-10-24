package com.example.arithmeticaverage;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText firstNumberInput;
    private EditText secondNumberInput;

    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberInput = findViewById(R.id.FirstNumberInput);
        secondNumberInput = findViewById(R.id.SecondNumberInput);

        resultText = findViewById(R.id.textInstructions);
    }
    public void Calculate(View view){
        String value1 = firstNumberInput.getText().toString();
        String value2 = secondNumberInput.getText().toString();

        double num1 = Double.parseDouble(value1);
        double num2 = Double.parseDouble(value2);

        double result = (num1 + num2) / 2;

        resultText.setText(String.valueOf(result));
    }
    public void Reset(View view){
        firstNumberInput.setText("");
        secondNumberInput.setText("");
        resultText.setText(R.string.Instructions);
    }
}