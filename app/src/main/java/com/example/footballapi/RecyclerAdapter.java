package com.example.footballapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.footballapi.PL.PLModel;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<PLModel> arrayList;
    private Context context;

    public RecyclerAdapter(List<PLModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View inflate = layoutInflater.inflate(R.layout.list_home, null);
        ViewHolder viewHolder = new ViewHolder(inflate);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {

        PLModel plModel = arrayList.get(position);

        holder.NamePL.setText(plModel.getName());
        holder.startDate.setText(plModel.getCurrentSeason().getStartDate());
        holder.endDate.setText(plModel.getCurrentSeason().getEndDate());
        holder.matchDay.setText(plModel.getCurrentSeason().getCurrentMatchday());


    }

    @Override
    public int getItemCount()
    {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView NamePL;
        TextView startDate;
        TextView endDate;
        TextView matchDay;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            NamePL = itemView.findViewById(R.id.tvNamePL);
            startDate = itemView.findViewById(R.id.tvstartDate);
            endDate = itemView.findViewById(R.id.tvendDate);
            matchDay = itemView.findViewById(R.id.tvMatchday);


        }
    }

}
