package com.example.footballapi.PL;

import com.google.gson.annotations.SerializedName;

public class CurrentSeason {
    @SerializedName("id")
    private float id;
    @SerializedName("startDate")
    private String startDate;
    @SerializedName("endDate")
    private String endDate;
    @SerializedName("currentMatchday")
    private String currentMatchday;
    @SerializedName("winner")
    private String winner;

    public CurrentSeason(float id, String startDate, String endDate, String currentMatchday, String winner) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.currentMatchday = currentMatchday;
        this.winner = winner;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCurrentMatchday() {
        return currentMatchday;
    }

    public void setCurrentMatchday(String currentMatchday) {
        this.currentMatchday = currentMatchday;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
