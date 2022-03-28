package com.example.footballapi.SA;

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

public class SATeamAdapter extends RecyclerView.Adapter<SATeamAdapter.MyViewHolder> {

    Context mContext;
    ArrayList<SATeamsModel> saTeamsModels;
    Dialog dialog;


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

        //------------
        dialog = new Dialog(mContext);
        dialog.setContentView(R.layout.dialog_contact_sa);

        viewHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvSANameDetails = (TextView) dialog.findViewById(R.id.tvSANameDetails);
                TextView tvSAShortNameDetails = (TextView) dialog.findViewById(R.id.tvSAShortNameDetails);
                TextView tvSATLADetails = (TextView) dialog.findViewById(R.id.tvSATLADetails);
                TextView tvSAAddressDetails = (TextView) dialog.findViewById(R.id.tvSAAddressDetails);
                TextView tvSAPhoneDetails = (TextView) dialog.findViewById(R.id.tvSAPhoneDetails);
                TextView tvSAWebsiteDetails = (TextView) dialog.findViewById(R.id.tvSAWebsiteDetails);
                TextView tvSAEmailDetails = (TextView) dialog.findViewById(R.id.tvSAEmailDetails);
                TextView tvSAFoundedDetails = (TextView) dialog.findViewById(R.id.tvSAFoundedDetails);
                TextView tvSAVenueDetails = (TextView) dialog.findViewById(R.id.tvSAVenueDetails);

                //--------------------------------------------------

                tvSANameDetails.setText(saTeamsModels.get(viewHolder.getAdapterPosition()).getName());
                tvSAShortNameDetails.setText(saTeamsModels.get(viewHolder.getAbsoluteAdapterPosition()).getShortName());
                tvSATLADetails.setText(saTeamsModels.get(viewHolder.getAdapterPosition()).getTla());
                tvSAAddressDetails.setText(saTeamsModels.get(viewHolder.getAdapterPosition()).getAddress());
                tvSAPhoneDetails.setText(saTeamsModels.get(viewHolder.getAdapterPosition()).getPhone());
                tvSAWebsiteDetails.setText(saTeamsModels.get(viewHolder.getAdapterPosition()).getWebsite());
                tvSAEmailDetails.setText(saTeamsModels.get(viewHolder.getAdapterPosition()).getEmail());
                tvSAFoundedDetails.setText(saTeamsModels.get(viewHolder.getAdapterPosition()).getFounded());
                tvSAVenueDetails.setText(saTeamsModels.get(viewHolder.getAdapterPosition()).getVenue());

                dialog.show();
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tvSAName.setText(saTeamsModels.get(position).getName());

        Glide.with(mContext)
                .load(saTeamsModels.get(position).getCrestUrl())
                .into(holder.civSATeams);

    }

    @Override
    public int getItemCount() {
        return saTeamsModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvSAName;
        private CircleImageView civSATeams;
        private RelativeLayout relativeLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvSAName = (TextView) itemView.findViewById(R.id.tvTeamsSA);
            civSATeams = (CircleImageView) itemView.findViewById(R.id.civTeamsSA);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.rlitemTeamsSA);
        }
    }
}
