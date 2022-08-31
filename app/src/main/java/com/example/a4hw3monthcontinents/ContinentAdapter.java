package com.example.a4hw3monthcontinents;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder> {

    public ArrayList<Continent> continents;
    private OnItemClickListener listener;

    public ContinentAdapter(ArrayList<Continent> continents, OnItemClickListener listener) {
        this.continents = continents;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_continent, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(continents.get(position));
         holder.itemView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 listener.onItemClick(position);
             }
         });
    }

    @Override
    public int getItemCount() {
        return continents.size();
    }

    public int getCountry(int position) {
        return position;
    }


    static class ContinentViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_continent;
        private ImageView flag;

        public ContinentViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_continent = itemView.findViewById(R.id.continent);
            flag = itemView.findViewById(R.id.flag);
        }

        public void bind(Continent continent){
            tv_continent.setText(continent.getName());
            Glide.with(flag).load(continent.getFlag()).into(flag);
        }
    }
}
