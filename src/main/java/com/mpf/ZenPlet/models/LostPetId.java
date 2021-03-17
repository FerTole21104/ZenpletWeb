package com.mpf.ZenPlet.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class LostPetId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long petId;
    private Long ownerId;

    public LostPetId() {
    }

    public LostPetId(long petId, long ownerId) {
        super();
        this.petId = petId;
        this.ownerId = ownerId;
    }

    public Long getPetId() {
        return petId;
    }

    public void setPetId(Long petId) {
        this.petId = petId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((petId == null) ? 0 : petId.hashCode());
        result = prime * result + ((ownerId == null) ? 0 : ownerId.hashCode());
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
        LostPetId other = (LostPetId) obj;
        return Objects.equals(getPetId(), other.getPetId()) && Objects.equals(getOwnerId(), other.getOwnerId());
    }

}
