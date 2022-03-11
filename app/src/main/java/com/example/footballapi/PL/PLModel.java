package com.example.footballapi.PL;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class PLModel {
    @SerializedName("name")
    private String name;
    @SerializedName("currentSeason")
    private CurrentSeason currentSeason;

    public PLModel(String name, CurrentSeason currentSeason) {
        this.name = name;
        this.currentSeason = currentSeason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CurrentSeason getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(CurrentSeason currentSeason) {
        this.currentSeason = currentSeason;
    }
}
