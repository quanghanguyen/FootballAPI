package com.example.footballapi.BL;

import com.google.gson.annotations.SerializedName;

public class BLTeamModel {

    @SerializedName("name")
    private String name;

    @SerializedName("crestUrl")
    private String crestUrl;

    public BLTeamModel(String name, String crestUrl) {
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
