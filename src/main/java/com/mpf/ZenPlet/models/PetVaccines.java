package com.mpf.ZenPlet.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Pet_Vaccine")
public class PetVaccines {

    @EmbeddedId
    private PetVaccinesId id = new PetVaccinesId();

    @ManyToOne
    @MapsId("petId")
    @JoinColumn(name = "pet_id")
    @JsonBackReference
    private Pet pet;

    @ManyToOne
    @MapsId("vaccineId")
    @JoinColumn(name = "vaccine_id")
    private Vaccines vaccine;

    @Column(name = "pet_vaccine_date", nullable = false)
    private String petVaccineDate;

    @Column(name = "pet_vaccine_next", nullable = false)
    private String petVaccineNext;

    public PetVaccines() {
    }

    public PetVaccines(PetVaccinesId id, Pet pet, Vaccines vaccine, String petVaccineDate, String petVaccineNext) {
        this.id = id;
        this.pet = pet;
        this.vaccine = vaccine;
        this.petVaccineDate = petVaccineDate;
        this.petVaccineNext = petVaccineNext;
    }

    public PetVaccinesId getId() {
        return id;
    }

    public void setId(PetVaccinesId id) {
        this.id = id;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Vaccines getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccines vaccine) {
        this.vaccine = vaccine;
    }

    public String getPetVaccineDate() {
        return petVaccineDate;
    }

    public void setPetVaccineDate(String petVaccineDate) {
        this.petVaccineDate = petVaccineDate;
    }

    public String getPetVaccineNext() {
        return petVaccineNext;
    }

    public void setPetVaccineNext(String petVaccineNext) {
        this.petVaccineNext = petVaccineNext;
    }

}
