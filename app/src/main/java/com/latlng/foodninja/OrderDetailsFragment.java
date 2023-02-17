package com.latlng.foodninja;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.latlng.foodninja.adapters.OrderAdapter;
import com.latlng.foodninja.databinding.FragmentOrderDetailsBinding;
import com.latlng.foodninja.models.OrderModel;

import java.util.ArrayList;

public class OrderDetailsFragment extends Fragment {

    ArrayList<OrderModel> orderModels = new ArrayList<>();
    OrderAdapter orderAdapter;
    FragmentOrderDetailsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentOrderDetailsBinding.inflate(inflater, container, false);

        orderModels.clear();
        orderModels.add(new OrderModel(R.drawable.order1,"Spacy fresh crab","Waroenk kita","$ 35"));
        orderModels.add(new OrderModel(R.drawable.order2,"Spacy fresh crab","Waroenk kita","$ 35"));
        orderModels.add(new OrderModel(R.drawable.order3,"Spacy fresh crab","Waroenk kita","$ 35"));

        orderAdapter = new OrderAdapter(getContext(),orderModels);
        binding.orderRV.setAdapter(orderAdapter);



        return binding.getRoot();
    }
}