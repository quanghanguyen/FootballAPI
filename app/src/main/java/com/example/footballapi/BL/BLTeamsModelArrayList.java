package com.example.footballapi.BL;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class BLTeamsModelArrayList {

    @SerializedName("teams")
    private ArrayList<BLTeamsModel> teams;

    public BLTeamsModelArrayList(ArrayList<BLTeamsModel> teams) {
        this.teams = teams;
    }

    public ArrayList<BLTeamsModel> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<BLTeamsModel> teams) {
        this.teams = teams;
    }
}
