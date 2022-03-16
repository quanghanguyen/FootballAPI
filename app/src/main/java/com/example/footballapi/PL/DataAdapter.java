package com.example.footballapi.PL;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.footballapi.R;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private List<Data> dataList;
    private Context context;

    public DataAdapter(ArrayList<Data> dataList){
        this.dataList = dataList;

    }

    public DataAdapter(FragmentActivity activity, List<Data> dataList) {
        this.dataList = dataList;
        this.context = context;
    }





    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View inflate = layoutInflater.inflate(R.layout.list_teams, null);
        ViewHolder viewHolder = new ViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Data data = dataList.get(position);

        holder.tvTeams.setText(data.getName());

        Glide.with(context)
            .load(dataList.get(position).getCrestUrl())
            .into(holder.civTeams);


    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private CircleImageView civTeams;
        private TextView tvTeams;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            civTeams = (CircleImageView) itemView.findViewById(R.id.civTeams);
            tvTeams = (TextView) itemView.findViewById(R.id.tvTeams);
        }
    }
}
