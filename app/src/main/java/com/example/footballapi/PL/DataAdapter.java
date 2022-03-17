package com.example.footballapi.PL;

import android.content.Context;
import android.text.Layout;
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

    private ArrayList<Data> arrayList;
    private Context context;

    public DataAdapter(ArrayList<Data> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

//        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
//        View inflate = layoutInflater.inflate(R.layout.list_teams,null);
//        ViewHolder viewHolder = new ViewHolder(inflate);
//        return viewHolder;

        View v;
        v = LayoutInflater.from(context).inflate(R.layout.list_teams, parent, false);
        ViewHolder VHolder = new ViewHolder(v);
        return  VHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Data data = arrayList.get(position);

        holder.tvTeams.setText(data.getName());

        Glide.with(context)
            .load(arrayList.get(position).getCrestUrl())
            .into(holder.civTeams);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
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
