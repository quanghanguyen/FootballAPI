package com.example.footballapi.BL;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class BLStandingsModel {

    @SerializedName("standings")
    ArrayList<BLArrayChartInfoModel> standings;

    @SerializedName("message")
    private String message;

    @SerializedName("errorCode")
    private int errorCode;

    public BLStandingsModel(ArrayList<BLArrayChartInfoModel> standings, String message, int errorCode) {
        this.standings = standings;
        this.message = message;
        this.errorCode = errorCode;
    }

    public ArrayList<BLArrayChartInfoModel> getStandings() {
        return standings;
    }

    public void setStandings(ArrayList<BLArrayChartInfoModel> standings) {
        this.standings = standings;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
