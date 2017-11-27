package com.example.nisa.my_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class monmoy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monmoy);
        Button btt=(Button) findViewById(R.id.button4);
        btt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intt=new Intent(monmoy.this,MainActivity.class);

                startActivity(intt);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
