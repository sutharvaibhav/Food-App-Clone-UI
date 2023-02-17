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
import com.latlng.foodninja.databinding.FragmentHomeBinding;
import com.latlng.foodninja.models.Block;

import java.util.ArrayList;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.ViewHolder> {

    private ArrayList<Block> blocks;
    private Context context;

    public CategoriesAdapter(Context context, ArrayList<Block> blocks){
        this.context=context;
        this.blocks=blocks;
    }

    @NonNull
    @Override
    public CategoriesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.homeitem_card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesAdapter.ViewHolder holder, int position) {

        Block block1 = blocks.get(position);
        holder.proimage.setImageResource(block1.img);
        holder.proname.setText(block1.name);
        holder.protime.setText(block1.time);

    }

    @Override
    public int getItemCount() {
        return blocks.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView proimage;
        TextView proname, protime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            proimage=itemView.findViewById(R.id.imageCard);
            proname=itemView.findViewById(R.id.proTitlehomeCard);
            protime=itemView.findViewById(R.id.proTimehomeCard);
        }
    }
}
