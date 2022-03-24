package com.example.footballapi.L1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.footballapi.PL.RetrofitClient;
import com.example.footballapi.PL.Standings;
import com.example.footballapi.PL.Table;
import com.example.footballapi.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class FragmentChartL1 extends Fragment {

    private L1ChartAdapter l1ChartAdapter;
    View v;
    private RecyclerView recyclerView;
    private List<L1ChartInfoModel> lstl1ChartInfoModels;
    private static final String TAG = "L1_ChartFragment";



    public FragmentChartL1() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstl1ChartInfoModels = new ArrayList<>();

        chartDatacall();


    }

    private void chartDatacall() {

        L1ChartAPI l1ChartAPI = RetrofitClient.getRetrofitInstance().create(L1ChartAPI.class);
        Call<L1StandingsModel> l1StandingsModelCall = l1ChartAPI.L1ChartDataCall();

        l1StandingsModelCall.enqueue(new Callback<L1StandingsModel>() {
            @Override
            public void onResponse(Call<L1StandingsModel> call, Response<L1StandingsModel> response) {
                L1StandingsModel standings = response.body();
                if(standings.getMessage()!=null)
                {
                    requireActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(requireContext(), standings.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }
                else
                {
                    ArrayList<L1TableModel> l1TableModels = response.body().getStandings();
                    Log.e(TAG, "onResponse size : " + l1TableModels.size());
                    for (int i = 0; i < l1TableModels.size(); i++) {
                        Log.e("info", l1TableModels.get(i).toString());
                    }
                    lstl1ChartInfoModels.addAll(l1TableModels.get(0).getTable());
                    l1ChartAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<L1StandingsModel> call, Throwable t) {

            }
        });



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_chart_l1, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.rcvL1Chart);
        l1ChartAdapter = new L1ChartAdapter(getContext(), lstl1ChartInfoModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(l1ChartAdapter);

        return v;
    }
}