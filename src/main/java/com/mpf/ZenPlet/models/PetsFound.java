package com.mpf.ZenPlet.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Pets_Found")
public class PetsFound {

    @Column(name = "pets_found_counter", nullable = true)
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
