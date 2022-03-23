package com.example.footballapi.L1;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.footballapi.PL.RecyclerViewAdapter;
import com.example.footballapi.R;

import java.util.ArrayList;

public class L1TeamsAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    ArrayList<L1TeamsModel> mL1TeamModel;
//    Dialog dialog;


    public L1TeamsAdapter(Context mContext, ArrayList<L1TeamsModel> mL1TeamModel) {
        this.mContext = mContext;
        this.mL1TeamModel = mL1TeamModel;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.list_teamsl1, parent, false);
        MyViewHolder vHolder = new MyViewHolder(v);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
