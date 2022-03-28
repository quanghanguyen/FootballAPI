package com.example.footballapi.SA;

import android.content.Context;
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


public class FragmentTeamSA extends Fragment {

    View v;
    RecyclerView recyclerView;
    private ArrayList<SATeamsModel> lstSATeamsModel;
    private static final String TAG = "TeamFragment";
    private SATeamAdapter saTeamAdapter;

    public FragmentTeamSA() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstSATeamsModel = new ArrayList<>();

        callSATeamsData();

    }

    private void callSATeamsData() {

        SATeamsAPI saTeamsAPI = RetrofitClient.getRetrofitInstance().create(SATeamsAPI.class);
        Call<SATeamModelArrayList> call = saTeamsAPI.getSATeamsData();

        call.enqueue(new Callback<SATeamModelArrayList>() {
            @Override
            public void onResponse(Call<SATeamModelArrayList> call, Response<SATeamModelArrayList> response) {

                ArrayList<SATeamsModel> saTeamsModels = response.body().getTeams();
                lstSATeamsModel.addAll(saTeamsModels);
                saTeamAdapter.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<SATeamModelArrayList> call, Throwable t) {

            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_team_s_a, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.rcvTeamSA);
        saTeamAdapter = new SATeamAdapter(getContext(), lstSATeamsModel);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(saTeamAdapter);
        return v;



//        return inflater.inflate(R.layout.fragment_team_s_a, container, false);
    }
}