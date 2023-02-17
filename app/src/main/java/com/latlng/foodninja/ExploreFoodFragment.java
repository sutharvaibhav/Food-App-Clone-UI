package com.latlng.foodninja;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.latlng.foodninja.adapters.PopularMenuAdapter;
import com.latlng.foodninja.databinding.FragmentExploreFoodBinding;
import com.latlng.foodninja.models.Subject;

import java.util.ArrayList;

public class ExploreFoodFragment extends Fragment {

    FragmentExploreFoodBinding binding;
    ArrayList<Subject> subjects = new ArrayList<>();
    PopularMenuAdapter popularMenuAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentExploreFoodBinding.inflate(inflater, container, false);

        subjects.clear();
        subjects = getArguments().getParcelableArrayList("foodlist");

        popularMenuAdapter = new PopularMenuAdapter(getContext(),subjects);
        binding.moreResView.setAdapter(popularMenuAdapter);





        return binding.getRoot();
    }
}