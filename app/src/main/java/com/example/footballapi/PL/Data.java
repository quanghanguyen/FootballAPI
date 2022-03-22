package com.example.footballapi.PL;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Data {

    @SerializedName("name")
    private String name;

    @SerializedName("crestUrl")
    private String crestUrl;

    @SerializedName("shortName")
    private String shortName;

    @SerializedName("tla")
    private String tla;

    @SerializedName("address")
    private String address;

    @SerializedName("phone")
    private String phone;

    @SerializedName("website")
    private String website;

    @SerializedName("email")
    private String email;

    private String founded;

    private String venue;

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
