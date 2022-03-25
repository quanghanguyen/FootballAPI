package com.example.footballapi.BL;

import com.example.footballapi.L1.L1StandingsModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface BLChartAPI {


    // https://api.football-data.org/v2/competitions/2002/standings?standingType=HOME

    @Headers("X-Auth-Token: 161d94ea5ccd478596a33f51876bd457")
    @GET("v2/competitions/2002/standings?standingType=HOME")
    Call<BLStandingsModel> BLChartDataCall();

}
