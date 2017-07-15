package com.example.administrator.quizapp;

/**
 * Created by Administrator on 6/24/2017.
 */

public class question {

    public static String[] mquestion=new String[]
            {
                    "Who is considered as the creator of JAVA?",
                    "JVM stands for?",
                    "JRE stands for?",
                    "Java source codes are compiled and converted to?",
                    "What is the Extension of java bytecodes?",
                   /* "Garbage collection takes place automatically in JVM",
                    "JVM is platform independent",*/
                    "What is the name of the method used to start a thread execution?",
                    "public class Test{} What is the prtotype of the default constructor?",
                    "File class is included in which package?",
                    "In java,Objects are passed as",
                    "All exception types are subclasses of the built-in class",
                    "Which method names follow the JavaBeans standard",
                    "____ is a basic unit of storage in java",
                    "what is the default data type of a decimal number in java?",
                    "Which of these selection statements test only for equality?",
                    "Which of these keyword is used to make a class?",
                    "Which of the following is a valid declaration of an object of class Box?",
                    "Which of these operators is used to allocate memory for an object?",
                    "What is the return type of a method that does not returns any value?",
                    "Which method can be defined only once in a program",
                    "To prevent any method from overriding,we declare the method as,",
                    "A protected member can not be accessed in",
                    "In object-oriented programmming,the process by which one object acquires the properties of another object is called",
                    "JAR stand for?",
                    "___is the name given to variable,class or mathod",
                    "Which of the following can not be used as the first letter to form a valid java identifier?",
                    "JVM stands for?",
                    " ____ is a basic unit of storage in java",
                  //  "File class is included in which package?"
                   // "In a class defination,the spacial method provided to be called to create an instatnce of that class is known as a/an"
            };
    private String mchoice [][]={
            {"Ken Thompson","Dennis Richie","James Gosling","Bjarne Stroupstrup"},
            {"Java Virtual Machine","Java Verified Machine","Java Very Large Machine","Java very small machine"},
            {"Java runtime Enviornment","Java Rapid Enterprise","Java reak Enviornment","none of the above"},
            {"Assemblycodes","Objectscode","Binarycodes","Bytecodes"},
            {".class",".java",".bc","none of the above"},
           /* {"FALSE","TRUE"},
            {"true","false"},*/
            {"start()","init()","run()","resume()"},
            {"Test(void)","Test()","public Test()","public Test(void)"},
            {"java.lang","java.io","java.awt","java.net"},
            {"method called call by value","copy of that object","memory address","constructor"},
            {"RuntimeException","Exception","Error","Throwable"},
            {"getCust","addSize","deleteRep","putDimensions"},
            {"variable","identifiers","constant","memory"},
            {"float","int","double","long"},
            {"switch","if","if and switch","none of the above"},
            {"struct","class","int","none of the above"},
            {"Box obj=new Box;","Box obj=new Box();","obj=new Box();","new Box obj;"},
            {"alloc","malloc","new","give"},
            {"float","int","void","double"},
            {"finalize method","main method","static method","private method"},
            {"const","static","final","abstract"},
            {"a non-subclass of the same package","a subclass of the same package","a non-subclass of different package","a subclass of different package"},
            {"polymorphism","encapsulation","overriding","inheritance"},
            {"java archive runner","java archive","java application runner","none of the above"},
            {"reference","constant","identifier","modifier"},
            {"&","$","_","any alphabet"},
            {"Java Virtual Machine","Java Verified Machine","Java Very Large Machine","Java very small machine"},
            {"variable","identifiers","constant","memory"},
        //    {"java.lang","java.io","java.awt","java.net"}

            //  {"Destructor","interpreter","constructor","object"}


    };

    private String mcorrectans[]= {"James Gosling","Java Virtual Machine","Java runtime Enviornment","Bytecodes",".class","start()","public Test()","java.io","memory address","Throwable","getCust","variable","double","switch","class","Box obj=new Box();","new","void","main method","final","a non-subclass of different package","inheritance","java archive","identifier","&","Java Virtual Machine","variable"};

    public String getquestion(int a){
        String question=mquestion[a];
        return question;
    }
    public String getchoice1(int a){
        String choice0=mchoice[a][0];
        return choice0;
    }
    public String getchoice2(int a){
        String choice1=mchoice[a][1];
        return choice1;
    }
    public String getchoice3(int a){
        String choice2=mchoice[a][2];
        return choice2;
    }
    public String getchoice4(int a){
        String choice3=mchoice[a][3];
        return choice3;
    }
    public String getcorrectans(int a){
        String answer=mcorrectans[a];
        return answer;
    }
}
