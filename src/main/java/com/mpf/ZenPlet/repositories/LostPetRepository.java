package com.mpf.ZenPlet.repositories;

import com.mpf.ZenPlet.models.LostPet;
import com.mpf.ZenPlet.models.Pet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LostPetRepository extends JpaRepository<LostPet, Long> {
    @Query(value = "SELECT lp from LostPet lp where lp.id.petId = :petId")
    public LostPet findLostPetByPetId(@Param("petId") long petId);

    @Query(value = "UPDATE LostPet lp set lp.lostPetAdditionalInfo = :additionalInfo where lp.id.petId = :petId ")
    public LostPet editAdditionalInfo(@Param("petId") long petId, @Param("additionalInfo") String additionalInfo);
}
