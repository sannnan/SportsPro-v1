package com.sportspro.model;

import java.util.Date;

public class ResousceAvailabilty {
    private Date availableDates;
    private Date availableTimeslots;
    private int resourceId;

    public Date getAvailableDates() {
        return availableDates;
    }

    public void setAvailableDates(Date availableDates) {
        this.availableDates = availableDates;
    }

    public Date getAvailableTimeslots() {
        return availableTimeslots;
    }

    public void setAvailableTimeslots(Date availableTimeslots) {
        this.availableTimeslots = availableTimeslots;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }
}
