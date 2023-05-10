package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] BUTTONS = new int[]{
                R.id.button2,
                R.id.button3,
                R.id.button4,
                R.id.button6,
                R.id.button7,
                R.id.button9,
                R.id.button10,
                R.id.button11,
                R.id.button12,
                R.id.button13,
                R.id.button14,
                R.id.button15,
                R.id.button16,
                R.id.button17,
                R.id.button18,
                R.id.button19
        };

        TextView resultText = findViewById(R.id.calculateResult);

        for(int buttonID : BUTTONS) {
            Button button = findViewById(buttonID);
            button.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    String buttonText = button.getText().toString().trim();
                    if(resultText.getText().toString().equals("0")) {
                        resultText.setText(buttonText);
                        return;
                    }
                    if(buttonText.equals("=")) {
                        Toast.makeText(MainActivity.this, resultText.getText().toString(), Toast.LENGTH_SHORT).show();
                        return;
                    }
                    resultText.setText(resultText.getText()+buttonText);
                }
            });
        }
    }
}