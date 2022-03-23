package com.example.footballapi.L1;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface TeamsInterface {

// https://api.football-data.org/v2/competitions/2015/teams

    @Headers("X-Auth-Token: 161d94ea5ccd478596a33f51876bd457")
    @GET("v2/competitions/2015/teams")
    Call<L1TeamsModelArrayList> getL1TeamsData();


}
