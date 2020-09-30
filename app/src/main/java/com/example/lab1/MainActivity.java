package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView tvleft;
    private TextView tvright;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvleft = findViewById(R.id.textleft);
        this.tvright = findViewById(R.id.textright);
            }


    public void onButtonClick(View view) {
        String left = this.tvleft.getText().toString();
        String right = this.tvright.getText().toString();
        String thestring = "Pakeista";
        if(left.equals(thestring)){
            this.tvleft.setText("Nepakeista");
        } else {
            this.tvleft.setText("Pakeista");
        }
        if(right.equals(thestring)){
            this.tvright.setText("Nepakeista");
        } else {
            this.tvright.setText("Pakeista");
        }}

    public void on2ButtonClick(View view) {
        Random rand = new Random();
        int randomRed = rand.nextInt(255);
        int randomBlue = rand.nextInt(255);
        int randomGreen = rand.nextInt(255);
        this.tvleft.setTextColor(Color.rgb(randomRed, randomGreen, randomBlue));
        this.tvright.setTextColor(Color.rgb(randomRed, randomGreen, randomBlue));

    }
}