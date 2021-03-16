package com.mpf.ZenPlet.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "vaccines")
public class Vaccines {
    // Atributos
    @Id
    @Column(name = "vaccines_id", nullable = false)
    private long vaccinesID;
    @Column(name = "vaccines_name")
    private String vaccinesName;
    @Column(name = "vaccines_description")
    private String vaccinesDescription;

    @JsonBackReference
    @JoinColumn(name = "vaccines_id")
    @ManyToMany(fetch = FetchType.LAZY)
    private PetVaccines petVaccines;

    // Constructores
    public Vaccines() {
    }

    public Vaccines(long vaccinesID, String vaccinesName, String vaccinesDescription) {
        this.vaccinesID = vaccinesID;
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

    public long getVaccinesID() {
        return vaccinesID;
    }

    public void setVaccinesID(long vaccinesID) {
        this.vaccinesID = vaccinesID;
    }

}
