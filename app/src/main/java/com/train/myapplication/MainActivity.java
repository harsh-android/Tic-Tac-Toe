package com.train.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1 = findViewById(R.id.i1);
        i2 = findViewById(R.id.i2);
        i3 = findViewById(R.id.i3);
        i4 = findViewById(R.id.i4);
        i5 = findViewById(R.id.i5);
        i6 = findViewById(R.id.i6);
        i7 = findViewById(R.id.i7);
        i8 = findViewById(R.id.i8);
        i9 = findViewById(R.id.i9);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count%2==0) {
                    i1.setImageResource(R.drawable.circle);
                } else {
                    i1.setImageResource(R.drawable.cross);
                }
                count++;
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count%2==0) {
                    i2.setImageResource(R.drawable.circle);
                } else {
                    i2.setImageResource(R.drawable.cross);
                }
                count++;
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count%2==0) {
                    i3.setImageResource(R.drawable.circle);
                } else {
                    i3.setImageResource(R.drawable.cross);
                }
                count++;
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count%2==0) {
                    i4.setImageResource(R.drawable.circle);
                } else {
                    i4.setImageResource(R.drawable.cross);
                }
                count++;
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count%2==0) {
                    i5.setImageResource(R.drawable.circle);
                } else {
                    i5.setImageResource(R.drawable.cross);
                }
                count++;
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count%2==0) {
                    i6.setImageResource(R.drawable.circle);
                } else {
                    i6.setImageResource(R.drawable.cross);
                }
                count++;
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count%2==0) {
                    i7.setImageResource(R.drawable.circle);
                } else {
                    i7.setImageResource(R.drawable.cross);
                }
                count++;
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count%2==0) {
                    i8.setImageResource(R.drawable.circle);
                } else {
                    i8.setImageResource(R.drawable.cross);
                }
                count++;
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count%2==0) {
                    i9.setImageResource(R.drawable.circle);
                } else {
                    i9.setImageResource(R.drawable.cross);
                }
                count++;
            }
        });


    }
}