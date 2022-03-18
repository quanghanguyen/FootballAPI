package com.example.footballapi.PL;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.footballapi.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FragmentTeam2 extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Data> lstData;
    private static final String TAG = "TeamFragment";

    public FragmentTeam2() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.team2_fragment, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.rcvTeams2);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), lstData);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstData = new ArrayList<>();
//        lstData.add(new Data("MU", "1222"));
//        lstData.add(new Data("MU", "1222"));
//        lstData.add(new Data("MU", "1222"));
//        lstData.add(new Data("MU", "1222"));
//        lstData.add(new Data("MU", "1222"));

        demoCall();

    }

    private void demoCall() {

        APIInterface apiInterface = RetrofitClient.getRetrofitInstance().create(APIInterface.class);
        Call<FetchUserResponse> callTeams = apiInterface.getDetailData();

        callTeams.enqueue(new Callback<FetchUserResponse>() {
            @Override
            public void onResponse(Call<FetchUserResponse> call, Response<FetchUserResponse> response) {

                Log.e(TAG, "onResponse: code : " + response.code());

                ArrayList<Data> data = response.body().getTeams();

                for (Data data1 : data){
                    Log.e(TAG, "onResponse: code: " + data1.getName());
                    Log.e(TAG, "onResponse: code: " + data1.getCrestUrl());

                    lstData.add(new Data(data1.getName(), data1.getCrestUrl()));
                }

            }

            @Override
            public void onFailure(Call<FetchUserResponse> call, Throwable t) {

                //Toast.makeText(getActivity(), "", Toast.LENGTH_SHORT).show();

            }

        });

    }
}
