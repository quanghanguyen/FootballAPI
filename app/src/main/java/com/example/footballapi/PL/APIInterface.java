package com.example.footballapi.PL;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface APIInterface {

    // https://api.football-data.org/v2/competitions/2021/teams

    @Headers("X-Auth-Token: 161d94ea5ccd478596a33f51876bd457")
    @GET("v2/competitions/2021/teams")
    Call<Data> CallDetailData();

}
