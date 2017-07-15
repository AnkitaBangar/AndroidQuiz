package com.example.administrator.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclickjava(View v) {
       if (v.getId() == R.id.B1) {
           Intent i = new Intent(MainActivity.this, QuizActivity.class);
           startActivity(i);
       }

    }
    public void onclickandroid(View v) {
        if (v.getId() == R.id.b2) {
            Intent i = new Intent(MainActivity.this, quizactivity2.class);
            startActivity(i);
        }

    }
}
