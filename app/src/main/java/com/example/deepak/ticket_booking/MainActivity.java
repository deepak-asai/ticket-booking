package com.example.deepak.ticket_booking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    ImageButton a1,a2,a3,a4 ;
    Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configureButton();


    }

    public void  configureButton(){
        a1=(ImageButton) findViewById(R.id.a1);
        a2=(ImageButton) findViewById(R.id.a2);
        a3=(ImageButton) findViewById(R.id.a3);
        a4=(ImageButton) findViewById(R.id.a4);

        a1.setTag("0");
        a2.setTag("0");
        a3.setTag("0");
        a4.setTag("0");


        a1.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){

                if(a1.getTag()=="0"){
                    a1.setImageResource(R.drawable.red);
                    a1.setTag("1");
                }
                else{
                    a1.setImageResource(R.drawable.green);
                    a1.setTag("0");
                }
            }
        });

        a2.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){

                if(a2.getTag()=="0"){
                    a2.setImageResource(R.drawable.red);
                    a2.setTag("1");
                }
                else{
                    a2.setImageResource(R.drawable.green);
                    a2.setTag("0");
                }
            }
        });

        a3.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){

                if(a3.getTag()=="0"){
                    a3.setImageResource(R.drawable.red);
                    a3.setTag("1");
                }
                else{
                    a3.setImageResource(R.drawable.green);
                    a3.setTag("0");
                }
            }
        });

        a4.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){

                if(a4.getTag()=="0"){
                    a4.setImageResource(R.drawable.red);
                    a4.setTag("1");
                }
                else{
                    a4.setImageResource(R.drawable.green);
                    a4.setTag("0");
                }
            }
        });


    }
}
