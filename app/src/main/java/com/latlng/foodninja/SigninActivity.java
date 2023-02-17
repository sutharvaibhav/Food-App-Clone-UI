package com.latlng.foodninja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.View;

import com.latlng.foodninja.databinding.ActivitySigninBinding;

public class SigninActivity extends AppCompatActivity {

    ActivitySigninBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_signin);

        binding.btCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (SigninActivity.this,SignupProcessActivity.class);
                startActivity(intent);

            }
        });

        binding.alreadyAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (SigninActivity.this,ActivitySignup.class);
                startActivity(intent);
                finish();
            }
        });

        Shader textShader=new LinearGradient(250, 250, 50, 50,
                new int[]{Color.parseColor("#15BE77"),Color.parseColor("#53E88B")},
                new float[]{0, 1}, Shader.TileMode.CLAMP);
        binding.appName.getPaint().setShader(textShader);
        binding.alreadyAcc.getPaint().setShader(textShader);
    }

}