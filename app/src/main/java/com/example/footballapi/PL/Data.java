package com.example.footballapi.PL;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Data {

    @SerializedName("teams")
    private String name;
    @SerializedName("cresUrl")
    private String crestUrl;

    public Data(String name, String crestUrl) {
        this.name = name;
        this.crestUrl = crestUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrestUrl() {
        return crestUrl;
    }

    public void setCrestUrl(String crestUrl) {
        this.crestUrl = crestUrl;
    }
}
