package com.example.cs441customdrawingandroid;

import androidx.appcompat.app.AppCompatActivity;





import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.hw3.R;

//Ali Mert Doganay
public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private DrawLine drawLine = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout = (LinearLayout) findViewById(R.id.viewLayout);
        drawLine = new DrawLine(getApplicationContext());

        layout.addView(drawLine);


        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);

        //drawing button
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                drawLine.draw();
            }
        });

        //redrawing button
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawLine.ReDrawLine();
            }
        });
    }
}