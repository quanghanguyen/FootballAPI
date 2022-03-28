package com.example.footballapi.SA;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class SAStandingsModel {

    @SerializedName("standings")
    ArrayList<SAArrayChartInfoModel> standings;

    @SerializedName("message")
    private String message;

    @SerializedName("errorCode")
    private String errorCode;

    public SAStandingsModel(ArrayList<SAArrayChartInfoModel> standings, String message, String errorCode) {
        this.standings = standings;
        this.message = message;
        this.errorCode = errorCode;
    }

    public ArrayList<SAArrayChartInfoModel> getStandings() {
        return standings;
    }

    public void setStandings(ArrayList<SAArrayChartInfoModel> standings) {
        this.standings = standings;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
