package com.mpf.ZenPlet.models;

public class Owner {

    private long ownerId;
    private String ownerName;
    private String ownerEmail;
    private String ownerPassword;
    private String ownerPhoneNumber;

    public Owner() {
    }

    public Owner(long ownerId, String ownerName, String ownerEmail, String ownerPassword, String ownerPhoneNumber) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.ownerPassword = ownerPassword;
        this.ownerPhoneNumber = ownerPhoneNumber;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerPassword() {
        return ownerPassword;
    }

    public void setOwnerPassword(String ownerPassword) {
        this.ownerPassword = ownerPassword;
    }

    public String getOwnerPhoneNumber() {
        return ownerPhoneNumber;
    }

    public void setOwnerPhoneNumber(String ownerPhoneNumber) {
        this.ownerPhoneNumber = ownerPhoneNumber;
    }

}
