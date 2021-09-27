package com.example.madt_lab1_makeyenka;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText("You pressed the button");
    }

    public void changeColor(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setTextColor(Color.RED);
    }
}