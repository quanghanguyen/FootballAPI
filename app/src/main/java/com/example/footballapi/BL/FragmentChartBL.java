package com.example.footballapi.BL;

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
import com.example.footballapi.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class FragmentChartBL extends Fragment {

    private BLChartAdapter blChartAdapter;
    View v;
    private RecyclerView recyclerView;
    private List<BLChartInfoModel> lstBLChartInfoModel;
    private static final String TAG = "BL_ChartFragment";

    public FragmentChartBL() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstBLChartInfoModel = new ArrayList<>();

        BLChartDatacall();


        }

    private void BLChartDatacall() {

        BLChartAPI blChartAPI = RetrofitClient.getRetrofitInstance().create(BLChartAPI.class);
        Call<BLStandingsModel> blStandingsModelCall = blChartAPI.BLChartDataCall();

        blStandingsModelCall.enqueue(new Callback<BLStandingsModel>() {
            @Override
            public void onResponse(Call<BLStandingsModel> call, Response<BLStandingsModel> response) {
                BLStandingsModel blStandingsModel = response.body();
                if (blStandingsModel.getMessage()!=null)
                {
                    requireActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(requireContext(), blStandingsModel.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                else
                {
                   ArrayList<BLArrayChartInfoModel> blArrayChartInfoModels = response.body().getStandings();
                    Log.e(TAG, "onResponse size : " + blArrayChartInfoModels.size());
                    for (int i = 0; i < blArrayChartInfoModels.size(); i++)
                    {
                        Log.e("info", blArrayChartInfoModels.get(i).toString());
                    }
                    lstBLChartInfoModel.addAll(blArrayChartInfoModels.get(0).getTable());
                    blChartAdapter.notifyDataSetChanged();

                }

            }

            @Override
            public void onFailure(Call<BLStandingsModel> call, Throwable t) {

            }
        });

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_chart_b_l, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.rcvBLChart);
        blChartAdapter = new BLChartAdapter(getContext(), lstBLChartInfoModel);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(blChartAdapter);

        return v;

    }
}