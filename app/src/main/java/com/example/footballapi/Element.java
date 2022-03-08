package com.example.footballapi;

public class Element {

    private float count;
    private Filters filers;
    private Competition competition;
    private Matches matches;

    public float getCount() {
        return count;
    }

    public void setCount(float count) {
        this.count = count;
    }

    public Filters getFilers() {
        return filers;
    }

    public void setFilers(Filters filers) {
        this.filers = filers;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public Matches getMatches() {
        return matches;
    }

    public void setMatches(Matches matches) {
        this.matches = matches;
    }
}
