package com.example.madt_lab1_makeyenka;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.tv);
    }

    public void changeText(View view) {
        tv.setText("You pressed the button");
    }

    public void changeColor(View view) {
        tv.setTextColor(Color.RED);
    }
}