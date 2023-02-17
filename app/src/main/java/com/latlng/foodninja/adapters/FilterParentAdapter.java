package com.latlng.foodninja.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.latlng.foodninja.R;
import com.latlng.foodninja.models.Block;
import com.latlng.foodninja.models.FilterHeading;

import java.util.ArrayList;

public class FilterParentAdapter extends RecyclerView.Adapter<FilterParentAdapter.ViewHolder> {

    ArrayList<FilterHeading> cdata;
    Context context;

    public FilterParentAdapter(Context context, ArrayList<FilterHeading> cdata){

        this.context=context;
        this.cdata=cdata;

    }


    @NonNull
    @Override
    public FilterParentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.filter_main_card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilterParentAdapter.ViewHolder holder, int position) {

        FilterHeading data = cdata.get(position);
        holder.head.setText(data.getHeading());

        FilterAdapter adapter = new FilterAdapter(context,data.getData());
        holder.recyclerView.setAdapter(adapter);


    }

    @Override
    public int getItemCount() {
        return cdata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView head;
        RecyclerView recyclerView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            head = itemView.findViewById(R.id.typeTv);
            recyclerView = itemView.findViewById(R.id.typeView);
        }
    }
}
