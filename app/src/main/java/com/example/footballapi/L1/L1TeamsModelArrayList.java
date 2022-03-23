package com.example.footballapi.L1;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class L1TeamsModelArrayList {

    @SerializedName("teams")
    private ArrayList<L1TeamsModel> teams;

    public L1TeamsModelArrayList(ArrayList<L1TeamsModel> teams) {
        this.teams = teams;
    }

    public ArrayList<L1TeamsModel> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<L1TeamsModel> teams) {
        this.teams = teams;
    }
}
