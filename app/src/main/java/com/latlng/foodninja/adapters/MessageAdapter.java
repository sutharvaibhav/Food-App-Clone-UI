package com.latlng.foodninja.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.latlng.foodninja.R;
import com.latlng.foodninja.models.MessageModel;

import java.util.ArrayList;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.ViewHolder> {

    private ArrayList<MessageModel> cdata ;
    Context context;

    public MessageAdapter(Context context, ArrayList<MessageModel> cdata){

        this.context=context;
        this.cdata=cdata;
    }



    @NonNull
    @Override
    public MessageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.message_card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageAdapter.ViewHolder holder, int position) {

        MessageModel model = cdata.get(position);
        holder.img.setImageResource(model.getImg());
        holder.name.setText(model.getName());
        holder.desc.setText(model.getDesc());
        holder.time.setText(model.getTime());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.chat_details_fragment);
            }
        });

    }

    @Override
    public int getItemCount() {
        return cdata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
         ImageView img;
         TextView name, desc, time;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgMessCard);
            name = itemView.findViewById(R.id.msgTitle);
            desc = itemView.findViewById(R.id.msgDesc);
            time = itemView.findViewById(R.id.timeTv);


        }
    }
}
