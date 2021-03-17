package com.mpf.ZenPlet.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
    private Pet pet;

    @ManyToOne
    @MapsId("ownerId")
    private Owner owner;

    @Column(name = "lost_pet_additional_info", nullable = false)
    private String lostPetAdditionalInfo;

    public LostPet() {
    }

    public LostPet(LostPetId id, Pet pet, Owner owner, String lostPetAdditionalInfo) {
        this.id = id;
        this.pet = pet;
        this.owner = owner;
        this.lostPetAdditionalInfo = lostPetAdditionalInfo;
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

}
