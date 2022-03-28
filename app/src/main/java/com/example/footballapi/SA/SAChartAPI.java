package com.example.footballapi.SA;

import com.example.footballapi.BL.BLStandingsModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface SAChartAPI {

    @Headers("X-Auth-Token: 161d94ea5ccd478596a33f51876bd457")
    @GET("v2/competitions/2019/standings?standingType=HOME")
    Call<SAStandingsModel> SAChartDataCall();

}
