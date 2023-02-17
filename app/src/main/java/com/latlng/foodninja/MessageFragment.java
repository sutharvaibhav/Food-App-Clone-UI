package com.latlng.foodninja;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.latlng.foodninja.adapters.MessageAdapter;
import com.latlng.foodninja.databinding.FragmentMessageBinding;
import com.latlng.foodninja.models.MessageModel;

import java.util.ArrayList;

public class MessageFragment extends Fragment {

    FragmentMessageBinding binding;
    ArrayList<MessageModel> messageModels = new ArrayList<>();
    MessageAdapter messageAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding =  FragmentMessageBinding.inflate(inflater, container, false);

        messageModels.clear();
        messageModels.add(new MessageModel(R.drawable.messageimg1, "Anamwp", "Your Order Just Arrived!", "20:00"));
        messageModels.add(new MessageModel(R.drawable.messageimg2, "Guy Hawkins", "Your Order Just Arrived!", "20:00"));
        messageModels.add(new MessageModel(R.drawable.messageimg3, "Leslie Alexander", "Your Order Just Arrived!", "20:00"));

        messageAdapter = new MessageAdapter(getContext(), messageModels);
        binding.rvMessage.setAdapter(messageAdapter);








        return binding.getRoot();
    }
}