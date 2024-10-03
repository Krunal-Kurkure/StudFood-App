package com.example.studfood;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN = 2200;
    Animation midanim;
    ImageView Circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CODE FOR HIDING ACTION BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //SPLASH SCREEN ANIMATION
        midanim = AnimationUtils.loadAnimation(this,R.anim.mid_anim);
        Circle = findViewById(R.id.imageView3);
        Circle.setAnimation(midanim);
        //TO OPEN NEW ACTIVITY
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,MainActivityrr.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}