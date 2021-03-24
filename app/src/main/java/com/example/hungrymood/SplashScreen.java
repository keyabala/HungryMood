package com.example.hungrymood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.time.Instant;

import static android.os.SystemClock.sleep;

public class SplashScreen extends AppCompatActivity {

    ImageView splashImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        splashImage = (ImageView) findViewById(R.id.iv_top);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.animation);
        splashImage.startAnimation(animation);

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {

                try {

                    Thread.sleep(5000);
                    Intent i = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(i);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                sleep(5000);

            }
        });

        myThread.start();
    }
}