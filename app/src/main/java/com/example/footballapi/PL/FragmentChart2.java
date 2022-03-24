package com.example.footballapi.PL;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

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

public class FragmentChart2 extends Fragment {

    private RecyclerViewAdapter2 adapter2;
    View v;
    private RecyclerView myrecyclerview2;
    private List<Info> lstInfo;
    private static final String TAG = "ChartFragment";

    public FragmentChart2() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.chart2_fragment, container, false);

        myrecyclerview2 = (RecyclerView) v.findViewById(R.id.rcvChart);
        adapter2 = new RecyclerViewAdapter2(getContext(), lstInfo);
        myrecyclerview2.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview2.setAdapter(adapter2);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstInfo = new ArrayList<>();

        demoCall2();
    }
//{"message":"You reached your request limit. Wait 17 seconds.","errorCode":429}
    private void demoCall2() {

        APIChartInterface apiChartInterface = RetrofitClient.getRetrofitInstance().create(APIChartInterface.class);
        Call<Standings> tableCall = apiChartInterface.getDetailChartData();

        tableCall.enqueue(new Callback<Standings>() {
            @Override
            public void onResponse(Call<Standings> call, Response<Standings> response) {
                Standings standings=response.body();
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
                    ArrayList<Table> info = response.body().getStanding();
                    Log.e(TAG, "onResponse size : " + info.size());
                    for (int i = 0; i < info.size(); i++) {
                        Log.e("info", info.get(i).toString());
                    }
                    lstInfo.addAll(info.get(0).getTable());
                    adapter2.notifyDataSetChanged();
                }

//                for (Info info1 : info) {
//                    Log.e(TAG, "onResponse: " + info1.getTeam().getName());
//                    Log.e(TAG, "onResponse: " + info1.getTeam().getCrestUrl());
//                    Log.e(TAG, "onResponse: " + info1.getDraw());
//                    Log.e(TAG, "onResponse: " + info1.getPosition());
//                    Log.e(TAG, "onResponse: " + info1.getWon());
//                    Log.e(TAG, "onResponse: " + info1.getLost());
//                    Log.e(TAG, "onResponse: " + info1.getPoints());
//
//                }
            }

            @Override
            public void onFailure(Call<Standings> call, Throwable t) {
                Log.e("onFailure", "onFailure");
                Log.e("t", t.toString());
                //Toast.makeText(getActivity(), "", Toast.LENGTH_SHORT).show();

            }

        });

    }
}
