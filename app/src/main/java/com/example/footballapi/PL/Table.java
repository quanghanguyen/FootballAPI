package com.example.footballapi.PL;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Table {

    @SerializedName("table")
    private ArrayList<Info> table;

    public Table(ArrayList<Info> table) {
        this.table = table;
    }

    public ArrayList<Info> getTable() {
        return table;
    }

    public void setTable(ArrayList<Info> table) {
        this.table = table;
    }

    @Override
    public String toString() {
        return "Table{" +
                "table=" + table +
                '}';
    }
}
