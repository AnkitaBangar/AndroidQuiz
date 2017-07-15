package com.example.administrator.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 6/24/2017.
 */

public class result extends QuizActivity {

    TextView mgrade,mfinalscore;
            Button mretry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        mgrade=(TextView)findViewById(R.id.grade);
        mfinalscore=(TextView)findViewById(R.id.outof);
        mretry=(Button)findViewById(R.id.retry);
        Bundle bundle=getIntent().getExtras();
        int score=bundle.getInt("finalscore");
        mfinalscore.setText("You scored  "  +score+  "  Out of 20 " );
        if(score==20){
            mgrade.setText("outstanding!!");


        }else if(score==19){
            mgrade.setText("good work!!");


        }
        else if(score==18){
            mgrade.setText("well done!!");}
        else if(score==17){
            mgrade.setText("GOOD");}
        else if(score==16){
            mgrade.setText("GOOD WORK!!");}
        else if(score==15){
            mgrade.setText("well done!!");}

        else{
            mgrade.setText("You will do better next time :)");
        }
        mretry.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(result.this,QuizActivity.class));
                result.this.finish();
            }
        });

    }


}
