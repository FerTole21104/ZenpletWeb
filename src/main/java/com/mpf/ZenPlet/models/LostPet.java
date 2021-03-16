package com.mpf.ZenPlet.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Lost_Pet")
public class LostPet {

    @EmbeddedId
    // private LostPetId id = new LostPetId();

    @ManyToOne
    @MapsId("petId")
    private Pet pet;

    @ManyToOne
    @MapsId("ownerId")
    private Owner owner;

    @Column(name = "lost_pet_additional_info", nullable = false)
    private String lostPetAdditionalInfo;

    /**
     * 
     */
    public LostPet() {
    }

    /**
     * @return String return the lostPetAdditionalInfo
     */
    public String getLostPetAdditionalInfo() {
        return lostPetAdditionalInfo;
    }

    /**
     * @param lostPetAdditionalInfo the lostPetAdditionalInfo to set
     */
    public void setLostPetAdditionalInfo(String lostPetAdditionalInfo) {
        this.lostPetAdditionalInfo = lostPetAdditionalInfo;
    }

}
