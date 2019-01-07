package com.sportspro.model;

public class Team {
    private int teamID;
    private String teamName;
    private int playerCount;
    private int matchesPlayed;
    private double ratings;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public int getTeamID() {

        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }
}
