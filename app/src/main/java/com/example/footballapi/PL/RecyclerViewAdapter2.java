package com.example.footballapi.PL;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.footballapi.R;

import org.w3c.dom.Text;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter2 extends RecyclerView.Adapter<RecyclerViewAdapter2.MyViewHolder>{


    Context mContext;
    List<Info> mInfo;

    public RecyclerViewAdapter2(Context mContext, List<Info> mInfo) {
        this.mContext = mContext;
        this.mInfo = mInfo;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.list_chart, parent, false);
        RecyclerViewAdapter2.MyViewHolder vHolder = new RecyclerViewAdapter2.MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tvPosition.setText(String.valueOf(mInfo.get(position).getPosition()));
        holder.tvNameTeam.setText(mInfo.get(position).getTeam().getName());
        holder.tvW.setText(String.valueOf(mInfo.get(position).getPoints()));
        holder.tvW.setText(String.valueOf(mInfo.get(position).getWon()));
        holder.tvL.setText(String.valueOf(mInfo.get(position).getLost()));
        holder.tvD.setText(String.valueOf(mInfo.get(position).getDraw()));
        holder.tvP.setText(String.valueOf(mInfo.get(position).getPoints()));
        Glide.with(mContext)
                .load(mInfo.get(position).getTeam().getCrestUrl())
                .into(holder.civTeamIcon);
    }

    @Override
    public int getItemCount() {
        return mInfo.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tvPosition;
        private TextView tvNameTeam;
        private CircleImageView civTeamIcon;
        private TextView tvW;
        private TextView tvL;
        private TextView tvD;
        private TextView tvP;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvPosition = itemView.findViewById(R.id.tvPosition);
            tvNameTeam = itemView.findViewById(R.id.tvNameTeam);
            civTeamIcon = itemView.findViewById(R.id.civTeamIcon);
            tvW = itemView.findViewById(R.id.tvW);
            tvL = itemView.findViewById(R.id.tvL);
            tvD = itemView.findViewById(R.id.tvD);
            tvP = itemView.findViewById(R.id.tvP);


        }
    }
}
