package com.sportspro.model;

public class User {
    private String name;
    private int age;
    private long nic;
    private String gender;
    private String picturePath;
    private String location;
    private int playerId;
    private String refereeID;
    private String adminID;
    private String sponsorID;
    private String sponsor_match_matchID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getNic() {
        return nic;
    }

    public void setNic(long nic) {
        this.nic = nic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getRefereeID() {
        return refereeID;
    }

    public void setRefereeID(String refereeID) {
        this.refereeID = refereeID;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getSponsorID() {
        return sponsorID;
    }

    public void setSponsorID(String sponsorID) {
        this.sponsorID = sponsorID;
    }

    public String getSponsor_match_matchID() {
        return sponsor_match_matchID;
    }

    public void setSponsor_match_matchID(String sponsor_match_matchID) {
        this.sponsor_match_matchID = sponsor_match_matchID;
    }
}
