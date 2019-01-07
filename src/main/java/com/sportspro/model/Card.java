package com.sportspro.model;

public class Card {
    private int intcardID;
    private int cardType;
    private int team1_ID ;
    private int team2_ID ;
    private int refereeID ;
    private int matchID ;

    public int getIntcardID() {
        return intcardID;
    }

    public void setIntcardID(int intcardID) {
        this.intcardID = intcardID;
    }

    public int getCardType() {
        return cardType;
    }

    public void setCardType(int cardType) {
        this.cardType = cardType;
    }

    public int getTeam1_ID() {
        return team1_ID;
    }

    public void setTeam1_ID(int team1_ID) {
        this.team1_ID = team1_ID;
    }

    public int getTeam2_ID() {
        return team2_ID;
    }

    public void setTeam2_ID(int team2_ID) {
        this.team2_ID = team2_ID;
    }

    public int getRefereeID() {
        return refereeID;
    }

    public void setRefereeID(int refereeID) {
        this.refereeID = refereeID;
    }

    public int getMatchID() {
        return matchID;
    }

    public void setMatchID(int matchID) {
        this.matchID = matchID;
    }
}
