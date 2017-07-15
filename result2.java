package com.example.administrator.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 6/25/2017.
 */

public class result2 extends quizactivity2 {
    TextView mgrade2,mfinalscore2;
    Button mretry2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result2);

        mgrade2=(TextView)findViewById(R.id.grade2);
        mfinalscore2=(TextView)findViewById(R.id.outof2);
        mretry2=(Button)findViewById(R.id.retry2);
        Bundle bundle=getIntent().getExtras();
        int score2=bundle.getInt("finalscore2");
        mfinalscore2.setText("You scored  "  +score2+  "  Out of 20 ");
        if(score2==20){
            mgrade2.setText("outstanding!!");


        }else if(score2==19){
            mgrade2.setText("good work!!");


        }
        else if(score2==18){
            mgrade2.setText("well done!!");}
        else if(score2==17){
            mgrade2.setText("GOOD");}
        else if(score2==16){
            mgrade2.setText("GOOD WORK!!");}
        else if(score2==15){
            mgrade2.setText("well done!!");}

        else{
            mgrade2.setText("You will do better next time :)");
        }
        mretry2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(result2.this,quizactivity2.class));
                result2.this.finish();
            }
        });

    }

}
