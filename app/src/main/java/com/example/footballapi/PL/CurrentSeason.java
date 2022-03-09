package com.example.footballapi.PL;

public class CurrentSeason {

    private float id;
    private String startDate;
    private String endDate;
    private String currentMatchday;
    private String winner;

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
