package com.sportspro.model;

public class Player {
    private int playerID;
    private int matchesCount;
    private double rating;
    private int followers;
    private int teamID;

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
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

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }
}