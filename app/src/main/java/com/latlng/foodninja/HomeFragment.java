package com.latlng.foodninja;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.latlng.foodninja.adapters.CategoriesAdapter;
import com.latlng.foodninja.adapters.PopularMenuAdapter;
import com.latlng.foodninja.databinding.FragmentExploreRestaurentBinding;
import com.latlng.foodninja.databinding.FragmentHomeBinding;
import com.latlng.foodninja.models.Block;
import com.latlng.foodninja.models.Subject;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;
    CategoriesAdapter categoriesAdapter;
    PopularMenuAdapter popularMenuAdapter;

    ArrayList <Block> block = new ArrayList<>();
    ArrayList <Subject> subjectsL = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);


        block.clear();
        block.add(new Block(R.drawable.restimage1, "Vegan Resto", "12 Mins"));
        block.add(new Block(R.drawable.restimage2, "Healthy Food", "8 Mins"));
        block.add(new Block(R.drawable.restimage3, "Good Food", "12 Mins"));
        block.add(new Block(R.drawable.restimage4, "Smart Resto", "8 Mins"));
        block.add(new Block(R.drawable.restimage5, "Vegan Resto", "12 Mins"));
        block.add(new Block(R.drawable.restimage6, "Healthy Food", "8 Mins"));

        categoriesAdapter = new CategoriesAdapter(getContext(), block);
        binding.horiView.setAdapter(categoriesAdapter);

        subjectsL.clear();
        subjectsL.add(new Subject(R.drawable.subjectimg1, "Herbal Pancake", "Warung Herbal", "$7"));
        subjectsL.add(new Subject(R.drawable.subjectimg2, "Fruit Salad", "Wijie Resto", "$5"));
        subjectsL.add(new Subject(R.drawable.subjectimg3, "Green Noddle", "Noodle Home", "$15"));

        popularMenuAdapter = new PopularMenuAdapter(getContext(), subjectsL);
        binding.vertView.setAdapter(popularMenuAdapter);


        binding.viewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("mylist", block);
                Navigation.findNavController(binding.getRoot()).navigate(R.id.explore_fragment, bundle);

            }
        });

        binding.viewMoreRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle food = new Bundle();
                food.putParcelableArrayList("foodlist",subjectsL);
                Navigation.findNavController(binding.getRoot()).navigate(R.id.explorefood_fragment, food);
            }
        });

        binding.btFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(binding.getRoot()).navigate(R.id.filter_fragment);
            }
        });


        return binding.getRoot();

    }
}