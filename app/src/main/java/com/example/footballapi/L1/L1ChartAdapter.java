package com.example.footballapi.L1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.footballapi.PL.RecyclerViewAdapter;
import com.example.footballapi.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class L1ChartAdapter extends RecyclerView.Adapter<L1ChartAdapter.MyViewHolder> {

    Context mContext;
    List<L1ChartInfoModel> mChartInfo;

    public L1ChartAdapter(Context mContext, List<L1ChartInfoModel> mChartInfo) {
        this.mContext = mContext;
        this.mChartInfo = mChartInfo;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.list_l1chart, parent, false);
        L1ChartAdapter.MyViewHolder viewHolder = new L1ChartAdapter.MyViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tvL1Position.setText(String.valueOf(mChartInfo.get(position).getPosition()));
        holder.tvL1P.setText(String.valueOf(mChartInfo.get(position).getPoints()));
        holder.tvL1W.setText(String.valueOf(mChartInfo.get(position).getWon()));
        holder.tvL1D.setText(String.valueOf(mChartInfo.get(position).getDraw()));
        holder.tvL1L.setText(String.valueOf(mChartInfo.get(position).getLost()));
        holder.tvL1NameTeam.setText(String.valueOf(mChartInfo.get(position).getTeam().getName()));

        Glide.with(mContext).
                load(mChartInfo.get(position).getTeam().getCrestUrl())
                .into(holder.civL1TeamIcon);

    }

    @Override
    public int getItemCount() {
        return mChartInfo.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvL1Position;
        private TextView tvL1NameTeam;
        private CircleImageView civL1TeamIcon;
        private TextView tvL1W;
        private TextView tvL1L;
        private TextView tvL1D;
        private TextView tvL1P;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvL1Position = (TextView) itemView.findViewById(R.id.tvL1Position);
            tvL1NameTeam = (TextView) itemView.findViewById(R.id.tvL1NameTeam);
            tvL1W = (TextView) itemView.findViewById(R.id.tvL1W);
            tvL1L = (TextView) itemView.findViewById(R.id.tvL1L);
            tvL1D = (TextView) itemView.findViewById(R.id.tvL1D);
            tvL1P = (TextView) itemView.findViewById(R.id.tvL1P);
            civL1TeamIcon = (CircleImageView) itemView.findViewById(R.id.civL1TeamIcon);



        }
    }
}
