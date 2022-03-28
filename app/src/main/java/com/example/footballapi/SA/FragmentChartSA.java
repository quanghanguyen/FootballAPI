package com.example.footballapi.SA;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.footballapi.BL.BLArrayChartInfoModel;
import com.example.footballapi.BL.BLStandingsModel;
import com.example.footballapi.PL.RetrofitClient;
import com.example.footballapi.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FragmentChartSA extends Fragment {

    private SAChartAdapter saChartAdapter;
    View v;
    private RecyclerView recyclerView;
    private List<SAChartInfoModel> saChartInfoModelList;
    private static final String TAG = "BL_ChartFragment";


    public FragmentChartSA() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        saChartInfoModelList = new ArrayList<>();

        SAChartDataCall();
    }

    private void SAChartDataCall() {

        SAChartAPI saChartAPI = RetrofitClient.getRetrofitInstance().create(SAChartAPI.class);
        Call<SAStandingsModel> saStandingsModelCall = saChartAPI.SAChartDataCall();

        saStandingsModelCall.enqueue(new Callback<SAStandingsModel>() {
            @Override
            public void onResponse(Call<SAStandingsModel> call, Response<SAStandingsModel> response) {
                SAStandingsModel saStandingsModel = response.body();
                if (saStandingsModel.getMessage() != null) {
                    requireActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(requireContext(), saStandingsModel.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
                } else {
                    ArrayList<SAArrayChartInfoModel> saArrayChartInfoModels = response.body().getStandings();
                    Log.e(TAG, "onResponse size : " + saArrayChartInfoModels.size());
                    for (int i = 0; i < saArrayChartInfoModels.size(); i++) {
                        Log.e("info", saArrayChartInfoModels.get(i).toString());
                    }
                    saChartInfoModelList.addAll(saArrayChartInfoModels.get(0).getTable());
                    saChartAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<SAStandingsModel> call, Throwable t) {

            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_chart_s_a, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.rcvSAChart);
        saChartAdapter = new SAChartAdapter(getContext(), saChartInfoModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(saChartAdapter);

        return v;

        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_chart_s_a, container, false);
    }
}