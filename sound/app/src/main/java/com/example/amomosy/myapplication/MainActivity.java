package com.example.amomosy.myapplication;

import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuWrapperFactory;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.sql.Time;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements MediaPlayer.OnCompletionListener
{
    private  int [] soundS={
            R.raw.o1,
            R.raw.o1,
            R.raw.o1,
            R.raw.daghighemibashad,
            0,


    };
    private int loc=0;

    private int [] soundM={

            R.raw.voice001,
            R.raw.voice002,
            R.raw.voice003,
            R.raw.voice004,
            R.raw.voice005,
            R.raw.voice006,
            R.raw.voice007,
            R.raw.voice008,
            R.raw.voice009,
            R.raw.voice010,
            R.raw.voice011,
            R.raw.voice012,
            R.raw.voice013,
            R.raw.voice014,
            R.raw.voice015,
            R.raw.voice016,
            R.raw.voice017,
            R.raw.voice018,
            R.raw.voice019,
            R.raw.voice020,

};
    private int [] soundo={
            0,
            R.raw.o1,
            R.raw.o2,
            R.raw.o3,
            R.raw.o4,
            R.raw.o5,
            R.raw.o6,
            R.raw.o7,
            R.raw.o8,
            R.raw.o9,
            R.raw.o10,
            R.raw.o11,
            R.raw.o12,
            R.raw.o13,
            R.raw.o14,
            R.raw.o15,
            R.raw.o16,
            R.raw.o17,
            R.raw.o18,
            R.raw.o19,
            R.raw.o20,


    };

    private int [] soundS10o={
            0,
            R.raw.o10,
            R.raw.o20,
            R.raw.o30,
            R.raw.o40,
            R.raw.o50,
    };
    private int [] soundM10={
            0,
            R.raw.voice010,
            R.raw.voice020,
            R.raw.voice030,
            R.raw.voice040,
            R.raw.voice050,


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /***********************start shenasaei radiobutton *********************/
        final RadioGroup rg = (RadioGroup) findViewById(R.id.rg);
        final RadioButton h12 = (RadioButton) findViewById(R.id.h12);
        final RadioButton h24 = (RadioButton) findViewById(R.id.h24);
/***********************end shenasaei radiobutton *********************/

        final TextView t1 = (TextView) findViewById(R.id.txt3);
        final TextView t2 = (TextView) findViewById(R.id.txt52);
        final TextView t3 = (TextView) findViewById(R.id.txt46);
        final TextView t4 = (TextView) findViewById(R.id.txt15);
        final TextView t5 = (TextView) findViewById(R.id.txt2015);
        final TextView t6 = (TextView) findViewById(R.id.txt2pm);
        Button Show_time = (Button) findViewById(R.id.btn_showTime);


/*****************start use radio buton *****************/
      /*  rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.h12) {
                    SharedPreferences sp = getSharedPreferences("myshared", MODE_PRIVATE);
                    sp.edit().putInt("check", checkedId).apply();
                    sp.edit().putInt("check", checkedId).commit();

                    t1.setText(String.valueOf(n));
                    if (h < 12)
                        t6.setText("Am");
                    else
                        t6.setText("Pm");
                } else {
                    t6.setText("");
                    t1.setText(String.valueOf(h));

                }
            }
        });*/

/*****************************end use radio buton **************************/

        Show_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

/******************start tarif date******************/
                Date clock = new Date();
                Date time = new Date();
                int h = clock.getHours();
                int m = clock.getMinutes();
                int s = clock.getSeconds();
                int day = time.getDate();
                int year = time.getYear();
                t1.setText(String.valueOf(h));
                t2.setText(String.valueOf(m));
                t3.setText(String.valueOf(s));
                t4.setText(String.valueOf(day));
                t5.setText(String.valueOf(year));

/******************end tarif date******************/

    if(h==0)
        h=12;

    int i=0;
    if(m==0)
    soundS[i++]=soundM[h];
    else
        soundS[i++]= soundo[h];


    if(m<20)
        soundS[i++]=soundM[m];
    else
    {

    int m10=m/10;
    int m1=m%10;

    if(m1==0)
    soundS[i++]=soundM10[m10];

    else
        soundS[i++]= soundS10o[m10];

    if(m1!=0)
        soundS[i++]=soundM[m1];
    }
    if(m!=0)
        soundS[i++]= R.raw.daghighemibashad;

                soundS[i++]=0;

    MediaPlayer mp= MediaPlayer.create(MainActivity.this,R.raw.saat);
    mp.start();
    mp.setOnCompletionListener(MainActivity.this);
            }
        });
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        if(soundS[loc]!=0) {
            MediaPlayer m = MediaPlayer.create(this, soundS[loc]);
            loc++;
            m.setOnCompletionListener(this);
            m.start();
        }
    }
}


