package com.example.footballapi.SA;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.footballapi.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class SAChartAdapter extends RecyclerView.Adapter<SAChartAdapter.MyViewHolder> {

    Context mContext;
    List<SAChartInfoModel> saChartInfoModelList;

    public SAChartAdapter(Context mContext, List<SAChartInfoModel> saChartInfoModelList) {
        this.mContext = mContext;
        this.saChartInfoModelList = saChartInfoModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.list_sa_chart, parent, false);
        SAChartAdapter.MyViewHolder viewHolder = new SAChartAdapter.MyViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tvSAPosition.setText(String.valueOf(saChartInfoModelList.get(position).getPosition()));
        holder.tvSANameTeam.setText(String.valueOf(saChartInfoModelList.get(position).getTeam().getName()));
        holder.tvSAP.setText(String.valueOf(saChartInfoModelList.get(position).getPoints()));
        holder.tvSAD.setText(String.valueOf(saChartInfoModelList.get(position).getDraw()));
        holder.tvSAL.setText(String.valueOf(saChartInfoModelList.get(position).getLost()));
        holder.tvSAW.setText(String.valueOf(saChartInfoModelList.get(position).getWon()));

        Glide.with(mContext)
                .load(saChartInfoModelList.get(position).getTeam().getCrestUrl())
                .into(holder.civSATeamIcon);

    }

    @Override
    public int getItemCount() {
        return saChartInfoModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvSAPosition;
        private TextView tvSANameTeam;
        private CircleImageView civSATeamIcon;
        private TextView tvSAW;
        private TextView tvSAL;
        private TextView tvSAD;
        private TextView tvSAP;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvSAPosition = (TextView) itemView.findViewById(R.id.tvSAPosition);
            tvSANameTeam = (TextView) itemView.findViewById(R.id.tvSANameTeam);
            tvSAW = (TextView) itemView.findViewById(R.id.tvSAW);
            tvSAL = (TextView) itemView.findViewById(R.id.tvSAL);
            tvSAD = (TextView) itemView.findViewById(R.id.tvSAD);
            tvSAP = (TextView) itemView.findViewById(R.id.tvSAP);
            civSATeamIcon = (CircleImageView) itemView.findViewById(R.id.civSATeamIcon);

        }
    }
}
