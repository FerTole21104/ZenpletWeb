package com.mpf.ZenPlet.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PetVaccinesId implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "pet_id")
    private Long petId;

    @Column(name = "vaccine_id")
    private Long vaccineId;

    public PetVaccinesId() {
    }

    public PetVaccinesId(Long petId, Long vaccineId) {
        this.petId = petId;
        this.vaccineId = vaccineId;
    }

    public Long getPetId() {
        return petId;
    }

    public void setPetId(Long petId) {
        this.petId = petId;
    }

    public Long getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(Long vaccineId) {
        this.vaccineId = vaccineId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((petId == null) ? 0 : petId.hashCode());
        result = prime * result + ((vaccineId == null) ? 0 : vaccineId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PetVaccinesId other = (PetVaccinesId) obj;
        return Objects.equals(getPetId(), other.getPetId()) && Objects.equals(getVaccineId(), other.getVaccineId());
    }

}
