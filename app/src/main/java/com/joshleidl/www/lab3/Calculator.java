package com.joshleidl.www.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    public void clearScreen(View view)
    {
        TextView calcScreen = (TextView) findViewById(R.id.CalcScreen);
        calcScreen.setText("");

        calcScreen.invalidate();
    }

    public void typeToScreen(View view)
    {
        TextView calcScreen = (TextView) findViewById(R.id.CalcScreen);

        Button button = (Button) view;
        calcScreen.append(button.getText());

        calcScreen.invalidate();
    }
}
