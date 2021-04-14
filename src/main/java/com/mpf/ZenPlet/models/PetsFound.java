package com.mpf.ZenPlet.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pets_Found")
public class PetsFound {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long petsFoundId;

    @Column(name = "pets_found_counter", nullable = false)
    private long petsFoundCounter;

    public PetsFound() {
    }

    public PetsFound(long petsFoundCounter) {
        this.petsFoundCounter = petsFoundCounter;
    }

    public long getPetsFoundCounter() {
        return petsFoundCounter;
    }

    public void setPetsFoundCounter(long petsFoundCounter) {
        this.petsFoundCounter = petsFoundCounter;
    }

}
