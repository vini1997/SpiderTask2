package com.example.vinit.spidertask2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name , rollno;
    CheckBox app;
    CheckBox game;
    CheckBox algos;
    CheckBox tronix;
    Switch switch1;
    Spinner spinner1;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        onClickButtonListener();

    }

    public void onClickButtonListener(){
        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                name = (EditText) findViewById(R.id.name);
                rollno = (EditText) findViewById(R.id.rollno);
                app = (CheckBox) findViewById(R.id.app);
                game = (CheckBox) findViewById(R.id.game);
                tronix = (CheckBox) findViewById(R.id.tronix);
                algos = (CheckBox) findViewById(R.id.algos);
                switch1 = (Switch) findViewById(R.id.switch1);
                String n =  name.getText().toString();
                String r = rollno.getText().toString();
                int i =0;
                if(app.isChecked()==true)
                    i++;
                if(game.isChecked()==true)
                    i++;
                if(tronix.isChecked()==true)
                    i++;
                if(algos.isChecked()==true)
                    i++;

                if((n.equals("")==true) || (r.equals("")==true)){

                    Context context = getApplicationContext();
                    CharSequence text = "Please fill name and Rollno";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();}
                else{
                   if(i>=1)

                    {Intent intent = new Intent("com.example.vinit.spidertask2.SecondActivity");
                         Bundle bundle = new Bundle();
                         bundle.putString("name",n);
                         bundle.putString("rollno",r);
                        intent.putExtras(bundle);
                        startActivity(intent);}
                    else  { Toast toast = Toast.makeText(getApplicationContext(),"Please Choose Profile", Toast.LENGTH_SHORT);
                        toast.show();}
                       }




            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
