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
    public PetVaccines() {}
    
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

  
}
