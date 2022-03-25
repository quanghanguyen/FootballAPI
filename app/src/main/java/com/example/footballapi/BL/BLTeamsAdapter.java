package com.example.footballapi.BL;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
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
    Dialog dialog;


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

        dialog = new Dialog(mContext);
        dialog.setContentView(R.layout.dialog_contact_bl);

        viewHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView tvBLNameDetails = (TextView) dialog.findViewById(R.id.tvBLNameDetails);
                TextView tvBLShortNameDetails = (TextView) dialog.findViewById(R.id.tvBLShortNameDetails);
                TextView tvBLTLADetails = (TextView) dialog.findViewById(R.id.tvBLTLADetails);
                TextView tvBLAddressDetails = (TextView) dialog.findViewById(R.id.tvBLAddressDetails);
                TextView tvBLPhoneDetails = (TextView) dialog.findViewById(R.id.tvBLPhoneDetails);
                TextView tvBLWebsiteDetails = (TextView) dialog.findViewById(R.id.tvBLWebsiteDetails);
                TextView tvBLEmailDetails = (TextView) dialog.findViewById(R.id.tvBLEmailDetails);
                TextView tvBLFoundedDetails = (TextView) dialog.findViewById(R.id.tvBLFoundedDetails);
                TextView tvBLVenueDetails = (TextView) dialog.findViewById(R.id.tvBLVenueDetails);

                //--------------------------------------------------

                tvBLNameDetails.setText(blTeamsModels.get(viewHolder.getAdapterPosition()).getName());
                tvBLShortNameDetails.setText(blTeamsModels.get(viewHolder.getAbsoluteAdapterPosition()).getShortName());
                tvBLTLADetails.setText(blTeamsModels.get(viewHolder.getAdapterPosition()).getTla());
                tvBLAddressDetails.setText(blTeamsModels.get(viewHolder.getAdapterPosition()).getAddress());
                tvBLPhoneDetails.setText(blTeamsModels.get(viewHolder.getAdapterPosition()).getPhone());
                tvBLWebsiteDetails.setText(blTeamsModels.get(viewHolder.getAdapterPosition()).getWebsite());
                tvBLEmailDetails.setText(blTeamsModels.get(viewHolder.getAdapterPosition()).getEmail());
                tvBLFoundedDetails.setText(blTeamsModels.get(viewHolder.getAdapterPosition()).getFounded());
                tvBLVenueDetails.setText(blTeamsModels.get(viewHolder.getAdapterPosition()).getVenue());

                dialog.show();
            }
        });


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
        private RelativeLayout relativeLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvBLName = (TextView) itemView.findViewById(R.id.tvTeamsBL);
            civBLTeams = (CircleImageView) itemView.findViewById(R.id.civTeamsBL);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.rlitemTeamsBL);

        }
    }
}
