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

    @Column(name = "lost_pet_created_at", nullable = false)
    private String lostPetCreatedAt;

    @Column(name = "lost_pet_updated_at", nullable = false)
    private String lostPetUpdatedAt;
    	
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

    /**
     * @return String return the lostPetCreatedAt
     */
    public String getLostPetCreatedAt() {
        return lostPetCreatedAt;
    }

    /**
     * @param lostPetCreatedAt the lostPetCreatedAt to set
     */
    public void setLostPetCreatedAt(String lostPetCreatedAt) {
        this.lostPetCreatedAt = lostPetCreatedAt;
    }

    /**
     * @return String return the lostPetUpdatedAt
     */
    public String getLostPetUpdatedAt() {
        return lostPetUpdatedAt;
    }

    /**
     * @param lostPetUpdatedAt the lostPetUpdatedAt to set
     */
    public void setLostPetUpdatedAt(String lostPetUpdatedAt) {
        this.lostPetUpdatedAt = lostPetUpdatedAt;
    }

    /**
     * @param lostPetId
     * @param lostPetAdditionalInfo
     * @param lostPetCreatedAt
     * @param lostPetUpdatedAt
   
     */
    public LostPet(long lostPetId, String lostPetAdditionalInfo, String lostPetCreatedAt, String lostPetUpdatedAt) {
        this.lostPetId = lostPetId;
        this.lostPetAdditionalInfo = lostPetAdditionalInfo;
        this.lostPetCreatedAt = lostPetCreatedAt;
        this.lostPetUpdatedAt = lostPetUpdatedAt;
     
    }

}
