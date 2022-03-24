package com.example.footballapi.L1;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface L1ChartAPI {

//https://api.football-data.org/v2/competitions/2015/standings?standingType=HOME

    @Headers("X-Auth-Token: 161d94ea5ccd478596a33f51876bd457")
    @GET("v2/competitions/2015/standings?standingType=HOME")
    Call<L1StandingsModel> L1ChartDataCall();
}
