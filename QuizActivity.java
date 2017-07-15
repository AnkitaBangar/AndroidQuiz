package com.example.administrator.quizapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 6/24/2017.
 */

public class QuizActivity extends MainActivity {

   private question mquestion=new question();
  //  private TextView mquestion;
    private TextView mscoreview;
    private  TextView mquestionview;
    private Button mbchoice1;
    private Button mbchoice2;
    private Button mbchoice3;
    private Button mbchoice4;
    private String manswer;
    private int mscore=0;
    private int mquestionnumber=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mscoreview=(TextView)findViewById(R.id.score);
        mquestionview=(TextView)findViewById(R.id.question);
        mbchoice1=(Button)findViewById(R.id.choice1);
        mbchoice2=(Button)findViewById(R.id.choice2);
        mbchoice3=(Button)findViewById(R.id.choice3);
        mbchoice4=(Button)findViewById(R.id.choice4);


        updatequestion();

        mbchoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(mbchoice1.getText()==manswer) {
                    mscore = mscore + 1;
                    updatescore(mscore);


                    if (mquestionnumber == question.mquestion.length) {
                        Intent i = new Intent(QuizActivity.this, result.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore", mscore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updatequestion();
                    }
                }

                else  {
                    if (mquestionnumber == question.mquestion.length) {
                        Intent i = new Intent(QuizActivity.this, result.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore", mscore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {


                        updatequestion();
                    }

                }
                  /*  Toast.makeText(QuizActivity.this,"correct answer",Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(QuizActivity.this,"wrong answer",Toast.LENGTH_SHORT).show();
                    updatequestion();

                }
*/


            }
        });
        mbchoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(mbchoice2.getText()==manswer) {
                    mscore = mscore + 1;
                    updatescore(mscore);
                    updatequestion();
                    if (mquestionnumber == question.mquestion.length) {
                        Intent i = new Intent(QuizActivity.this, result.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore", mscore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);

//                    Toast.makeText(QuizActivity.this,"correct answer",Toast.LENGTH_SHORT).show();

                    } else {
                        updatequestion();
                    }
                }
                else {
                    if (mquestionnumber == question.mquestion.length) {
                        Intent i = new Intent(QuizActivity.this, result.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore", mscore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {


                        updatequestion();
                    }

                }

                   /* Toast.makeText(QuizActivity.this,"wrong answer",Toast.LENGTH_SHORT).show();
                    updatequestion();
*/
                }



        });
        mbchoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (mbchoice3.getText() == manswer) {
                    mscore = mscore + 1;
                    updatescore(mscore);
                    updatequestion();
                    if (mquestionnumber == question.mquestion.length) {
                        Intent i = new Intent(QuizActivity.this, result.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore", mscore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);

//                    Toast.makeText(QuizActivity.this,"correct answer",Toast.LENGTH_SHORT).show();

                    } else {
//                    Toast.makeText(QuizActivity.this,"wrong answer",Toast.LENGTH_SHORT).show();
                        updatequestion();

                    }

                } else {
                    if (mquestionnumber == question.mquestion.length) {
                        Intent i = new Intent(QuizActivity.this, result.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore", mscore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {


                        updatequestion();
                    }

                }
            }


        });
        mbchoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(mbchoice4.getText()==manswer) {
                    mscore = mscore + 1;
                    updatescore(mscore);


                    if (mquestionnumber == question.mquestion.length) {
                        Intent i = new Intent(QuizActivity.this, result.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore", mscore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updatequestion();
                    }
                }

                else  {
                    if (mquestionnumber == question.mquestion.length) {
                        Intent i = new Intent(QuizActivity.this, result.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore", mscore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {


                        updatequestion();
                    }

                }
                  /*  Toast.makeText(QuizActivity.this,"correct answer",Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(QuizActivity.this,"wrong answer",Toast.LENGTH_SHORT).show();
                    updatequestion();

                }
*/


            }
        });

    }
    private void updatescore(int point){
        mscoreview.setText("" +mscore);

    }


    private void updatequestion(){
       mquestionview.setText(mquestion.getquestion(mquestionnumber));
        mbchoice1.setText(mquestion.getchoice1(mquestionnumber));
        mbchoice2.setText(mquestion.getchoice2(mquestionnumber));

        mbchoice3.setText(mquestion.getchoice3(mquestionnumber));
        mbchoice4.setText(mquestion.getchoice4(mquestionnumber));
        manswer=mquestion.getcorrectans(mquestionnumber);
        mquestionnumber++;



    }
    public void clickExit(View v)
    {
        finish();
    }
    public void onBackPressed(){
        AlertDialog.Builder builder=new AlertDialog.Builder(QuizActivity.this);
        builder.setMessage("Do you want to leave quiz?");
        builder.setCancelable(true);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                finish();

            }
        });
        builder.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert=builder.create();
        alert.show();
    }


}
