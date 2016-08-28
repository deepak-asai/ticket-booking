package com.example.deepak.ticket_booking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class movie_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);
    }
    public  void openKabali(View v){
        Intent open=new Intent("com.example.deepak.ticket_booking.MainActivity");
        //startActivity(open);
        String mname=v.getResources().getResourceName(v.getId());
        Toast.makeText(movie_list.this, mname, Toast.LENGTH_LONG).show();
        TextView t=(TextView)findViewById(R.id.txt);
        t.setText(mname);
        String m=getString(R.string.v);
        Toast.makeText(movie_list.this, m, Toast.LENGTH_LONG).show();
    }
}
