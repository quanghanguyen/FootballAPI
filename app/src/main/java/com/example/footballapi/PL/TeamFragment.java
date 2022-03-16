package com.example.footballapi.PL;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.footballapi.Home;
import com.example.footballapi.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TeamFragment extends Fragment {


    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private DataAdapter dataAdapter;
    private List<Data> dataList;

    private static final String TAG = "HomeActivity";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_team, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.rcvTeams);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        fetchData();
    }

    private void fetchData() {

        APIInterface apiInterface = RetrofitClient.getRetrofitInstance().create(APIInterface.class);
        Call<FetchUserResponse> callTeams = apiInterface.getDetailData();

        callTeams.enqueue(new Callback<FetchUserResponse>() {
            @Override
            public void onResponse(Call<FetchUserResponse> call, Response<FetchUserResponse> response) {

                dataList = response.body().getDataList();
                recyclerView.setAdapter(new DataAdapter(getActivity(), dataList));

            }

            @Override
            public void onFailure(Call<FetchUserResponse> call, Throwable t) {

                //Toast.makeText(getActivity(), "", Toast.LENGTH_SHORT).show();

            }
        });

    }


}