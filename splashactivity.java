package com.example.administrator.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 6/28/2017.
 */

public class splashactivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable(){
            @Override
                    public void run(){
                Intent i=new Intent(splashactivity.this,MainActivity.class);
                startActivity(i);
                finish();


            }
        },SPLASH_TIME_OUT);
    }
}
