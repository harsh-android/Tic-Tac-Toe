package com.train.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView i1, i2, i3, i4, i5, i6, i7, i8, i9;

    List<Integer> cross = new ArrayList<>();
    List<Integer> circle = new ArrayList<>();

    int count = 1;
    CardView reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reset = findViewById(R.id.reset);
        i1 = findViewById(R.id.i1);
        i2 = findViewById(R.id.i2);
        i3 = findViewById(R.id.i3);
        i4 = findViewById(R.id.i4);
        i5 = findViewById(R.id.i5);
        i6 = findViewById(R.id.i6);
        i7 = findViewById(R.id.i7);
        i8 = findViewById(R.id.i8);
        i9 = findViewById(R.id.i9);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResetData();
            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count % 2 == 0) {
                    circle.add(1);
                    checkCircle();
                    i1.setImageResource(R.drawable.circle);
                } else {
                    cross.add(1);
                    checkCross();
                    i1.setImageResource(R.drawable.cross);
                }
                count++;
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count % 2 == 0) {
                    circle.add(2);
                    checkCircle();
                    i2.setImageResource(R.drawable.circle);
                } else {
                    cross.add(2);
                    checkCross();
                    i2.setImageResource(R.drawable.cross);
                }
                count++;
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count % 2 == 0) {
                    circle.add(3);
                    checkCircle();
                    i3.setImageResource(R.drawable.circle);
                } else {
                    cross.add(3);
                    checkCross();
                    i3.setImageResource(R.drawable.cross);
                }
                count++;
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count % 2 == 0) {
                    circle.add(4);
                    checkCircle();
                    i4.setImageResource(R.drawable.circle);
                } else {
                    cross.add(4);
                    checkCross();
                    i4.setImageResource(R.drawable.cross);
                }
                count++;
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count % 2 == 0) {
                    circle.add(5);
                    checkCircle();
                    i5.setImageResource(R.drawable.circle);
                } else {
                    cross.add(5);
                    checkCross();
                    i5.setImageResource(R.drawable.cross);
                }
                count++;
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count % 2 == 0) {
                    circle.add(6);
                    checkCircle();
                    i6.setImageResource(R.drawable.circle);
                } else {
                    cross.add(6);
                    checkCross();
                    i6.setImageResource(R.drawable.cross);
                }
                count++;
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count % 2 == 0) {
                    circle.add(7);
                    checkCircle();
                    i7.setImageResource(R.drawable.circle);
                } else {
                    cross.add(7);
                    checkCross();
                    i7.setImageResource(R.drawable.cross);
                }
                count++;
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count % 2 == 0) {
                    circle.add(8);
                    checkCircle();
                    i8.setImageResource(R.drawable.circle);
                } else {
                    cross.add(8);
                    checkCross();
                    i8.setImageResource(R.drawable.cross);
                }
                count++;
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count % 2 == 0) {
                    circle.add(9);
                    checkCircle();
                    i9.setImageResource(R.drawable.circle);
                } else {
                    cross.add(9);
                    checkCross();
                    i9.setImageResource(R.drawable.cross);
                }
                count++;
            }
        });


    }

    private void ResetData() {
        count = 1;
        cross.clear();
        circle.clear();
        i1.setImageResource(0);
        i2.setImageResource(0);
        i3.setImageResource(0);
        i4.setImageResource(0);
        i5.setImageResource(0);
        i6.setImageResource(0);
        i7.setImageResource(0);
        i8.setImageResource(0);
        i9.setImageResource(0);
    }

    private void checkCross() {
        for (int i = 0; i < cross.size(); i++) {
            for (int j = 0; j < cross.size(); j++) {
                for (int k = 0; k < cross.size(); k++) {

                    if (cross.get(i) == 1 && cross.get(j) == 2 && cross.get(k) == 3 ) {

                        WinCross();
                    }
                    if (cross.get(i) == 4 && cross.get(j) == 5 && cross.get(k) == 6 ) {

                        WinCross();
                    }
                    if (cross.get(i) == 7 && cross.get(j) == 8 && cross.get(k) == 9 ) {

                        WinCross();
                    }
                    if (cross.get(i) == 1 && cross.get(j) == 4 && cross.get(k) == 7 ) {

                        WinCross();
                    }
                    if (cross.get(i) == 2 && cross.get(j) == 5 && cross.get(k) == 8) {

                        WinCross();
                    }
                    if (cross.get(i) == 3 && cross.get(j) == 6 && cross.get(k) == 9) {

                        WinCross();
                    }
                    if (cross.get(i) == 1 && cross.get(j) == 5 && cross.get(k) == 9 ) {

                        WinCross();
                    }
                    if (cross.get(i) == 3 && cross.get(j) == 5 && cross.get(k) == 7 ) {

                        WinCross();
                    }

                }
            }
        }

    }
    private void checkCircle() {
        for (int i = 0; i < circle.size(); i++) {
            for (int j = 0; j < circle.size(); j++) {
                for (int k = 0; k < circle.size(); k++) {

                    if (circle.get(i) == 1 && circle.get(j) == 2 && circle.get(k) == 3 ) {

                        WinCircle();
                    }
                    if (circle.get(i) == 4 && circle.get(j) == 5 && circle.get(k) == 6 ) {

                        WinCircle();
                    }
                    if (circle.get(i) == 7 && circle.get(j) == 8 && circle.get(k) == 9 ) {

                        WinCircle();
                    }
                    if (circle.get(i) == 1 && circle.get(j) == 4 && circle.get(k) == 7 ) {

                        WinCircle();
                    }
                    if (circle.get(i) == 2 && circle.get(j) == 5 && circle.get(k) == 8) {

                        WinCircle();
                    }
                    if (circle.get(i) == 3 && circle.get(j) == 6 && circle.get(k) == 9) {

                        WinCircle();
                    }
                    if (circle.get(i) == 1 && circle.get(j) == 5 && circle.get(k) == 9 ) {

                        WinCircle();
                    }
                    if (circle.get(i) == 3 && circle.get(j) == 5 && circle.get(k) == 7 ) {

                        WinCircle();
                    }

                }
            }
        }

    }

    @SuppressLint("ResourceAsColor")
    private void WinCircle() {
        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.win);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.R.color.transparent));

        CardView reset = dialog.findViewById(R.id.reset);
        ImageView img = dialog.findViewById(R.id.img);
        img.setImageResource(R.drawable.circle);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResetData();
                dialog.dismiss();
            }
        });

        dialog.show();

    }

    @SuppressLint("ResourceAsColor")
    private void WinCross() {
        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.win);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.R.color.transparent));

        CardView reset = dialog.findViewById(R.id.reset);
        ImageView img = dialog.findViewById(R.id.img);
        img.setImageResource(R.drawable.cross);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResetData();
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}