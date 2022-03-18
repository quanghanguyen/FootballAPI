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

public class FragmentChart2 extends Fragment {

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
        RecyclerViewAdapter2 recyclerViewAdapter2 = new RecyclerViewAdapter2(getContext(), lstInfo);
        myrecyclerview2.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview2.setAdapter(recyclerViewAdapter2);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstInfo = new ArrayList<>();

        demoCall2();
    }

    private void demoCall2() {

        APIChartInterface apiChartInterface = RetrofitClient.getRetrofitInstance().create(APIChartInterface.class);
        Call<Table> tableCall = apiChartInterface.getDetailChartData();

        tableCall.enqueue(new Callback<Table>() {
            @Override
            public void onResponse(Call<Table> call, Response<Table> response) {

                Log.e(TAG, "onResponse: code : " + response.code());

                ArrayList<Info> info = response.body().getTable();


//                for (Info info1 : info) {
//                    Log.e(TAG, "onResponse: " + info1.getTeam().getName());
//                }



            }

            @Override
            public void onFailure(Call<Table> call, Throwable t) {

                //Toast.makeText(getActivity(), "", Toast.LENGTH_SHORT).show();

            }

        });

    }
}
