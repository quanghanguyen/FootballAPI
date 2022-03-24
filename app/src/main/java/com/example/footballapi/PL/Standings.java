package com.example.footballapi.PL;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Standings {
    @SerializedName("standings")
    private ArrayList<Table> Standing;

    @SerializedName("message")
    private String message;

    @SerializedName("errorCode")
    private int errorCode;
    public ArrayList<com.example.footballapi.PL.Table> getStanding() {
        return Standing;
    }

    public String getMessage() {
        return message;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
