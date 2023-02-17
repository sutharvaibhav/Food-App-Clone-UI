package com.latlng.foodninja;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.latlng.foodninja.adapters.CategoriesAdapter;
import com.latlng.foodninja.databinding.FragmentExploreRestaurentBinding;
import com.latlng.foodninja.models.Block;

import java.util.ArrayList;


public class ExploreRestaurentFragment extends Fragment {

    FragmentExploreRestaurentBinding binding;
    CategoriesAdapter categoriesAdapter;
    ArrayList<Block> blocks = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentExploreRestaurentBinding.inflate(inflater, container, false);

        blocks.clear();
        blocks = getArguments().getParcelableArrayList("mylist");

        categoriesAdapter = new CategoriesAdapter(getContext(),blocks);
        binding.moreView.setAdapter(categoriesAdapter);



        return binding.getRoot();
    }
}