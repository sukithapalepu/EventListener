package com.example.eventlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ProgressDialog progress;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progress = new ProgressDialog(this);

         b1 = (Button) findViewById(R.id.button);
         b2 = (Button) findViewById(R.id.button2);
         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 TextView textView = (TextView) findViewById(R.id.textView);
                 textView.setTextSize(40);
             }
         });
         b2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 TextView textView = (TextView) findViewById(R.id.textView);
                 textView.setTextSize(55);
             }
         });

    }
}
