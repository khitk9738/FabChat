package com.akki.fab.chat;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);

        Handler handler= new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                startActivity(new Intent(SplashActivity.this,StartActivity.class));
                finish();

            }

        },3000);

    }
}
