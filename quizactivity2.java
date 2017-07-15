package com.example.administrator.quizapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 6/25/2017.
 */

public class quizactivity2 extends MainActivity
{
    private questionlist mquestion2=new questionlist();
    //  private TextView mquestion;
    private TextView mscoreview2;
    private  TextView mquestionview2;
    private Button mbchoice11;
    private Button mbchoice12;
    private Button mbchoice13;
    private Button mbchoice14;
    private String manswer2;
    private int mscore2=0;
    private int mquestionnumber2=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        mscoreview2=(TextView)findViewById(R.id.score2);
        mquestionview2=(TextView)findViewById(R.id.question2);
        mbchoice11=(Button)findViewById(R.id.choice11);
        mbchoice12=(Button)findViewById(R.id.choice12);
        mbchoice13=(Button)findViewById(R.id.choice13);
        mbchoice14=(Button)findViewById(R.id.choice14);

        updatequestion2();

        mbchoice11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(mbchoice11.getText()==manswer2) {
                    mscore2 = mscore2 + 1;
                    updatescore2(mscore2);


                    if (mquestionnumber2 == questionlist.mquestion2.length) {
                        Intent i = new Intent(quizactivity2.this, result2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore2", mscore2);
                        i.putExtras(bundle);
                        quizactivity2.this.finish();
                        startActivity(i);
                    } else {
                        updatequestion2();
                    }
                }

                else  {
                    if (mquestionnumber2 == questionlist.mquestion2.length) {
                        Intent i = new Intent(quizactivity2.this, result2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore2", mscore2);
                        i.putExtras(bundle);
                        quizactivity2.this.finish();
                        startActivity(i);
                    } else {


                        updatequestion2();
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
        mbchoice12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(mbchoice12.getText()==manswer2) {
                    mscore2 = mscore2 + 1;
                    updatescore2(mscore2);
                    updatequestion2();
                    if (mquestionnumber2 == questionlist.mquestion2.length) {
                        Intent i = new Intent(quizactivity2.this, result2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore2", mscore2);
                        i.putExtras(bundle);
                        quizactivity2.this.finish();
                        startActivity(i);

//                    Toast.makeText(QuizActivity.this,"correct answer",Toast.LENGTH_SHORT).show();

                    } else {
                        updatequestion2();
                    }
                }
                else {
                    if (mquestionnumber2 == questionlist.mquestion2.length) {
                        Intent i = new Intent(quizactivity2.this, result2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore2", mscore2);
                        i.putExtras(bundle);
                        quizactivity2.this.finish();
                        startActivity(i);
                    } else {


                        updatequestion2();
                    }

                }

                   /* Toast.makeText(QuizActivity.this,"wrong answer",Toast.LENGTH_SHORT).show();
                    updatequestion();
*/
            }



        });
        mbchoice13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (mbchoice13.getText() == manswer2) {
                    mscore2 = mscore2 + 1;
                    updatescore2(mscore2);
                    updatequestion2();
                    if (mquestionnumber2 == questionlist.mquestion2.length) {
                        Intent i = new Intent(quizactivity2.this, result2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore2", mscore2);
                        i.putExtras(bundle);
                        quizactivity2.this.finish();
                        startActivity(i);

//                    Toast.makeText(QuizActivity.this,"correct answer",Toast.LENGTH_SHORT).show();

                    } else {
//                    Toast.makeText(QuizActivity.this,"wrong answer",Toast.LENGTH_SHORT).show();
                        updatequestion2();

                    }

                } else {
                    if (mquestionnumber2 == questionlist.mquestion2.length) {
                        Intent i = new Intent(quizactivity2.this, result2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore2", mscore2);
                        i.putExtras(bundle);
                        quizactivity2.this.finish();
                        startActivity(i);
                    } else {


                        updatequestion2();
                    }

                }
            }


        });
        mbchoice14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(mbchoice14.getText()==manswer2) {
                    mscore2 = mscore2 + 1;
                    updatescore2(mscore2);


                    if (mquestionnumber2 == questionlist.mquestion2.length) {
                        Intent i = new Intent(quizactivity2.this, result2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore2", mscore2);
                        i.putExtras(bundle);
                        quizactivity2.this.finish();
                        startActivity(i);
                    } else {
                        updatequestion2();
                    }
                }

                else  {
                    if (mquestionnumber2 == questionlist.mquestion2.length) {
                        Intent i = new Intent(quizactivity2.this, result2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore2", mscore2);
                        i.putExtras(bundle);
                        quizactivity2.this.finish();
                        startActivity(i);
                    } else {


                        updatequestion2();
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
    private void updatescore2(int point){
        mscoreview2.setText("" +mscore2);

    }


    private void updatequestion2(){
        mquestionview2.setText(mquestion2.getquestion2(mquestionnumber2));
        mbchoice11.setText(mquestion2.getchoice11(mquestionnumber2));
        mbchoice12.setText(mquestion2.getchoice12(mquestionnumber2));

        mbchoice13.setText(mquestion2.getchoice13(mquestionnumber2));
        mbchoice14.setText(mquestion2.getchoice14(mquestionnumber2));
        manswer2=mquestion2.getcorrectans2(mquestionnumber2);
        mquestionnumber2++;



    }

    public void clickExit(View v)
    {
        finish();
    }
    public void onBackPressed(){
        AlertDialog.Builder builder=new AlertDialog.Builder(quizactivity2.this);
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
