package com.example.footballapi.BL;

import com.example.footballapi.L1.L1TeamModel;
import com.google.gson.annotations.SerializedName;

public class BLChartInfoModel {

    @SerializedName("position")
    private String position;

    @SerializedName("won")
    private String won;

    @SerializedName("draw")
    private String draw;

    @SerializedName("lost")
    private String lost;

    @SerializedName("points")
    private String points;

    @SerializedName("team")
    private BLTeamModel team;


    public BLChartInfoModel(String position, String won, String draw, String lost, String points, BLTeamModel team) {
        this.position = position;
        this.won = won;
        this.draw = draw;
        this.lost = lost;
        this.points = points;
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWon() {
        return won;
    }

    public void setWon(String won) {
        this.won = won;
    }

    public String getDraw() {
        return draw;
    }

    public void setDraw(String draw) {
        this.draw = draw;
    }

    public String getLost() {
        return lost;
    }

    public void setLost(String lost) {
        this.lost = lost;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public BLTeamModel getTeam() {
        return team;
    }

    public void setTeam(BLTeamModel team) {
        this.team = team;
    }
}
