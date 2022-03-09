package com.example.footballapi.PL;

import java.util.ArrayList;

public class PLModel {

    private float id;
    private Area area;
    private String name;
    private String code;
    private String emblemUrl;
    private String plan;
    private CurrentSeason currentSeason;
    private ArrayList<seasons> seasons;
    private String lastUpdated;

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmblemUrl() {
        return emblemUrl;
    }

    public void setEmblemUrl(String emblemUrl) {
        this.emblemUrl = emblemUrl;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public CurrentSeason getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(CurrentSeason currentSeason) {
        this.currentSeason = currentSeason;
    }

    public ArrayList<PLModel.seasons> getSeasons() {
        return seasons;
    }

    public void setSeasons(ArrayList<PLModel.seasons> seasons) {
        this.seasons = seasons;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public class seasons {

        private float id;
        private String startDate;
        private String endDate;
        private float currentMatchday;
        private Winner winner;

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

        public Winner getWinner() {
            return winner;
        }

        public void setWinner(Winner winner) {
            this.winner = winner;
        }
    }

}
