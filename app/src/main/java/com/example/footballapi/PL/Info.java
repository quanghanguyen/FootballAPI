package com.example.footballapi.PL;

import com.google.gson.annotations.SerializedName;

public class Info {

    @SerializedName("position")
    private int position;

    @SerializedName("won")
    private int won;

    @SerializedName("lost")
    private int lost;

    @SerializedName("points")
    private int points;

    @SerializedName("draw")
    private int draw;

    @SerializedName("team")
    private Team team;

    public Info(int position, int won, int lost, int points, int draw, Team team) {
        this.position = position;
        this.won = won;
        this.lost = lost;
        this.points = points;
        this.draw = draw;
        this.team = team;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Info{" +
                "position=" + position +
                ", won=" + won +
                ", lost=" + lost +
                ", points=" + points +
                ", draw=" + draw +
                ", team=" + team +
                '}';
    }
}



