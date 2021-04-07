package com.mpf.ZenPlet.listeners;

import javax.persistence.PostUpdate;

import com.mpf.ZenPlet.models.Pet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AuditPetListener {
    private static Log log = LogFactory.getLog(AuditPetListener.class);

    @PostUpdate
    public void petUpdated(Pet pet) {
        log.info("Pet Updated " + pet.getPetId() + " - " + pet.getPetStatus());
        // beetter to make a pre veiging whit fields are updating
        // if (pet.getPetStatus() === -1) {
        // pet lost so nothing
        // } else if (pet.getPetStatus() === 1) {
        // pet found so increment
        // }
    }
}
