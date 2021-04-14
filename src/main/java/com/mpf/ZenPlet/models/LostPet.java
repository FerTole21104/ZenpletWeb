package com.mpf.ZenPlet.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "Lost_Pet")
public class LostPet {
    @EmbeddedId
    private LostPetId id = new LostPetId();

    @ManyToOne
    @MapsId("petId")
    @JoinColumn(name = "pet_id", nullable = false, unique = true)
    private Pet pet;

    @ManyToOne
    @MapsId("ownerId")
    @JoinColumn(name = "owner_id", nullable = false)
    private Owner owner;

    @Column(name = "lost_pet_location", nullable = false)
    private String lostPetLocation;

    @Column(name = "lost_pet_additional_info", nullable = false)
    private String lostPetAdditionalInfo;

    public LostPet() {
    }

    public LostPet(LostPetId id, Pet pet, Owner owner, String lostPetAdditionalInfo, String lostPetLocation) {
        this.id = id;
        this.pet = pet;
        this.owner = owner;
        this.lostPetAdditionalInfo = lostPetAdditionalInfo;
        this.lostPetLocation = lostPetLocation;
    }

    public LostPetId getId() {
        return id;
    }

    public void setId(LostPetId id) {
        this.id = id;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setLostPetAdditionalInfo(String lostPetAdditionalInfo) {
        this.lostPetAdditionalInfo = lostPetAdditionalInfo;
    }

    public String getLostPetAdditionalInfo() {
        return lostPetAdditionalInfo;
    }

    public String getLostPetLocation() {
        return lostPetLocation;
    }

    public void setLostPetLocation(String lostPetLocation) {
        this.lostPetLocation = lostPetLocation;
    }

}
