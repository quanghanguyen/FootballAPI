package com.example.footballapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

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

    RecyclerView recyclerView;
    Adaptery adaptery;
    ArrayList<PLModel> plModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        plModelList = new ArrayList<>();

        recyclerView = (RecyclerView)findViewById(R.id.rcvData);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adaptery = new Adaptery(getApplicationContext(), plModelList);
        recyclerView.setAdapter(adaptery);



        getSupportActionBar().hide();

        ApiService apiService = RetrofitClient.getRetrofitInstance().create(ApiService.class);
        Call<PLModel> call = apiService.getAllData();

        call.enqueue(new Callback<PLModel>() {
            @Override
            public void onResponse(Call<PLModel> call, Response<PLModel> response) {


                Log.e(TAG, "onResponse: code : " + response.body().getName());
                Log.e(TAG, "onResponse: code : " + response.body().getCurrentSeason().getStartDate());
                Log.e(TAG, "onResponse: code : " + response.body().getCurrentSeason().getEndDate());
                Log.e(TAG, "onResponse: code : " + response.body().getCurrentSeason().getCurrentMatchday());



                plModelList.add(new PLModel.)






                // Cú pháp để lấy Data ở trong Json Array?
//                ArrayList<PLModel.seasons> seasons = response.body().getSeasons();
//                for (PLModel.seasons seasons1 : seasons)
//                {
//                    Log.e(TAG, "onResponse: startDate : " + seasons1.getStartDate() );
//                }



            }

            @Override
            public void onFailure(Call<PLModel> call, Throwable t) {

                Log.e(TAG, "onFailure: " + t.getMessage());

            }
        });
    }
}