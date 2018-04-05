package com.example.amomosy.myapplication;

import android.media.MediaPlayer;
import android.os.Handler;
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
        final  Handler handler = new Handler();

        final MediaPlayer sounds = MediaPlayer.create(this, R.raw.saat);
        final MediaPlayer soundd = MediaPlayer.create(this, R.raw.daghighemibashad);
        final MediaPlayer hours1 = MediaPlayer.create(this, R.raw.o1);
        final MediaPlayer hours2 = MediaPlayer.create(this, R.raw.o2);
        final MediaPlayer hours3 = MediaPlayer.create(this, R.raw.o3);
        final MediaPlayer hours4 = MediaPlayer.create(this, R.raw.o4);
        final MediaPlayer hours5 = MediaPlayer.create(this, R.raw.o5);
        final MediaPlayer hours6 = MediaPlayer.create(this, R.raw.o6);
        final MediaPlayer hours7 = MediaPlayer.create(this, R.raw.o7);
        final MediaPlayer hours8 = MediaPlayer.create(this, R.raw.o8);
        final MediaPlayer hours9 = MediaPlayer.create(this, R.raw.o9);
        final MediaPlayer hours10 = MediaPlayer.create(this, R.raw.o10);
        final MediaPlayer hours11= MediaPlayer.create(this, R.raw.o11);
        final MediaPlayer hours12 = MediaPlayer.create(this, R.raw.o12);
        final MediaPlayer hours13 = MediaPlayer.create(this, R.raw.o13);
        final MediaPlayer hours14 = MediaPlayer.create(this, R.raw.o14);
        final MediaPlayer hours15 = MediaPlayer.create(this, R.raw.o15);
        final MediaPlayer hours16 = MediaPlayer.create(this, R.raw.o16);
        final MediaPlayer hours17 = MediaPlayer.create(this, R.raw.o17);
        final MediaPlayer hours18 = MediaPlayer.create(this, R.raw.o18);
        final MediaPlayer hours19 = MediaPlayer.create(this, R.raw.o19);
        final MediaPlayer hours20 = MediaPlayer.create(this, R.raw.o20);
        final MediaPlayer hours21 = MediaPlayer.create(this, R.raw.o21);
        final MediaPlayer hours22 = MediaPlayer.create(this, R.raw.o22);
        final MediaPlayer hours23 = MediaPlayer.create(this, R.raw.o23);
        final MediaPlayer hours24 = MediaPlayer.create(this, R.raw.o24);

        final MediaPlayer min1 = MediaPlayer.create(this, R.raw.voice001);
        final MediaPlayer min2 = MediaPlayer.create(this, R.raw.voice002);
        final MediaPlayer min3 = MediaPlayer.create(this, R.raw.voice003);
        final MediaPlayer min4 = MediaPlayer.create(this, R.raw.voice003);
        final MediaPlayer min5 = MediaPlayer.create(this, R.raw.voice004);
        final MediaPlayer min6 = MediaPlayer.create(this, R.raw.voice005);
        final MediaPlayer min7 = MediaPlayer.create(this, R.raw.voice006);
        final MediaPlayer min8 = MediaPlayer.create(this, R.raw.voice007);
        final MediaPlayer min9 = MediaPlayer.create(this, R.raw.voice008);
        final MediaPlayer min10 = MediaPlayer.create(this, R.raw.voice009);
        final MediaPlayer min11= MediaPlayer.create(this, R.raw.voice010);
        final MediaPlayer min12 = MediaPlayer.create(this, R.raw.voice011);
        final MediaPlayer min13 = MediaPlayer.create(this, R.raw.voice012);
        final MediaPlayer min14 = MediaPlayer.create(this, R.raw.voice013);
        final MediaPlayer min15 = MediaPlayer.create(this, R.raw.voice014);
        final MediaPlayer min16 = MediaPlayer.create(this, R.raw.voice015);
        final MediaPlayer min17 = MediaPlayer.create(this, R.raw.voice016);
        final MediaPlayer min18 = MediaPlayer.create(this, R.raw.voice017);
        final MediaPlayer min19 = MediaPlayer.create(this, R.raw.voice018);
        final MediaPlayer min20 = MediaPlayer.create(this, R.raw.voice019);
        final MediaPlayer min21 = MediaPlayer.create(this, R.raw.voice020);
        final MediaPlayer min22 = MediaPlayer.create(this, R.raw.voice021);
        final MediaPlayer min23 = MediaPlayer.create(this, R.raw.voice022);
        final MediaPlayer min24 = MediaPlayer.create(this, R.raw.voice023);
        final MediaPlayer min25 = MediaPlayer.create(this, R.raw.voice024);
        final MediaPlayer min26 = MediaPlayer.create(this, R.raw.voice025);
        final MediaPlayer min27 = MediaPlayer.create(this, R.raw.voice026);
        final MediaPlayer min28 = MediaPlayer.create(this, R.raw.voice027);
        final MediaPlayer min29 = MediaPlayer.create(this, R.raw.voice028);
        final MediaPlayer min30 = MediaPlayer.create(this, R.raw.voice029);
        final MediaPlayer min31 = MediaPlayer.create(this, R.raw.voice030);
        final MediaPlayer min32 = MediaPlayer.create(this, R.raw.voice031);
        final MediaPlayer min33 = MediaPlayer.create(this, R.raw.voice032);
        final MediaPlayer min34 = MediaPlayer.create(this, R.raw.voice033);
        final MediaPlayer min35 = MediaPlayer.create(this, R.raw.voice034);
        final MediaPlayer min36 = MediaPlayer.create(this, R.raw.voice035);
        final MediaPlayer min37 = MediaPlayer.create(this, R.raw.voice036);
        final MediaPlayer min38 = MediaPlayer.create(this, R.raw.voice037);
        final MediaPlayer min39 = MediaPlayer.create(this, R.raw.voice038);
        final MediaPlayer min40 = MediaPlayer.create(this, R.raw.voice039);
        final MediaPlayer min41 = MediaPlayer.create(this, R.raw.voice040);
        final MediaPlayer min42 = MediaPlayer.create(this, R.raw.voice041);
        final MediaPlayer min43 = MediaPlayer.create(this, R.raw.voice042);
        final MediaPlayer min44 = MediaPlayer.create(this, R.raw.voice043);
        final MediaPlayer min45 = MediaPlayer.create(this, R.raw.voice044);
        final MediaPlayer min46 = MediaPlayer.create(this, R.raw.voice045);
        final MediaPlayer min47 = MediaPlayer.create(this, R.raw.voice046);
        final MediaPlayer min48 = MediaPlayer.create(this, R.raw.voice047);
        final MediaPlayer min49 = MediaPlayer.create(this, R.raw.voice048);
        final MediaPlayer min50 = MediaPlayer.create(this, R.raw.voice049);
        final MediaPlayer min51 = MediaPlayer.create(this, R.raw.voice050);
        final MediaPlayer min52 = MediaPlayer.create(this, R.raw.voice051);
        final MediaPlayer min53 = MediaPlayer.create(this, R.raw.voice052);
        final MediaPlayer min54 = MediaPlayer.create(this, R.raw.voice053);
        final MediaPlayer min55 = MediaPlayer.create(this, R.raw.voice054);
        final MediaPlayer min56 = MediaPlayer.create(this, R.raw.voice055);
        final MediaPlayer min57 = MediaPlayer.create(this, R.raw.voice056);
        final MediaPlayer min58 = MediaPlayer.create(this, R.raw.voice057);
        final MediaPlayer min59 = MediaPlayer.create(this, R.raw.voice058);






        final TextView t1 = (TextView) findViewById(R.id.txt3);
        final TextView t2 = (TextView) findViewById(R.id.txt52);
        final TextView t3 = (TextView) findViewById(R.id.txt46);
        final TextView t4 = (TextView) findViewById(R.id.txt15);
        final TextView t5 = (TextView) findViewById(R.id.txt2015);
        final TextView t6 = (TextView) findViewById(R.id.txt2pm);
        Button Show_time = (Button) findViewById(R.id.btn_showTime);
        Show_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


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
                if (h < 12)
                    t6.setText("Am");

                else
                    t6.setText("Pm");


                switch (h) {

                    case 1:
                        sounds.start();
                        sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                hours1.start();
                            }
                        });
                        break;
                    case 2:
                        sounds.start();
                        sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                hours2.start();
                            }
                        });
                        break;
                 case 3:
                     sounds.start();
                     sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                         @Override
                         public void onCompletion(MediaPlayer mp) {
                             hours3.start();
                         }
                     });
                     break;
                 case 4:
                     sounds.start();
                     sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                         @Override
                         public void onCompletion(MediaPlayer mp) {
                             hours4.start();
                         }
                     });
                     break;
                  case 5:
                      sounds.start();
                      sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              hours5.start();
                          }
                      });
                      break;
                  case 6:
                      sounds.start();
                      sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              hours6.start();
                          }
                      });
                      break;
                  case 7:
                      sounds.start();
                      sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              hours7.start();
                          }
                      });
                      break;
                  case 8:
                      sounds.start();
                      sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              hours8.start();
                          }
                      });
                      break;
                  case 9:
                      sounds.start();
                      sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              hours9.start();
                          }
                      });
                      break;
                  case 10:
                      sounds.start();
                      sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              hours10.start();
                          }
                      });
                      break;
                  case 11:
                      sounds.start();
                      sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              hours11.start();
                          }
                      });
                      break;
                  case 12:
                      sounds.start();
                      sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              hours12.start();
                          }
                      });
                      break;
                  case 13:
                      sounds.start();
                      sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              hours13.start();
                          }
                      });
                      break;
                  case 14:
                      sounds.start();
                      sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              hours14.start();
                          }
                      });
                      break;
                  case 15:
                      sounds.start();
                      sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              hours15.start();
                          }
                      });
                   break;
                  case 16:
                      sounds.start();
                      sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              hours16.start();
                          }
                      });
                      break;
                  case 17:
                      sounds.start();
                      sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              hours17.start();
                          }
                      });
                      break;
                  case 18:
                      sounds.start();
                      sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              hours18.start();
                          }
                      });
                      break;
                  case 19:
                      sounds.start();
                      sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              hours19.start();
                          }
                      });
                      break;
                  case 20:
                      sounds.start();
                      sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              hours20.start();
                          }
                      });
                      break;
                  case 21:
                      sounds.start();
                      sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              hours21.start();
                          }
                      });
                      break;
                  case 22:
                      sounds.start();
                      sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              hours23.start();
                          }
                      });
                      break;
                  case 23:
                      sounds.start();
                      sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              hours23.start();
                          }
                      });
                      break;
                  case 0:
                      sounds.start();
                      sounds.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              hours24.start();
                          }
                      });
                      break;


                }


               switch (m){

                    case 1:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min1.start();
                                min1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 2:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min2.start();
                                min2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 3:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min3.start();
                                min3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 4:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min4.start();
                                min4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 5:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min5.start();
                                min5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 6:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min6.start();
                                min6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 7:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min7.start();
                                min7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 8:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min8.start();
                                min8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 9:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min9.start();
                                min9.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 10:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min10.start();
                                min10.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 11:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min11.start();
                                min11.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 12:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min12.start();
                                min12.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 13:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min13.start();
                                min13.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 14:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min14.start();
                                min14.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 15:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min15.start();
                                min15.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 16:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min16.start();
                                min16.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 17:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min17.start();
                                min17.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 18:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min18.start();
                                min18.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 19:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min19.start();
                                min19.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 20:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min20.start();
                                min20.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);

                        break;
                    case 21:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min21.start();
                                min21.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 22:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min22.start();
                                min22.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 23:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min23.start();
                                min23.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 24:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min24.start();
                                min24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 25:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min25.start();
                                min25.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 26:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min26.start();
                                min26.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 27:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min27.start();
                                min27.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 28:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min28.start();
                                min28.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 29:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min29.start();
                                min29.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 30:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min30.start();
                                min30.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 31:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min31.start();
                                min31.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 32:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min32.start();
                                min32.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 33:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min33.start();
                                min33.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 34:
                        min34.start();
                        min34.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                soundd.start();
                            }
                        });
                        break;
                    case 35:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min35.start();
                                min35.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);

                        break;
                    case 36:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min36.start();
                                min36.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                   case 37:
                       handler.postDelayed(new Runnable() {
                           public void run() {
                               min37.start();
                               min37.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                   @Override
                                   public void onCompletion(MediaPlayer mp) {
                                       soundd.start();
                                   }
                               });

                           }
                       }, 5000);

                       break;
                    case 38:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min38.start();
                                min38.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 39:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min39.start();
                                min39.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 40:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min40.start();
                                min40.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 41:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min41.start();
                                min41.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 42:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min42.start();
                                min42.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 43:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min43.start();
                                min43.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 44:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min44.start();
                                min44.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 45:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min45.start();
                                min45.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 46:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min46.start();
                                min46.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 47:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min47.start();
                                min47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 48:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min48.start();
                                min48.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 49:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min49.start();
                                min49.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 50:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min50.start();
                                min50.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 51:
                        min51.start();
                        min51.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                soundd.start();
                            }
                        });
                        break;
                    case 52:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min52.start();
                                min52.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 53:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min53.start();
                                min53.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 54:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min54.start();
                                min54.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 55:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min55.start();
                                min55.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 56:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min56.start();
                                min56.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 57:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min57.start();
                                min57.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 58:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min58.start();
                                min58.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;
                    case 59:
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                min59.start();
                                min59.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        soundd.start();
                                    }
                                });

                            }
                        }, 5000);
                        break;




                }
            }
        });


    }
}

