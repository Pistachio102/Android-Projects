package com.example.nisa.my_application;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userName;
    EditText userPass;
    private boolean twice=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName=(EditText) findViewById(R.id.editText);
        userPass=(EditText) findViewById(R.id.editText3);
        Button login=(Button) findViewById(R.id.button2);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkLogin();

            }
        });}

    @Override
    public void onBackPressed() {
        if (!twice) {
            Toast.makeText(MainActivity.this, "Press again to exit", Toast.LENGTH_SHORT).show();
        twice=true;
        }
        else {super.onBackPressed();}
        new CountDownTimer(3000,1000){
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                twice=false;
            }
        }.start();

    }

    private void checkLogin() {
        if (userName.getText().toString().equals("ADIBA")&& userPass.getText().toString().equals("1605097"))
        {
            Intent myIntent= new Intent(MainActivity.this,Main2Activity.class);
            startActivity(myIntent);
        }
        else if(userName.getText().toString().equals("PRIYETA")&&userPass.getText().toString().equals("1605094"))
        {
            Intent myIntent1=new Intent(MainActivity.this,prita.class);
            startActivity(myIntent1);
        }
        else if ( userName.getText().toString().equals("DOHA")&&userPass.getText().toString().equals("1605108"))
        {
            Intent myIntent2=new Intent(MainActivity.this,doha.class);
            startActivity(myIntent2);
        }
        else if(userName.getText().toString().equals("MONMOY")&&userPass.getText().toString().equals("1605063"))
        {
            Intent myIntent3=new Intent(MainActivity.this,monmoy.class);
            startActivity(myIntent3);
        }
        else {
            Toast.makeText(this,"Login Failed",Toast.LENGTH_SHORT).show();
        }


    }




}
