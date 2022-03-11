package com.example.footballapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.footballapi.PL.ApiService;
import com.example.footballapi.PL.PLModel;
import com.example.footballapi.PL.RetrofitClient;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Home extends AppCompatActivity {

    private static final String TAG = "HomeActivity";
    private ProgressBar progressBar;
    private TextView tvPLName;
    private TextView tvstartDate;
    private TextView tvendDate;
    private TextView tvmatchDay;
    private CardView cvPL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();

        tvPLName = (TextView) findViewById(R.id.tvNamePL);
        tvstartDate = (TextView) findViewById(R.id.tvstartDate);
        tvendDate = (TextView) findViewById(R.id.tvendDate);
        tvmatchDay = (TextView) findViewById(R.id.tvmatchDay);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        cvPL = (CardView) findViewById(R.id.cvPL);
        
        PLcall();

    }

    private void PLcall() {

        ApiService apiService = RetrofitClient.getRetrofitInstance().create(ApiService.class);
        Call<PLModel> call = apiService.getAllData();

        call.enqueue(new Callback<PLModel>() {
            @Override
            public void onResponse(Call<PLModel> call, Response<PLModel> response) {


                Log.e(TAG, "onResponse: code : " + response.body().getName());
                Log.e(TAG, "onResponse: code : " + response.body().getCurrentSeason().getStartDate());
                Log.e(TAG, "onResponse: code : " + response.body().getCurrentSeason().getEndDate());
                Log.e(TAG, "onResponse: code : " + response.body().getCurrentSeason().getCurrentMatchday());

                //plModelList.add(response.body().);
                PLModel plModel = response.body();

                tvPLName.setText(plModel.getName());
                tvstartDate.setText(plModel.getCurrentSeason().getStartDate());
                tvendDate.setText(plModel.getCurrentSeason().getEndDate());
                tvmatchDay.setText(plModel.getCurrentSeason().getCurrentMatchday());

                progressBar.setVisibility(View.GONE);
                cvPL.setVisibility(View.VISIBLE);

            }

            @Override
            public void onFailure(Call<PLModel> call, Throwable t) {

                Log.e(TAG, "onFailure: " + t.getMessage());

            }
        });

    }


    //
    
    
    
}