package com.example.footballapi.L1;

import android.app.Dialog;
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

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class L1TeamsAdapter extends RecyclerView.Adapter<L1TeamsAdapter.MyViewHolder> {

    Context mContext;
    ArrayList<L1TeamsModel> mL1TeamModel;
//    Dialog dialog;


    public L1TeamsAdapter(Context mContext, ArrayList<L1TeamsModel> mL1TeamModel) {
        this.mContext = mContext;
        this.mL1TeamModel = mL1TeamModel;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.list_teamsl1, parent, false);
        MyViewHolder vHolder = new MyViewHolder(v);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tvL1Name.setText(mL1TeamModel.get(position).getName());

        Glide.with(mContext)
                .load(mL1TeamModel.get(position).getCrestUrl())
                .into(holder.civL1Teams);

    }

    @Override
    public int getItemCount() {
        return mL1TeamModel.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvL1Name;
        private CircleImageView civL1Teams;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvL1Name = (TextView) itemView.findViewById(R.id.tvTeamsL1);
            civL1Teams = (CircleImageView) itemView.findViewById(R.id.civTeamsL1);



        }
    }

}
