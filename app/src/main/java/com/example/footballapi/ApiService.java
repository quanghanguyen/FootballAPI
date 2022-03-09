package com.example.footballapi;

import retrofit2.Retrofit;

public interface ApiService {

    // http://api.football-data.org/v2/competitions/2021/matches?dateFrom=2022-03-06&dateTo=2022-03-08

    ApiService apiService = new Retrofit.Builder()
            .baseUrl()

}
