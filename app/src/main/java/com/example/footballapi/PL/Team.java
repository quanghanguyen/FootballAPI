package com.example.footballapi.PL;

import com.google.gson.annotations.SerializedName;

public class Team {

    @SerializedName("name")
    private String name;
    @SerializedName("crestUrl")
    private String crestUrl;

    public Team(String name, String crestUrl) {
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
