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
    private long pet_vaccine_id;

    @Column(name = "pet_vaccine_date", nullable = false)
    private String pet_vaccine_date;

    @Column(name = "pet_vaccine_next", nullable = false)
    private String pet_vaccine_next;

    @Column(name = "pet_vaccine_created_at", nullable = false)
    private String pet_vaccine_created_at;
    @Column(name = "pet_vaccine_updated_at", nullable = false)
    private String pet_vaccine_updated_at;

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
    }

    /**
     * @param pet_vaccine_id
     * @param pet_vaccine_date
     * @param pet_vaccine_next
     * @param pet_vaccine_created_at
     * @param pet_vaccine_updated_at
     * @param pet
     * @param vaccines
     */
    public PetVaccines(long pet_vaccine_id, String pet_vaccine_date, String pet_vaccine_next,
            String pet_vaccine_created_at, String pet_vaccine_updated_at, Pet pet, Vaccines vaccines) {
        this.pet_vaccine_id = pet_vaccine_id;
        this.pet_vaccine_date = pet_vaccine_date;
        this.pet_vaccine_next = pet_vaccine_next;
        this.pet_vaccine_created_at = pet_vaccine_created_at;
        this.pet_vaccine_updated_at = pet_vaccine_updated_at;
        this.pet = pet;
        this.vaccines = vaccines;
    }

    /**
     * @return long return the pet_vaccine_id
     */
    public long getPet_vaccine_id() {
        return pet_vaccine_id;got
    }

    /**
     * @param pet_vaccine_id the pet_vaccine_id to set
     */
    public void setPet_vaccine_id(long pet_vaccine_id) {
        this.pet_vaccine_id = pet_vaccine_id;
    }

    /**
     * @return String return the pet_vaccine_date
     */
    public String getPet_vaccine_date() {
        return pet_vaccine_date;
    }

    /**
     * @param pet_vaccine_date the pet_vaccine_date to set
     */
    public void setPet_vaccine_date(String pet_vaccine_date) {
        this.pet_vaccine_date = pet_vaccine_date;
    }

    /**
     * @return String return the pet_vaccine_next
     */
    public String getPet_vaccine_next() {
        return pet_vaccine_next;
    }

    /**
     * @param pet_vaccine_next the pet_vaccine_next to set
     */
    public void setPet_vaccine_next(String pet_vaccine_next) {
        this.pet_vaccine_next = pet_vaccine_next;
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
     * @return String return the pet_vaccine_updated_at
     */
    public String getPet_vaccine_updated_at() {
        return pet_vaccine_updated_at;
    }

    /**
     * @param pet_vaccine_updated_at the pet_vaccine_updated_at to set
     */
    public void setPet_vaccine_updated_at(String pet_vaccine_updated_at) {
        this.pet_vaccine_updated_at = pet_vaccine_updated_at;
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
     * @return Vaccines return the vaccines
     */
    public Vaccines getVaccines() {
        return vaccines;
    }

    /**
     * @param vaccines the vaccines to set
     */
    public void setVaccines(Vaccines vaccines) {
        this.vaccines = vaccines;
    }

}
