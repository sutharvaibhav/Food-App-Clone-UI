package com.latlng.foodninja;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import com.latlng.foodninja.databinding.ActivityMainBinding;
import com.latlng.foodninja.databinding.FragmentHomeBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding binding;
    FragmentHomeBinding fragmentHomeBinding;
    private int selectedTab = 1;
    View view;
    NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        navController = NavHostFragment.findNavController(getSupportFragmentManager().findFragmentById(R.id.frameFeed));


        binding.homeLayout.setOnClickListener(this);
        binding.proLayout.setOnClickListener(this);
        binding.cartLayout.setOnClickListener(this);
        binding.chatLayout.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case  R.id.homeLayout:

                binding.navProTv.setVisibility(View.GONE);
                binding.navCartTv.setVisibility(View.GONE);
                binding.navChatTv.setVisibility(View.GONE);

                binding.proLayout.setBackgroundColor(getResources().getColor(android.R.color.white));
                binding.cartLayout.setBackgroundColor(getResources().getColor(android.R.color.white));
                binding.chatLayout.setBackgroundColor(getResources().getColor(android.R.color.white));

                binding.navHomeTv.setVisibility(View.VISIBLE);
                binding.homeLayout.setBackgroundResource(R.drawable.home_selected_bg);
                navController.navigate(R.id.home_fragment);
                break;

            case  R.id.proLayout:

                binding.navHomeTv.setVisibility(View.GONE);
                binding.navCartTv.setVisibility(View.GONE);
                binding.navChatTv.setVisibility(View.GONE);

                binding.homeLayout.setBackgroundColor(getResources().getColor(android.R.color.white));
                binding.cartLayout.setBackgroundColor(getResources().getColor(android.R.color.white));
                binding.chatLayout.setBackgroundColor(getResources().getColor(android.R.color.white));

                binding.navProTv.setVisibility(View.VISIBLE);
                binding.proLayout.setBackgroundResource(R.drawable.home_selected_bg);


                break;

            case  R.id.cartLayout:

                binding.navHomeTv.setVisibility(View.GONE);
                binding.navProTv.setVisibility(View.GONE);
                binding.navChatTv.setVisibility(View.GONE);

                binding.homeLayout.setBackgroundColor(getResources().getColor(android.R.color.white));
                binding.proLayout.setBackgroundColor(getResources().getColor(android.R.color.white));
                binding.chatLayout.setBackgroundColor(getResources().getColor(android.R.color.white));

                binding.navCartTv.setVisibility(View.VISIBLE);
                binding.cartLayout.setBackgroundResource(R.drawable.home_selected_bg);
                navController.navigate(R.id.order_details_fragment);
                break;

            case  R.id.chatLayout:

                binding.navHomeTv.setVisibility(View.GONE);
                binding.navProTv.setVisibility(View.GONE);
                binding.navCartTv.setVisibility(View.GONE);

                binding.homeLayout.setBackgroundColor(getResources().getColor(android.R.color.white));
                binding.proLayout.setBackgroundColor(getResources().getColor(android.R.color.white));
                binding.cartLayout.setBackgroundColor(getResources().getColor(android.R.color.white));

                binding.navChatTv.setVisibility(View.VISIBLE);
                binding.chatLayout.setBackgroundResource(R.drawable.home_selected_bg);
                navController.navigate(R.id.message_fragment);
                break;
        }

    }
}