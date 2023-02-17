package com.latlng.foodninja.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.latlng.foodninja.R;
import com.latlng.foodninja.models.Block;
import com.latlng.foodninja.models.Subject;

import java.util.ArrayList;

public class PopularMenuAdapter extends RecyclerView.Adapter<PopularMenuAdapter.ViewHolder> {
    Context context;
    private ArrayList<Subject> subjects;


    public PopularMenuAdapter(Context context, ArrayList<Subject> subjects){
        this.context=context;
        this.subjects=subjects;
    }

    @NonNull
    @Override
    public PopularMenuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(context).inflate(R.layout.home_verticalcard,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularMenuAdapter.ViewHolder holder, int position) {
        Subject subject = subjects.get(position);
        holder.img1.setImageResource(subject.img);
        holder.name1.setText(subject.name);
        holder.desc1.setText(subject.desc);
        holder.price1.setText(subject.price);

    }

    @Override
    public int getItemCount() {
        return subjects.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img1;
        TextView name1,desc1,price1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img1=itemView.findViewById(R.id.ivCard);
            name1=itemView.findViewById(R.id.proTitle);
            desc1=itemView.findViewById(R.id.proTime);
            price1=itemView.findViewById(R.id.proPrice);
        }
    }
}
