package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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
}