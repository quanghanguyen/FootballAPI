package com.example.footballapi.PL;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class FetchUserResponse {

    @SerializedName("teams")
    private ArrayList<Data> teams;

    public FetchUserResponse(ArrayList<Data> teams) {
        this.teams = teams;
    }

    public ArrayList<Data> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Data> teams) {
        this.teams = teams;
    }
}
