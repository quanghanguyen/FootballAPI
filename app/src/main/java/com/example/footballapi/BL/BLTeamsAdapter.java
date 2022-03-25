package com.example.footballapi.BL;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.footballapi.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class BLTeamsAdapter extends RecyclerView.Adapter<BLTeamsAdapter.MyViewHolder> {

    Context mContext;
    ArrayList<BLTeamsModel> blTeamsModels;
    // Dialog


    public BLTeamsAdapter(Context mContext, ArrayList<BLTeamsModel> blTeamsModels) {
        this.mContext = mContext;
        this.blTeamsModels = blTeamsModels;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.list_teams_bl, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(v);

        //----

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tvBLName.setText(blTeamsModels.get(position).getName());

        Glide.with(mContext)
                .load(blTeamsModels.get(position).getCrestUrl())
                .into(holder.civBLTeams);

    }

    @Override
    public int getItemCount() {
        return blTeamsModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvBLName;
        private CircleImageView civBLTeams;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvBLName = (TextView) itemView.findViewById(R.id.tvTeamsBL);
            civBLTeams = (CircleImageView) itemView.findViewById(R.id.civTeamsBL);

        }
    }
}
