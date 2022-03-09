package com.example.footballapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    //private List

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View inflate = layoutInflater.inflate(R.layout.list_home, null);
        ViewHolder viewHolder = new ViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {



    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvNamePL;
        TextView tvstartDate;
        TextView tvendDate;
        TextView tvmatchDay;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNamePL = itemView.findViewById(R.id.tvNamePL);
            tvstartDate = itemView.findViewById(R.id.tvstartDate);
            tvendDate = itemView.findViewById(R.id.tvendDate);
            tvmatchDay = itemView.findViewById(R.id.tvMatchday);


        }
    }

}
