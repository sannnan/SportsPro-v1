package com.sportspro.model.entities;

public class Ground {
    private int groundID;
    private String groundType;
    private double dimensions;
    private double capacity;
    private boolean availability;

    public int getGroundID() {
        return groundID;
    }

    public void setGroundID(int groundID) {
        this.groundID = groundID;
    }

    public String getGroundType() {
        return groundType;
    }

    public void setGroundType(String groundType) {
        this.groundType = groundType;
    }

    public double getDimensions() {
        return dimensions;
    }

    public void setDimensions(double dimensions) {
        this.dimensions = dimensions;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
