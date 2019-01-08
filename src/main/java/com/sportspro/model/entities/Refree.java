package com.sportspro.model.entities;

public class Refree {
    private int refereeID;
    private int matchesCount;
    private double rating;
    private int followers;
    private int matchID;

    public int getRefereeID() {
        return refereeID;
    }

    public void setRefereeID(int refereeID) {
        this.refereeID = refereeID;
    }

    public int getMatchesCount() {
        return matchesCount;
    }

    public void setMatchesCount(int matchesCount) {
        this.matchesCount = matchesCount;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getMatchID() {
        return matchID;
    }

    public void setMatchID(int matchID) {
        this.matchID = matchID;
    }
}
