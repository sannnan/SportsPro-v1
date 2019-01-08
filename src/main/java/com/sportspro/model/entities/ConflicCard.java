package com.sportspro.model.entities;

public class ConflicCard {
    private String conflictDetails;
    private boolean status;
    private int cardId;

    public String getConflictDetails() {
        return conflictDetails;
    }

    public void setConflictDetails(String conflictDetails) {
        this.conflictDetails = conflictDetails;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }
}
