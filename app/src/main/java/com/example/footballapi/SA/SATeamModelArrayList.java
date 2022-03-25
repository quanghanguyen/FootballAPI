package com.example.footballapi.SA;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class SATeamModelArrayList {

    @SerializedName("teams")
    private ArrayList<SATeamsModel> teams;

    public SATeamModelArrayList(ArrayList<SATeamsModel> teams) {
        this.teams = teams;
    }

    public ArrayList<SATeamsModel> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<SATeamsModel> teams) {
        this.teams = teams;
    }
}
