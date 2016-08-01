package com.example.deepak.ticket_booking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    ImageButton a1, a2, a3, a4;
    Button but;
    EditText mov_inp;
    TextView tick_disp;
    MovieDBHandler mdbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mov_inp = (EditText) findViewById(R.id.mov_inp);
        tick_disp = (TextView) findViewById(R.id.tick_disp);
        mdbHandler = new MovieDBHandler(this, null, null, 1);

        configureButton();

    }

    public void configureButton() {
        a1 = (ImageButton) findViewById(R.id.a1);
        a2 = (ImageButton) findViewById(R.id.a2);
        a3 = (ImageButton) findViewById(R.id.a3);
        a4 = (ImageButton) findViewById(R.id.a4);

        a1.setTag("0");
        a2.setTag("0");
        a3.setTag("0");
        a4.setTag("0");


        a1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (a1.getTag() == "0") {
                    a1.setImageResource(R.drawable.red);
                    a1.setTag("a1");
                } else {
                    a1.setImageResource(R.drawable.green);
                    a1.setTag("0");
                }
            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (a2.getTag() == "0") {
                    a2.setImageResource(R.drawable.red);
                    a2.setTag("a2");
                } else {
                    a2.setImageResource(R.drawable.green);
                    a2.setTag("0");
                }
            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (a3.getTag() == "0") {
                    a3.setImageResource(R.drawable.red);
                    a3.setTag("a3");
                } else {
                    a3.setImageResource(R.drawable.green);
                    a3.setTag("0");
                }
            }
        });

        a4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (a4.getTag() == "0") {
                    a4.setImageResource(R.drawable.red);
                    a4.setTag("a4");
                } else {
                    a4.setImageResource(R.drawable.green);
                    a4.setTag("0");
                }
            }
        });
    }

    public void bookTickets(View v) {

        String mname = mov_inp.getText().toString();
        int nseats = 0;
        String seats = " ";
        if (a1.getTag() == "a1") {
            nseats++;
            seats += "a1";
        }
        if (a2.getTag() == "a2") {
            nseats++;
            seats += "a2";
        }
        if (a3.getTag() == "a3") {
            nseats++;
            seats += "a3";
        }
        if (a4.getTag() == "a4") {
            nseats++;
            seats += "a4";
        }

        Movie movie = new Movie(mname, nseats, seats);
        mdbHandler.addSeats(movie);

        a1.setImageResource(R.drawable.green);
        a1.setTag("0");
        a2.setImageResource(R.drawable.green);
        a2.setTag("0");
        a3.setImageResource(R.drawable.green);
        a3.setTag("0");
        a4.setImageResource(R.drawable.green);
        a4.setTag("0");
        nseats = 0;
        seats = " ";
        mov_inp.setText(" ");
        tick_disp.setText("success");

    }

        public void printDatabase(View v) {
            String dbString = mdbHandler.databasetostring(mov_inp.getText().toString());
            tick_disp.setText(dbString);
            mov_inp.setText(" ");
         }





}
