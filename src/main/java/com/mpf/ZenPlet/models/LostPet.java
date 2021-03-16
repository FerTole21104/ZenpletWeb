package com.mpf.ZenPlet.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Lost_Pet")
public class LostPet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long lostPetId;

    @Column(name = "lost_pet_additional_info", nullable = false)
    private String lostPetAdditionalInfo;
    	
    @JsonBackReference
    @JoinColumn(name = "Pet")
    @ManyToMany(fetch = FetchType.LAZY)
    private Pet pet;

    @JsonBackReference
    @JoinColumn(name = "Owner")
    @ManyToMany(fetch = FetchType.LAZY)
    private Owner owner;        


    /**
     * 
     */
    public LostPet() {
    }

 
    /**
     * @return long return the lostPetId
     */
    public long getLostPetId() {
        return lostPetId;
    }

    /**
     * @param lostPetId the lostPetId to set
     */
    public void setLostPetId(long lostPetId) {
        this.lostPetId = lostPetId;
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
