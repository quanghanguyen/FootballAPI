package com.example.footballapi.BL;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.footballapi.PL.RetrofitClient;
import com.example.footballapi.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FragmentTeamBL extends Fragment {

    View v;
    RecyclerView recyclerView;
    private ArrayList<BLTeamsModel> lstBLTeamsModel;
    private static final String TAG = "TeamFragment";
    private BLTeamsAdapter blTeamsAdapter;


    public FragmentTeamBL() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            lstBLTeamsModel = new ArrayList<>();

            callBLTeamsData();

        }


    private void callBLTeamsData() {

        BLTeamsAPI blTeamsAPI = RetrofitClient.getRetrofitInstance().create(BLTeamsAPI.class);
        Call<BLTeamsModelArrayList> call = blTeamsAPI.getBLTeamsData();

        call.enqueue(new Callback<BLTeamsModelArrayList>() {
            @Override
            public void onResponse(Call<BLTeamsModelArrayList> call, Response<BLTeamsModelArrayList> response) {

                ArrayList<BLTeamsModel> blTeamsModels = response.body().getTeams();
                lstBLTeamsModel.addAll(blTeamsModels);
                blTeamsAdapter.notifyDataSetChanged();


            }

            @Override
            public void onFailure(Call<BLTeamsModelArrayList> call, Throwable t) {

            }
        });

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            v = inflater.inflate(R.layout.fragment_team_b_l, container, false);
            recyclerView = (RecyclerView) v.findViewById(R.id.rcvBLTeams);
            blTeamsAdapter = new BLTeamsAdapter(getContext(), lstBLTeamsModel);
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            recyclerView.setAdapter(blTeamsAdapter);
            return v;

    }
}