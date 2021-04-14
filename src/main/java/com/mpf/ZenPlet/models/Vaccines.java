package com.mpf.ZenPlet.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Vaccine")
public class Vaccines {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long vaccinesId;

    @Column(name = "vaccines_name", nullable = false)
    private String vaccinesName;

    @Column(name = "vaccines_description", nullable = false)
    private String vaccinesDescription;

    @JsonBackReference
    @OneToMany(mappedBy = "vaccine", cascade = CascadeType.REMOVE)
    private Set<PetVaccines> petVaccines;

    public Vaccines() {
    }

    public Vaccines(long vaccinesId, String vaccinesName, String vaccinesDescription) {
        this.vaccinesId = vaccinesId;
        this.vaccinesName = vaccinesName;
        this.vaccinesDescription = vaccinesDescription;
    }

    public String getVaccinesName() {
        return vaccinesName;
    }

    public void setVaccinesName(String vaccinesName) {
        this.vaccinesName = vaccinesName;
    }

    public String getVaccinesDescription() {
        return vaccinesDescription;
    }

    public void setVaccinesDescription(String vaccinesDescription) {
        this.vaccinesDescription = vaccinesDescription;
    }

    public long getVaccinesId() {
        return vaccinesId;
    }

    public void setVaccinesId(long vaccinesId) {
        this.vaccinesId = vaccinesId;
    }

    public Set<PetVaccines> getPetVaccines() {
        return petVaccines;
    }

    public void setPetVaccines(Set<PetVaccines> petVaccines) {
        this.petVaccines = petVaccines;
    }

}
