package com.mpf.ZenPlet.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Vaccine")
public class Vaccines {
    // Atributos
    @Id
    @Column(name = "vaccines_id", nullable = false)
    private long vaccinesId;
    @Column(name = "vaccines_name")
    private String vaccinesName;
    @Column(name = "vaccines_description")
    private String vaccinesDescription;

    @OneToMany(mappedBy = "vaccine")
    private Set<PetVaccines> petVaccines;

    // Constructores
    public Vaccines() {
    }

    public Vaccines(long vaccinesId, String vaccinesName, String vaccinesDescription) {
        this.vaccinesId = vaccinesId;
        this.vaccinesName = vaccinesName;
        this.vaccinesDescription = vaccinesDescription;
    }

    // Getters and Setters

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

}
