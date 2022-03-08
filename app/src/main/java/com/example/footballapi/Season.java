package com.example.footballapi;

public class Season {

    private float id;
    private String startDate;
    private String endDate;
    private float currentMatchday;

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

    public float getCurrentMatchday() {
        return currentMatchday;
    }

    public void setCurrentMatchday(float currentMatchday) {
        this.currentMatchday = currentMatchday;
    }
}
