package com.example.javaappversion14.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.javaappversion14.Domains.Hourly;
import com.example.javaappversion14.R;

import java.util.ArrayList;

public class HourlyAdapter extends RecyclerView.Adapter<HourlyAdapter.viewHolder>{

    ArrayList <Hourly> items ;
    Context context ;

    public HourlyAdapter(ArrayList<Hourly> items) {
        this.items = items;
    }

    @Override
    public HourlyAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_hourly , parent , false);
        context = parent.getContext();
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HourlyAdapter.viewHolder holder, int position) {

        holder.hourtxt.setText(items.get(position).getHour());
        holder.temptxt.setText(items.get(position).getTemp()+"°");

        int drawableid = holder.itemView
                .getResources().getIdentifier(items.get(position).getImgPath() , "drawable" , holder.itemView.getContext().getPackageName()) ;

        Glide.with(context)
                .load(drawableid)
                .into(holder.img);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView hourtxt , temptxt ;
        ImageView img ;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            hourtxt = itemView.findViewById(R.id.hourtxt);
            temptxt = itemView.findViewById(R.id.temp);
            img = itemView.findViewById(R.id.img);

        }
    }
}
