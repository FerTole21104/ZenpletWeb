package com.mpf.ZenPlet.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Owner")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ownerId;

    @Column(name = "owner_name", nullable = false, unique = true)
    private String ownerName;

    @Column(name = "owner_email", nullable = false, unique = true)
    private String ownerEmail;

    @Column(name = "owner_password", nullable = false)
    private String ownerPassword;

    @Column(name = "owner_phone_number", nullable = true, unique = true)
    private String ownerPhoneNumber;

    @OneToMany(targetEntity = Pet.class, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "pet_owner_owner_id", updatable = false, insertable = false)
    private Set<Pet> ownerPets;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.REMOVE)
    private Set<LostPet> ownerLostPets;

    @Column(name = "owner_token", nullable = true)
    private String token;

    public Owner() {
    }

    public Owner(long ownerId, String ownerName, String ownerEmail, String ownerPassword, String ownerPhoneNumber,
            Set<Pet> ownerPets, String token) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.ownerPassword = ownerPassword;
        this.ownerPhoneNumber = ownerPhoneNumber;
        this.ownerPets = ownerPets;
        this.token = token;
    }

    public Owner(long ownerId, String ownerName, String ownerEmail, String ownerPassword, String ownerPhoneNumber,
            Set<Pet> ownerPets, Set<LostPet> ownerLostPets, String token) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.ownerPassword = ownerPassword;
        this.ownerPhoneNumber = ownerPhoneNumber;
        this.ownerPets = ownerPets;
        this.ownerLostPets = ownerLostPets;
        this.token = token;
    }

    public Owner(long ownerId, String ownerName, String ownerEmail, String ownerPassword, String ownerPhoneNumber) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.ownerPassword = ownerPassword;
        this.ownerPhoneNumber = ownerPhoneNumber;
    }

    public Owner(String ownerName, String ownerPassword, String token) {
        this.ownerName = ownerName;
        this.ownerPassword = ownerPassword;
        this.token = token;
    }

    public Owner(String ownerName, String ownerPassword) {
        this.ownerName = ownerName;
        this.ownerPassword = ownerPassword;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Set<Pet> getOwnerPets() {
        return ownerPets;
    }

    public void setOwnerPets(Set<Pet> ownerPets) {
        this.ownerPets = ownerPets;
    }

}
