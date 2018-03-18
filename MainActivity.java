package com.example.amomosy.myapplication;

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
                t5.setText(String.valueOf(year));

              if (h<12)
                  t6.setText("Am");

              else
                  t6.setText("Pm");


            }
        });




    }


}
