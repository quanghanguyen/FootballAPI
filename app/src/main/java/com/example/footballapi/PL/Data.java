package com.example.footballapi.PL;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Data {

    @SerializedName("teams")
    ArrayList<teams> teams;

    public Data(ArrayList<Data.teams> teams) {
        this.teams = teams;
    }

    public ArrayList<Data.teams> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Data.teams> teams) {
        this.teams = teams;
    }

    public class teams {
        @SerializedName("name")
        private String name;
        @SerializedName("crestUrl")
        private String crestUrl;

        public teams(String name, String crestUrl) {
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

}
