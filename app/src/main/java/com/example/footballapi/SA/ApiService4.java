package com.example.footballapi.SA;

import com.example.footballapi.PL.PLModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ApiService4 {

    // https://api.football-data.org/v2/competitions/2019

    @Headers("X-Auth-Token: 161d94ea5ccd478596a33f51876bd457")
    @GET("v2/competitions/2019")
    Call<PLModel> getAllDataL3();



}