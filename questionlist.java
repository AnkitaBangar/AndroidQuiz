package com.example.administrator.quizapp;

/**
 * Created by Administrator on 6/25/2017.
 */

public class questionlist {

    public static String[] mquestion2=new String[]
            {
                    "Once installed on a device,each Android application lives in____?",
                    "What are the indirect subclasses of activity?",
                    "Parent class of service?",
                    "When the contentProvider would be activated?",
                    "You can shut down an activity by calling its____method",
                    "Which component is not activated by an Intent",
                    "Dialog classes in android?",
                    "when the activity is not in the focus,but still visible on the screen it is in?",
                    "If you want to share data across the all applications,you should go for?",
                    "The XML file that contains all the text that your application uses.",
                    "What is the name of the program that converts Java byte code into Dalvik byte code?",
                    "Creating a UI in android requires careful use of__",
                    "What is contained within the mainfest XML file?",
                    "What built-in database is Android shipped with?",
                    "Which of the following is NOT a state in the lifecycle of a service?",
                    "Parent class of activity?",
                    "Which piece of code used in Android is not open source?",
                    "Which among these are NOT a part of android's native libraries?",
                    "Which of these are not one of the three main components of the APK?",
                    "While developing Android applications,developers can test their apps on.."
                   // "Parent class of service?"

            };

    private String mchoice2 [][]= {
            {"external memory", "device memory", "security sandbox", "none of the above"},
            {"preferenceActivity", "launchActivity","tabActivity", "all of the above"},
            {"context", "object", "ContentWrapper", "ContentThemeWrapper"},
            {"using SQLite", "using Intent", "using ContentResolver", "none of the above"},
            {"finishActivity()","onDestroy()","finish()","none of the above"},
            {"services","activity","contentProvider","brodcastReceiver"},
            {"ProgressDialog","AlertDialog","DatePickerDialog","All of the above"},
            {"stoppped state","running state","paused state","destroyed state"},
            {"content provider","shared preferences","internal storage","SQLite databases"},
            {"text.xml","stack.xml","strings.xml","string.java"},
            {"Dalvik converter","Android Interpretive Compiler","Dex compiler","Mobile Interpretive Compiler"},
            {"XML and JAVA","JAVA and SQL","XML and C++","Dream weaver"},
            {"the list of strings used in the app","the permission the app require","the source code","all other choices"},
            {"Apache","SQLite","MySQL","Oracle"},
            {"running","starting","destroyed","paused"},
            {"context","object","activityGroup","contextThemeWreapper"},
            {"WIfi? driver","keypad driver","audio driver","power management"},
            {"Dalvik","Webkit","OpenGL","SQLite"},
            {"resources","Dalvik executable","Native Libraries","Webkit"},
            {"Physical android phone","emulator included in android SDK","Third-party emulatores","all of the above"},
           // {"context", "object", "ContentWrapper", "ContentThemeWrapper"}


    };

    private String mcorrectans2[]= {"security sandbox","all of the above","ContentWrapper","using ContentResolver","finish()","contentProvider","All of the above","paused state","content provider","strings.xml","Dex compiler","XML and JAVA","the permission the app require","SQLite","paused","contextThemeWreapper","WIfi? driver","Dalvik","Webkit","all of the above"};


    public String getquestion2(int a){
        String question2=mquestion2[a];
        return question2;
    }
    public String getchoice11(int a){
        String choice01=mchoice2[a][0];
        return choice01;
    }
    public String getchoice12(int a){
        String choice11=mchoice2[a][1];
        return choice11;
    }
    public String getchoice13(int a){
        String choice12=mchoice2[a][2];
        return choice12;
    }
    public String getchoice14(int a){
        String choice13=mchoice2[a][3];
        return choice13;
    }
    public String getcorrectans2(int a){
        String answer2=mcorrectans2[a];
        return answer2;
    }
}
