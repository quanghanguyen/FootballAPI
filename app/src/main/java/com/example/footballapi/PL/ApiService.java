package com.example.footballapi.PL;

import retrofit2.Retrofit;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;


public interface ApiService {

    // https://api.football-data.org/v2/competitions/2021


    @Headers("X-Auth-Token: 161d94ea5ccd478596a33f51876bd457")
    @GET("v2/competitions/2021")
    Call<PLModel> getAllData();

    }

