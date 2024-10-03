package com.example.studfood;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivityrr extends AppCompatActivity {
    public ImageView play,play1,play2,play3,play4,play99;
    public TextView play9,play11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityrr);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        play=findViewById(R.id.imageView14);
        play=findViewById(R.id.imageView19);
        play1=findViewById(R.id.imageView15);
        play1=findViewById(R.id.imageView20);
        play2=findViewById(R.id.imageView17);
        play2=findViewById(R.id.imageView23);
        play3=findViewById(R.id.imageView16);
        play3=findViewById(R.id.imageView21);
        play4=findViewById(R.id.imageView42);
        play4=findViewById(R.id.imageView49);
        play4=findViewById(R.id.imageView44);
        play4=findViewById(R.id.imageView44);
        play9=findViewById(R.id.textView27);
        play99=findViewById(R.id.imageView46);
        play99=findViewById(R.id.imageView47);
        play99=findViewById(R.id.imageView48);
        play11=findViewById(R.id.textView33);

        //TO OPEN PASTA ACTIVITY
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivityrr.this,pasta.class);

                startActivity(intent);
            }
        });

        //TO OPEN SANDWICH ACTIVITY
        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivityrr.this,sandwich.class);

                startActivity(intent);
            }
        });

        //TO OPEN BURGER ACTVITY
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivityrr.this,burger.class);

                startActivity(intent);
            }
        });

        //TO OPEN NOODLES ACTIVITY
        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivityrr.this,noodles.class);

                startActivity(intent);
            }
        });

        //TO OPEN ABOUTUS ACTIVITY
        play9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivityrr.this,aboutus.class);

                startActivity(intent);
            }
        });

        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivityrr.this,aboutus.class);

                startActivity(intent);
            }
        });

        //TO OPEN CONTACT US ACTIVITY
        play99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivityrr.this,contact.class);

                startActivity(intent);
            }
        });

        play11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivityrr.this,contact.class);

                startActivity(intent);
            }
        });

    }
}