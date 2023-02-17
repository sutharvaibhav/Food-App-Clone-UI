package com.latlng.foodninja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.latlng.foodninja.databinding.ActivitySignupSuccessBinding;

public class SignupSuccessActivity extends AppCompatActivity {

    ActivitySignupSuccessBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_signup_success);

        binding.btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupSuccessActivity.this,VerificationActivity.class);
                startActivity(intent);
            }
        });
    }
}