package com.example.footballapi.PL;

public class Winner {

    private float id;
    private String name;
    private String shortName;
    private String tla;
    private String crestUrl;

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCrestUrl() {
        return crestUrl;
    }

    public void setCrestUrl(String crestUrl) {
        this.crestUrl = crestUrl;
    }
}
