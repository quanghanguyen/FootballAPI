package com.example.footballapi.BL;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.footballapi.L1.L1ChartAdapter;
import com.example.footballapi.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class BLChartAdapter extends RecyclerView.Adapter<BLChartAdapter.MyViewHolder> {

    Context mContext;
    List<BLChartInfoModel> blChartInfoModels;

    public BLChartAdapter(Context mContext, List<BLChartInfoModel> blChartInfoModels) {
        this.mContext = mContext;
        this.blChartInfoModels = blChartInfoModels;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.list_bl_chart, parent, false);
        BLChartAdapter.MyViewHolder viewHolder = new BLChartAdapter.MyViewHolder(v);

        return viewHolder;



    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        holder.tvBLPosition.setText(String.valueOf(blChartInfoModels.get(position).getPosition()));
        holder.tvBLNameTeam.setText(String.valueOf(blChartInfoModels.get(position).getTeam().getName()));
        holder.tvBLW.setText(String.valueOf(blChartInfoModels.get(position).getWon()));
        holder.tvBLL.setText(String.valueOf(blChartInfoModels.get(position).getLost()));
        holder.tvBLD.setText(String.valueOf(blChartInfoModels.get(position).getDraw()));
        holder.tvBLP.setText(String.valueOf(blChartInfoModels.get(position).getPoints()));

        Glide.with(mContext)
                .load(blChartInfoModels.get(position).getTeam().getCrestUrl())
                .into(holder.civBLTeamIcon);


    }

    @Override
    public int getItemCount() {
        return blChartInfoModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvBLPosition;
        private TextView tvBLNameTeam;
        private CircleImageView civBLTeamIcon;
        private TextView tvBLW;
        private TextView tvBLL;
        private TextView tvBLD;
        private TextView tvBLP;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvBLPosition = (TextView) itemView.findViewById(R.id.tvBLPosition);
            tvBLNameTeam = (TextView) itemView.findViewById(R.id.tvBLNameTeam);
            tvBLW = (TextView) itemView.findViewById(R.id.tvBLW);
            tvBLL = (TextView) itemView.findViewById(R.id.tvBLL);
            tvBLD = (TextView) itemView.findViewById(R.id.tvBLD);
            tvBLP = (TextView) itemView.findViewById(R.id.tvBLP);
            civBLTeamIcon = (CircleImageView) itemView.findViewById(R.id.civBLTeamIcon);


        }
    }
}
