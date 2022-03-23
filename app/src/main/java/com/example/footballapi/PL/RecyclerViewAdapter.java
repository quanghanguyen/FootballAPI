package com.example.footballapi.PL;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.footballapi.R;

import org.w3c.dom.Text;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<Data> mData;
    Dialog myDialog;

    public RecyclerViewAdapter(Context mContext, List<Data> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.list_teams, parent, false);
        MyViewHolder vHolder = new MyViewHolder(v);

        //Dialog
        myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.dialog_contact);


        vHolder.itemTeams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvNameDetails = (TextView) myDialog.findViewById(R.id.tvNameDetails);
                TextView tvShortNameDetails = (TextView) myDialog.findViewById(R.id.tvShortNameDetails);
                TextView tvTLADetails = (TextView) myDialog.findViewById(R.id.tvTLADetails);
                TextView tvAddressDetails = (TextView) myDialog.findViewById(R.id.tvAddressDetails);
                TextView tvPhoneDetails = (TextView) myDialog.findViewById(R.id.tvPhoneDetails);
                TextView tvWebsiteDetails = (TextView) myDialog.findViewById(R.id.tvWebsiteDetails);
                TextView tvEmailDetails = (TextView) myDialog.findViewById(R.id.tvEmailDetails);
                TextView tvFoundedDetails = (TextView) myDialog.findViewById(R.id.tvFoundedDetails);
                TextView tvVenueDetails = (TextView) myDialog.findViewById(R.id.tvVenueDetails);

                tvNameDetails.setText(mData.get(vHolder.getAdapterPosition()).getName());
                tvShortNameDetails.setText(mData.get(vHolder.getAdapterPosition()).getShortName());
                tvAddressDetails.setText(mData.get(vHolder.getAdapterPosition()).getAddress());
                tvTLADetails.setText(mData.get(vHolder.getAdapterPosition()).getTla());
                tvPhoneDetails.setText(mData.get(vHolder.getAdapterPosition()).getPhone());
                tvWebsiteDetails.setText(mData.get(vHolder.getAdapterPosition()).getWebsite());
                tvEmailDetails.setText(mData.get(vHolder.getAdapterPosition()).getEmail());
                tvFoundedDetails.setText(mData.get(vHolder.getAdapterPosition()).getFounded());
                tvVenueDetails.setText(mData.get(vHolder.getAdapterPosition()).getVenue());

//                Toast.makeText(mContext, "Test Click" + String.valueOf(vHolder.getAbsoluteAdapterPosition()), Toast.LENGTH_SHORT).show();
                myDialog.show();
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tvName2.setText(mData.get(position).getName());

        // Load ảnh bằng Glide
                Glide.with(mContext)
                .load(mData.get(position).getCrestUrl())
                .into(holder.civTeams2);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private RelativeLayout itemTeams;
        private TextView tvName2;
        private CircleImageView civTeams2;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            itemTeams = (RelativeLayout) itemView.findViewById(R.id.rlitemTeams);
            tvName2 = (TextView) itemView.findViewById(R.id.tvTeams);
            civTeams2 = (CircleImageView) itemView.findViewById(R.id.civTeams);

        }
    }
}
