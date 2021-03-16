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
@Table(name = "Pet_Vaccine")
public class PetVaccines {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long petVaccineId;

    @Column(name = "pet_vaccine_date", nullable = false)
    private String petVaccineDate;

    @Column(name = "pet_vaccine_next", nullable = false)
    private String petVaccineNext;

    @Column(name = "pet_vaccine_created_at", nullable = false)
    private String pet_vaccine_created_at;
    @Column(name = "pet_vaccine_updated_at", nullable = false)
    private String petVaccineUpdatedAt;

    @JsonBackReference
    @JoinColumn(name = "Pet")
    @ManyToMany(fetch = FetchType.LAZY)
    private Pet pet;

    @JsonBackReference
    @JoinColumn(name = "Vaccine")
    @ManyToMany(fetch = FetchType.LAZY)
    private  Vaccines vaccines;

    /**
     * 
     */
    public PetVaccines() {
    
    /**
     * @return long return the petVaccineId
     */
    public long getPetVaccineId() {
        return petVaccineId;
    }

    /**
     * @param petVaccineId the petVaccineId to set
     */
    public void setPetVaccineId(long petVaccineId) {
        this.petVaccineId = petVaccineId;
    }

    /**
     * @return String return the petVaccineDate
     */
    public String getPetVaccineDate() {
        return petVaccineDate;
    }

    /**
     * @param petVaccineDate the petVaccineDate to set
     */
    public void setPetVaccineDate(String petVaccineDate) {
        this.petVaccineDate = petVaccineDate;
    }

    /**
     * @return String return the petVaccineNext
     */
    public String getPetVaccineNext() {
        return petVaccineNext;
    }

    /**
     * @param petVaccineNext the petVaccineNext to set
     */
    public void setPetVaccineNext(String petVaccineNext) {
        this.petVaccineNext = petVaccineNext;
    }

    /**
     * @return String return the pet_vaccine_created_at
     */
    public String getPet_vaccine_created_at() {
        return pet_vaccine_created_at;
    }

    /**
     * @param pet_vaccine_created_at the pet_vaccine_created_at to set
     */
    public void setPet_vaccine_created_at(String pet_vaccine_created_at) {
        this.pet_vaccine_created_at = pet_vaccine_created_at;
    }

    /**
     * @return String return the petVaccineUpdatedAt
     */
    public String getPetVaccineUpdatedAt() {
        return petVaccineUpdatedAt;
    }

    /**
     * @param petVaccineUpdatedAt the petVaccineUpdatedAt to set
     */
    public void setPetVaccineUpdatedAt(String petVaccineUpdatedAt) {
        this.petVaccineUpdatedAt = petVaccineUpdatedAt;
    }

    /**
     * @param petVaccineId
     * @param petVaccineDate
     * @param petVaccineNext
     * @param pet_vaccine_created_at
     * @param petVaccineUpdatedAt
     */
    public PetVaccines(long petVaccineId, String petVaccineDate, String petVaccineNext, String pet_vaccine_created_at,
            String petVaccineUpdatedAt) {
        this.petVaccineId = petVaccineId;
        this.petVaccineDate = petVaccineDate;
        this.petVaccineNext = petVaccineNext;
        this.pet_vaccine_created_at = pet_vaccine_created_at;
        this.petVaccineUpdatedAt = petVaccineUpdatedAt;
    }

}
