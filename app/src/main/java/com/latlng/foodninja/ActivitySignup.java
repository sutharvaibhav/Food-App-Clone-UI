package com.latlng.foodninja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.View;

import com.latlng.foodninja.databinding.ActivitySignupBinding;

public class ActivitySignup extends AppCompatActivity {

    ActivitySignupBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_signup);

        Shader textShader=new LinearGradient(250, 250, 50, 50,
                new int[]{Color.parseColor("#15BE77"),Color.parseColor("#53E88B")},
                new float[]{0, 1}, Shader.TileMode.CLAMP);
        binding.appName.getPaint().setShader(textShader);
        binding.forgetPass.getPaint().setShader(textShader);

        binding.btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = binding.etMail.getText().toString();
                String pass = binding.etPass.getText().toString();

                if(email.length()==0){
                    binding.etMail.requestFocus();
                    binding.etMail.setError("Fields can't be empty!");
                }
                else if(!email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")){
                    binding.etMail.requestFocus();
                    binding.etMail.setError("Enter Valid Mail!");
                }
                else if(pass.length()==0){
                    binding.etPass.requestFocus();
                    binding.etPass.setError("Fields can't be empty!");
                }
            }
        });

        binding.forgetPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivitySignup.this,SigninActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}