package com.example.top10restaurants;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.text.NumberFormat;
import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter <RestaurantAdapter.ResViewHolder> {
    private ArrayList<Restaurants> mRes;
    private RecyclerViewClickListener mListener;

    public RestaurantAdapter(ArrayList<Restaurants> restaurants, RecyclerViewClickListener listener) {
        mRes = restaurants;
        mListener = listener;

    }

    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }
    public static class ResViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView name, value, change;
        private RecyclerViewClickListener mListener;

        public ResViewHolder(View v, RecyclerViewClickListener listener) {
            super(v);
            mListener = listener;
            v.setOnClickListener(this);
            name = v.findViewById(R.id.tvName);
            value = v.findViewById(R.id.tvValue);
            change = v.findViewById(R.id.tvChange);
        }

        @Override
        public void onClick(View view) {
            mListener.onClick(view, getAdapterPosition());
        }

    }

    @Override
    public RestaurantAdapter.ResViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.res_list_row, parent, false);
        return new ResViewHolder(v, mListener);
    }

    @Override
    public void onBindViewHolder(ResViewHolder holder, int position) {
        Restaurants res = mRes.get(position);
        holder.name.setText(res.getName());


    }

    @Override
    public int getItemCount() {
        return mRes.size();
    }

}
