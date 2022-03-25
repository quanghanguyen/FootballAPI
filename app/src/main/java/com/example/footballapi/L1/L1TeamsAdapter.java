package com.example.footballapi.L1;

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
import com.example.footballapi.PL.RecyclerViewAdapter;
import com.example.footballapi.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class L1TeamsAdapter extends RecyclerView.Adapter<L1TeamsAdapter.MyViewHolder> {

    Context mContext;
    ArrayList<L1TeamsModel> mL1TeamModel;
    Dialog dialog;


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

        //Dialog
        dialog = new Dialog(mContext);
        dialog.setContentView(R.layout.dialog_contact_l1);

        vHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvL1NameDetails = (TextView) dialog.findViewById(R.id.tvL1NameDetails);
                TextView tvL1ShortNameDetails = (TextView) dialog.findViewById(R.id.tvL1ShortNameDetails);
                TextView tvL1TLADetails = (TextView) dialog.findViewById(R.id.tvL1TLADetails);
                TextView tvL1AddressDetails = (TextView) dialog.findViewById(R.id.tvL1AddressDetails);
                TextView tvL1PhoneDetails = (TextView) dialog.findViewById(R.id.tvL1PhoneDetails);
                TextView tvL1WebsiteDetails = (TextView) dialog.findViewById(R.id.tvL1WebsiteDetails);
                TextView tvL1EmailDetails = (TextView) dialog.findViewById(R.id.tvL1EmailDetails);
                TextView tvL1FoundedDetails = (TextView) dialog.findViewById(R.id.tvL1FoundedDetails);
                TextView tvL1VenueDetails = (TextView) dialog.findViewById(R.id.tvL1VenueDetails);

//--------------------------------------------------------------------------------------------------

                tvL1NameDetails.setText(mL1TeamModel.get(vHolder.getAdapterPosition()).getName());
                tvL1ShortNameDetails.setText(mL1TeamModel.get(vHolder.getAbsoluteAdapterPosition()).getShortName());
                tvL1TLADetails.setText(mL1TeamModel.get(vHolder.getAdapterPosition()).getTla());
                tvL1AddressDetails.setText(mL1TeamModel.get(vHolder.getAdapterPosition()).getAddress());
                tvL1PhoneDetails.setText(mL1TeamModel.get(vHolder.getAdapterPosition()).getPhone());
                tvL1WebsiteDetails.setText(mL1TeamModel.get(vHolder.getAdapterPosition()).getWebsite());
                tvL1EmailDetails.setText(mL1TeamModel.get(vHolder.getAdapterPosition()).getEmail());
                tvL1FoundedDetails.setText(mL1TeamModel.get(vHolder.getAdapterPosition()).getFounded());
                tvL1VenueDetails.setText(mL1TeamModel.get(vHolder.getAdapterPosition()).getVenue());

                dialog.show();
            }
        });

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
        private RelativeLayout relativeLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvL1Name = (TextView) itemView.findViewById(R.id.tvTeamsL1);
            civL1Teams = (CircleImageView) itemView.findViewById(R.id.civTeamsL1);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.rlitemTeamsL1);



        }
    }

}
