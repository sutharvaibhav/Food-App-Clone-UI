package com.latlng.foodninja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.latlng.foodninja.databinding.ActivitySplashScreenBinding;

public class SplashScreenActivity extends AppCompatActivity {

    ActivitySplashScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_splash_screen);

        Shader textShader=new LinearGradient(250, 250, 50, 50,
                new int[]{Color.parseColor("#15BE77"),Color.parseColor("#53E88B")},
                new float[]{0, 1}, Shader.TileMode.CLAMP);
        binding.appName.getPaint().setShader(textShader);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreenActivity.this, OnboardingActivity.class);
                startActivity(i);
                finish();
            }
        }, 500);
    }
}