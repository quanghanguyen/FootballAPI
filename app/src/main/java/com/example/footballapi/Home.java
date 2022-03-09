package com.example.footballapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.example.footballapi.PL.ApiService;
import com.example.footballapi.PL.PLModel;
import com.example.footballapi.PL.RetrofitClient;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Home extends AppCompatActivity {

    private static final String TAG = "HomeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().hide();

        ApiService apiService = RetrofitClient.getRetrofitInstance().create(ApiService.class);
        Call<PLModel> call = apiService.getAllData();

        call.enqueue(new Callback<PLModel>() {
            @Override
            public void onResponse(Call<PLModel> call, Response<PLModel> response) {
                Log.e(TAG, "onResponse: code : " + response.code());
                ArrayList<PLModel.seasons> seasons = response.body().getSeasons();

                for (PLModel.seasons seasons1 : seasons)
                {
                    Log.e(TAG, "onResponse: winner : " + seasons1.getWinner() );
                }

            }

            @Override
            public void onFailure(Call<PLModel> call, Throwable t) {

                Log.e(TAG, "onFailure: " + t.getMessage());

            }
        });


    }
}