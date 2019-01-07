package com.sportspro.model;

public class Admin {
    private int adminID;
    private int groundID;
    private int availability_resourceID;

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public int getGroundID() {
        return groundID;
    }

    public void setGroundID(int groundID) {
        this.groundID = groundID;
    }

    public int getAvailability_resourceID() {
        return availability_resourceID;
    }

    public void setAvailability_resourceID(int availability_resourceID) {
        this.availability_resourceID = availability_resourceID;
    }
}
