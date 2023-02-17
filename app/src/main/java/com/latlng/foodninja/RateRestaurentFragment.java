package com.latlng.foodninja;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.latlng.foodninja.databinding.FragmentRateRestaurentBinding;

public class RateRestaurentFragment extends Fragment {

    FragmentRateRestaurentBinding binding;

  @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =  FragmentRateRestaurentBinding.inflate(inflater, container, false);

        binding.btSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(binding.getRoot()).navigate(R.id.voucharpromo_fragment);
            }
        });

        return binding.getRoot();
    }
}