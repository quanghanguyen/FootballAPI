package com.example.footballapi;

public class Matches {

    private float id;
    private Season season;
    private String utcDate;
    private String status;
    private float matchday;
    private String state;
    private String group;
    private String lastUpdated;
    private Odds odds;
    private Score score;
    private HomeTeam homeTeam;
    private AwayTeam awayTeam;
    private Referees referees;

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public String getUtcDate() {
        return utcDate;
    }

    public void setUtcDate(String utcDate) {
        this.utcDate = utcDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getMatchday() {
        return matchday;
    }

    public void setMatchday(float matchday) {
        this.matchday = matchday;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Odds getOdds() {
        return odds;
    }

    public void setOdds(Odds odds) {
        this.odds = odds;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public HomeTeam getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(HomeTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public AwayTeam getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(AwayTeam awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Referees getReferees() {
        return referees;
    }

    public void setReferees(Referees referees) {
        this.referees = referees;
    }
}
