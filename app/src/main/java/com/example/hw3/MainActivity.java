package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private DrawLine drawLine = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout = (LinearLayout) findViewById(R.id.viewLayout);
        drawLine = new DrawLine(getApplicationContext());
        layout.addView(drawLine);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawLine.draw();
            }
        });
    }
}