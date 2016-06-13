package com.example.vinit.spidertask2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.Date;


public class SecondActivity extends AppCompatActivity {

    TextView textview4;
    TextView textview5;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        choiceMessage();
        onClickButtonListener();



    }

    public void onClickButtonListener(){
        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();


            }

        });

    }

    public void choiceMessage(){
        textview4 = (TextView) findViewById(R.id.textView4);
        textview5 = (TextView) findViewById(R.id.textView5);

        Bundle bundle = getIntent().getExtras();
        String na = bundle.getString("name");
        int roll = bundle.getInt("rollno");

        textview4.setText("Thank You "+na+" for your response");
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String format = s.format(new Date());
        textview5.setText(format);
    }



}





