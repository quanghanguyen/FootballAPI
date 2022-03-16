package com.example.footballapi.PL;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FetchUserResponse {

    @SerializedName("data")
    List<Data> dataList;

    public FetchUserResponse(List<Data> dataList) {
        this.dataList = dataList;
    }

    public List<Data> getDataList() {
        return dataList;
    }

    public void setDataList(List<Data> dataList) {
        this.dataList = dataList;
    }
}
