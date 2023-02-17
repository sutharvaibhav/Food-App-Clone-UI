package com.latlng.foodninja;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.latlng.foodninja.databinding.FragmentCallRingBinding;

public class CallRingFragment extends Fragment {

    FragmentCallRingBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCallRingBinding.inflate(inflater, container, false);

        binding.speakericon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(binding.getRoot()).navigate(R.id.call_end_fragment);
            }
        });

        return binding.getRoot();
    }
}