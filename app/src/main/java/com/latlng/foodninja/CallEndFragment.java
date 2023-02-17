package com.latlng.foodninja;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.latlng.foodninja.databinding.FragmentCallEndBinding;

public class CallEndFragment extends Fragment {

    FragmentCallEndBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCallEndBinding.inflate(inflater, container, false);

        binding.closeImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(binding.getRoot()).navigate(R.id.finish_order_fragment);
            }
        });

        return binding.getRoot();
    }
}