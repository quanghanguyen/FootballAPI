package com.example.footballapi.L1;

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
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FragmentTeamL1 extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private ArrayList<L1TeamsModel> lstL1TeamsModel;
    private static final String TAG = "TeamFragment";
    private L1TeamsAdapter l1TeamsAdapter;

    public FragmentTeamL1() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstL1TeamsModel = new ArrayList<>();

        callL1TeamsData();

    }

    private void callL1TeamsData() {

        TeamsInterface teamsInterface = RetrofitClient.getRetrofitInstance().create(TeamsInterface.class);
        Call<L1TeamsModelArrayList> call = teamsInterface.getL1TeamsData();

        call.enqueue(new Callback<L1TeamsModelArrayList>() {
            @Override
            public void onResponse(Call<L1TeamsModelArrayList> call, Response<L1TeamsModelArrayList> response) {
                 ArrayList<L1TeamsModel> l1TeamsModels = response.body().getTeams();
                 lstL1TeamsModel.addAll(l1TeamsModels);
                 l1TeamsAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<L1TeamsModelArrayList> call, Throwable t) {

            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        v = inflater.inflate(R.layout.fragment_team_l1, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.rcvL1Teams);
        l1TeamsAdapter = new L1TeamsAdapter(getContext(), lstL1TeamsModel);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(l1TeamsAdapter);
        return v;



//        return inflater.inflate(R.layout.fragment_team_l1, container, false);
    }
}