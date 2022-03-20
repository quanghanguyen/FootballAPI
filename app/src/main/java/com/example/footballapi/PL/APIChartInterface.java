package com.example.footballapi.PL;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface APIChartInterface {

// https://api.football-data.org/v2/competitions/2021/standings?standingType=HOME

    @Headers("X-Auth-Token: 161d94ea5ccd478596a33f51876bd457")
    @GET("v2/competitions/2021/standings?standingType=HOME")
    Call<Standings> getDetailChartData();


}
