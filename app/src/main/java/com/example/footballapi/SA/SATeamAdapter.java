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

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class SATeamAdapter extends RecyclerView.Adapter<SATeamAdapter.MyViewHolder> {

    Context mContext;
    ArrayList<SATeamsModel> saTeamsModels;
    //Dialog


    public SATeamAdapter(Context mContext, ArrayList<SATeamsModel> saTeamsModels) {
        this.mContext = mContext;
        this.saTeamsModels = saTeamsModels;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.list_team_sa, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(v);

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tvSAName.setText(saTeamsModels.get(position).getName());

        Glide.with(mContext)
                .load(saTeamsModels.get(position))
                .into(holder.civSATeams);

    }

    @Override
    public int getItemCount() {
        return saTeamsModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvSAName;
        private CircleImageView civSATeams;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvSAName = (TextView) itemView.findViewById(R.id.tvTeamsBL);
            civSATeams = (CircleImageView) itemView.findViewById(R.id.civTeamsSA);
        }
    }
}
