package com.latlng.foodninja;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.latlng.foodninja.adapters.FilterAdapter;
import com.latlng.foodninja.adapters.FilterParentAdapter;
import com.latlng.foodninja.databinding.FragmentFilterBinding;
import com.latlng.foodninja.models.FilterHeading;
import com.latlng.foodninja.models.FilterModel;

import java.util.ArrayList;


public class FilterFragment extends Fragment {

    FragmentFilterBinding binding;
    FilterParentAdapter adapter;
    ArrayList<FilterHeading> filterlist = new ArrayList<>();
    ArrayList<FilterModel> filterdata = new ArrayList<>();
    ArrayList<FilterModel> filterdata2 = new ArrayList<>();
    ArrayList<FilterModel> filterdata3 = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding =  FragmentFilterBinding.inflate(inflater, container, false);

        filterdata.clear();
        filterdata.add(new FilterModel("Restaurant"));
        filterdata.add(new FilterModel("Menu"));

        FilterHeading head1 = new FilterHeading("Type",filterdata);
        filterlist.add(head1);

        filterdata2.clear();
        filterdata2.add(new FilterModel("1 Km"));
        filterdata2.add(new FilterModel(">10 Km"));
        filterdata2.add(new FilterModel("<10 Km"));

        FilterHeading head2 = new FilterHeading("Location",filterdata2);
        filterlist.add(head2);

        filterdata3.clear();
        filterdata3.add(new FilterModel("Cake"));
        filterdata3.add(new FilterModel("Soup"));
        filterdata3.add(new FilterModel("Main Course"));
        filterdata3.add(new FilterModel("Appetizer"));
        filterdata3.add(new FilterModel("Dessert"));

        FilterHeading head3 = new FilterHeading("Food",filterdata3);
        filterlist.add(head3);

        adapter = new FilterParentAdapter(getContext(),filterlist);
        binding.filterRView.setAdapter(adapter);





      return binding.getRoot();
    }
}