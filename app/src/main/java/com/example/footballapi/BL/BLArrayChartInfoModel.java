package com.example.footballapi.BL;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class BLArrayChartInfoModel {

    @SerializedName("table")
    ArrayList<BLChartInfoModel> table;

    public BLArrayChartInfoModel(ArrayList<BLChartInfoModel> table) {
        this.table = table;
    }

    public ArrayList<BLChartInfoModel> getTable() {
        return table;
    }

    public void setTable(ArrayList<BLChartInfoModel> table) {
        this.table = table;
    }
}
