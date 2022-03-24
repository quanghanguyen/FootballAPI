package com.example.footballapi.L1;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class L1TableModel {

    @SerializedName("table")
    ArrayList<L1ChartInfoModel> table;

    public L1TableModel(ArrayList<L1ChartInfoModel> table) {
        this.table = table;
    }

    public ArrayList<L1ChartInfoModel> getTable() {
        return table;
    }

    public void setTable(ArrayList<L1ChartInfoModel> table) {
        this.table = table;
    }
}
