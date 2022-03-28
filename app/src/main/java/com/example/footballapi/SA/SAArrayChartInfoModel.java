package com.example.footballapi.SA;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class SAArrayChartInfoModel {

    @SerializedName("table")
    ArrayList<SAChartInfoModel> table;

    public SAArrayChartInfoModel(ArrayList<SAChartInfoModel> table) {
        this.table = table;
    }

    public ArrayList<SAChartInfoModel> getTable() {
        return table;
    }

    public void setTable(ArrayList<SAChartInfoModel> table) {
        this.table = table;
    }
}
