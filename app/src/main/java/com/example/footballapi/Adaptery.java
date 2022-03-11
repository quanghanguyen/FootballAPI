package com.example.footballapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.footballapi.PL.PLModel;

import org.w3c.dom.Text;

import java.util.List;

public class Adaptery extends RecyclerView.Adapter<Adaptery.MyViewHolder> {

    private Context mContext;
    private List<PLModel> plModels;

    public Adaptery(Context mContext, List<PLModel> plModels) {
        this.mContext = mContext;
        this.plModels = plModels;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        v = layoutInflater.inflate(R.layout.list_home, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tvName.setText(plModels.get(position).getName());
        holder.tvStartDate.setText(plModels.get(position).getCurrentSeason().getStartDate());
        holder.tvEndDate.setText((plModels.get(position).getCurrentSeason().getEndDate()));
        holder.tvMatchDay.setText(plModels.get(position).getCurrentSeason().getCurrentMatchday());


        // Load ảnh bằng Glide nếu các mốc sau cần có ảnh
//        Glide.with(mContext)
//                .load(plModels.get(position).getImage())
//                .into(holder.ivImage);


    }

    @Override
    public int getItemCount() {
        return plModels.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;
        TextView tvStartDate;
        TextView tvEndDate;
        TextView tvMatchDay;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tvNamePL);
            tvStartDate = itemView.findViewById(R.id.tvStartDate);
            tvEndDate = itemView.findViewById(R.id.tvEndDate);
            tvMatchDay = itemView.findViewById(R.id.tvMatchday);


        }
    }

}
