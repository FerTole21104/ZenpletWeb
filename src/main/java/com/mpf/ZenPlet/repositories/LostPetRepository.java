package com.mpf.ZenPlet.repositories;

import com.mpf.ZenPlet.models.LostPet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LostPetRepository extends JpaRepository<LostPet, Long> {
    @Query(value = "SELECT lp from LostPet lp where lp.id.petId = :petId")
    public LostPet findLostPetByPetId(@Param("petId") long petId);
}
