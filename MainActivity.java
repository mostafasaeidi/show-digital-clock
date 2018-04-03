package com.example.amomosy.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Time;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer sound1 =MediaPlayer.create(this,R.raw.saat);
        final MediaPlayer sound4 =MediaPlayer.create(this,R.raw.daghighemibashad);

        final   TextView t1=(TextView)findViewById(R.id.txt3);
        final  TextView t2=(TextView)  findViewById(R.id.txt52);
        final  TextView t3=(TextView)  findViewById(R.id.txt46);
        final  TextView t4=(TextView)  findViewById(R.id.txt15);
        final  TextView t5=(TextView)  findViewById(R.id.txt2015);
        final  TextView t6=(TextView)  findViewById(R.id.txt2pm);
        Button Show_time=(Button)findViewById(R.id.btn_showTime);
        Show_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                            //---------------start show clock----------------------//
                Date clock=new Date();
                Date time =new Date();
                int h= clock.getHours();
                int m= clock.getMinutes();
                int s=clock.getSeconds();
                int day = time.getDate();
                int year=time.getYear();
                t1.setText(String.valueOf(h));
                t2.setText(String.valueOf(m));
                t3.setText(String.valueOf(s));
                t4.setText(String.valueOf(day));
                t5.setText(String.valueOf(year))
              if (h<12)
                  t6.setText("Am");

              else
                  t6.setText("Pm");

                        //----------------------------------end show clock-------------//


                //----------start for sound clock---------------------//
                    //-------switch hours-------//
              switch (h){

                  case 1: break;
                  case 2: break;
                  case 3: break;
                  case 4: break;
                  case 5: break;
                  case 6: break;
                  case 7: break;
                  case 8: break;
                  case 9: break;
                  case 10: break;
                  case 11: break;
                  case 12: break;
                  case 13: break;
                  case 14: break;
                  case 15: break;
                  case 16: break;
                  case 17: break;
                  case 18: break;
                  case 19: break;
                  case 20: break;
                  case 21: break;
                  case 22: break;
                  case 23: break;
                  case 00: break;



              }  //-------end switch hours-------//

                switch (m){

                    case 1: break;
                    case 2: break;
                    case 3: break;
                    case 4: break;
                    case 5: break;
                    case 6: break;
                    case 7: break;
                    case 8: break;
                    case 9: break;
                    case 10: break;
                    case 11: break;
                    case 12: break;
                    case 13: break;
                    case 14: break;
                    case 15: break;
                    case 16: break;
                    case 17: break;
                    case 18: break;
                    case 19: break;
                    case 20: break;
                    case 21: break;
                    case 22: break;
                    case 23: break;
                    case 24: break;
                    case 25: break;
                    case 26: break;
                    case 27: break;
                    case 28: break;
                    case 29: break;
                    case 30: break;
                    case 31: break;
                    case 32: break;
                    case 33: break;
                    case 34: break;
                    case 35: break;
                    case 36: break;
                    case 37: break;
                    case 38: break;
                    case 39: break;
                    case 40: break;
                    case 41: break;
                    case 42: break;
                    case 43: break;
                    case 44: break;
                    case 45: break;
                    case 46: break;
                    case 47: break;
                    case 48: break;
                    case 49: break;
                    case 50: break;
                    case 51: break;
                    case 52: break;
                    case 53: break;
                    case 54: break;
                    case 55: break;
                    case 56: break;
                    case 57: break;
                    case 58: break;
                    case 59: break;
                    



                }
            }
        });




    }//------------------------------end for sound clock -------------------------------//


}
