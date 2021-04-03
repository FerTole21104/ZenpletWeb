package com.mpf.ZenPlet.repositories;

import com.mpf.ZenPlet.models.LostPet;
import com.mpf.ZenPlet.models.Pet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LostPetRepository extends JpaRepository<LostPet, Long> {
    @Query(value = "SELECT lp.pet from LostPet lp where lp.id.petId = :petId")
    public Pet findPetByPetId(@Param("petId") long petId);
}
