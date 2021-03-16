package com.mpf.ZenPlet.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Pet_Owner")
public class PetOwner {
    // Atributos
    @Id
    @Column(name = "owner_pet_id", nullable = false)
    private long ownerPetId;
    @Column(name = "pet_id")
    private long petId;
    @Column(name = "owner_id")
    private long ownerId;

    @JsonBackReference
    @JoinColumn(name = "owner_id")
    @ManyToMany(fetch = FetchType.LAZY)
    private Owner owner;
    @JsonBackReference
    @JoinColumn(name = "pet_id")
    @ManyToMany(fetch = FetchType.LAZY)
    private Pet pet;

    // Constructor
    public PetOwner() {
    }

    public PetOwner(long ownerPetId, long petId, long ownerId) {
        this.ownerPetId = ownerPetId;
        this.petId = petId;
        this.ownerId = ownerId;
    }

    // Getters And Setters
    public long getOwnerPetId() {
        return ownerPetId;
    }

    public void setOwnerPetId(long ownerPetId) {
        this.ownerPetId = ownerPetId;
    }

    public long getPetId() {
        return petId;
    }

    public void setPetId(long petId) {
        this.petId = petId;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

}
