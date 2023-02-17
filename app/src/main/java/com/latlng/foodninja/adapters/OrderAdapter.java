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
import com.latlng.foodninja.models.OrderModel;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter <OrderAdapter.ViewHolder> {

    Context context;
    private ArrayList<OrderModel> list;

    public OrderAdapter(Context context,ArrayList<OrderModel> list){
        this.context=context;
        this.list=list;
    }

    @NonNull
    @Override
    public OrderAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.order_details_card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderAdapter.ViewHolder holder, int position) {

        OrderModel orderModel = list.get(position);
        holder.image.setImageResource(orderModel.getImg());
        holder.name.setText(orderModel.getName());
        holder.desc.setText(orderModel.getDesc());
        holder.price.setText(orderModel.getPrice());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name,desc,price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.ordCardIv);
            name = itemView.findViewById(R.id.ordTitleTv);
            desc = itemView.findViewById(R.id.ordDescTv);
            price = itemView.findViewById(R.id.ordRateTv);

        }
    }
}
