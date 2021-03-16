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
    private long lost_pet_id;

    @Column(name = "lost_pet_additional_info", nullable = false)
    private String lostPet_additional_info;

    @Column(name = "lost_pet_created_at", nullable = false)
    private String lost_pet_created_at;

    @Column(name = "lost_pet_updated_at", nullable = false)
    private String lost_pet_updated_at;
    	
    @JsonBackReference
    @JoinColumn(name = "Pet")
    @ManyToMany(fetch = FetchType.LAZY)
    private Pet pet;

    @JsonBackReference
    @JoinColumn(name = "Owner")
    @ManyToMany(fetch = FetchType.LAZY)
    private Owner owner;    



    

    /**
     * @return long return the lost_pet_id
     */
    public long getLost_pet_id() {
        return lost_pet_id;
    }

    /**
     * @param lost_pet_id the lost_pet_id to set
     */
    public void setLost_pet_id(long lost_pet_id) {
        this.lost_pet_id = lost_pet_id;
    }

    /**
     * @return String return the lostPet_additional_info
     */
    public String getLostPet_additional_info() {
        return lostPet_additional_info;
    }

    /**
     * @param lostPet_additional_info the lostPet_additional_info to set
     */
    public void setLostPet_additional_info(String lostPet_additional_info) {
        this.lostPet_additional_info = lostPet_additional_info;
    }

    /**
     * @return String return the lost_pet_created_at
     */
    public String getLost_pet_created_at() {
        return lost_pet_created_at;
    }

    /**
     * @param lost_pet_created_at the lost_pet_created_at to set
     */
    public void setLost_pet_created_at(String lost_pet_created_at) {
        this.lost_pet_created_at = lost_pet_created_at;
    }

    /**
     * @return String return the lost_pet_updated_at
     */
    public String getLost_pet_updated_at() {
        return lost_pet_updated_at;
    }

    /**
     * @param lost_pet_updated_at the lost_pet_updated_at to set
     */
    public void setLost_pet_updated_at(String lost_pet_updated_at) {
        this.lost_pet_updated_at = lost_pet_updated_at;
    }

    /**
     * @return Pet return the pet
     */
    public Pet getPet() {
        return pet;
    }

    /**
     * @param pet the pet to set
     */
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    /**
     * @return Owner return the owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * 
     */
    public LostPet() {
    }

    /**
     * @param lost_pet_id
     * @param lostPet_additional_info
     * @param lost_pet_created_at
     * @param lost_pet_updated_at
     * @param pet
     * @param owner
     */
    public LostPet(long lost_pet_id, String lostPet_additional_info, String lost_pet_created_at,
            String lost_pet_updated_at, Pet pet, Owner owner) {
        this.lost_pet_id = lost_pet_id;
        this.lostPet_additional_info = lostPet_additional_info;
        this.lost_pet_created_at = lost_pet_created_at;
        this.lost_pet_updated_at = lost_pet_updated_at;
        this.pet = pet;
        this.owner = owner;
    }

}
