package com.example.footballapi.L1;

import com.google.gson.annotations.SerializedName;

public class L1TeamsModel {

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

    @SerializedName("founded")
    private String founded;

    @SerializedName("venue")
    private String venue;


    public L1TeamsModel(String name, String crestUrl, String shortName, String tla, String address, String phone, String website, String email, String founded, String venue) {
        this.name = name;
        this.crestUrl = crestUrl;
        this.shortName = shortName;
        this.tla = tla;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.email = email;
        this.founded = founded;
        this.venue = venue;
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

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getTla() {
        return tla;
    }

    public void setTla(String tla) {
        this.tla = tla;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFounded() {
        return founded;
    }

    public void setFounded(String founded) {
        this.founded = founded;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
}
