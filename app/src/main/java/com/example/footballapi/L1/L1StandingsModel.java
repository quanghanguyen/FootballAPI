package com.example.footballapi.L1;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class L1StandingsModel {

    @SerializedName("standings")
    ArrayList<L1TableModel> standings;

    @SerializedName("message")
    private String message;

    @SerializedName("errorCode")
    private int errorCode;

    public void setStandings(ArrayList<L1TableModel> standings) {
        this.standings = standings;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public ArrayList<L1TableModel> getStandings() {
        return standings;
    }

    public String getMessage() {
        return message;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
