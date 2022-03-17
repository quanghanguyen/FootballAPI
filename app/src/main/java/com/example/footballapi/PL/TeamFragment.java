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

    private static final String TAG = "TeamFragment";
    private RecyclerView recyclerView;
    private ArrayList<Data> arrayList;
//    private DataAdapter recyclerAdapter;
    private View v;

    public TeamFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.list_teams, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.rcvTeams);
        DataAdapter dataAdapter = new DataAdapter(arrayList, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(dataAdapter);
        return v;

    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        arrayList = new ArrayList<>();

//        fetchData();

    }

//    private void fetchData() {
//
//        APIInterface apiInterface = RetrofitClient.getRetrofitInstance().create(APIInterface.class);
//        Call<FetchUserResponse> callTeams = apiInterface.getDetailData();
//
////        callTeams.enqueue(new Callback<FetchUserResponse>() {
////            @Override
////            public void onResponse(Call<FetchUserResponse> call, Response<FetchUserResponse> response) {
////
////                Log.e(TAG, "onResponse: code : " + response.code());
////
////                ArrayList<Data> data = response.body().getTeams();
////
////                for (Data data1 : data){
////                    Log.e(TAG, "onResponse: code: " + data1.getName());
////                    Log.e(TAG, "onResponse: code: " + data1.getCrestUrl());
////
////                    arrayList.add(new Data(data1.getName(), data1.getCrestUrl()));
////                }
////
////            }
////
////            @Override
////            public void onFailure(Call<FetchUserResponse> call, Throwable t) {
////
////                //Toast.makeText(getActivity(), "", Toast.LENGTH_SHORT).show();
////
////            }
//        });
//
//    }

}