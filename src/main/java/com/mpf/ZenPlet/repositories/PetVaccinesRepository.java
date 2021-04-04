package com.mpf.ZenPlet.repositories;

import com.mpf.ZenPlet.models.PetVaccines;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PetVaccinesRepository extends JpaRepository<PetVaccines, Long> {
    @Query(value = "SELECT pv from PetVaccines pv where pv.id.petId = :petId and pv.id.vaccineId = :vaccineId")
    public PetVaccines findPetVaccineById(@Param("petId") long petId, @Param("vaccineId") long vaccineId);
}
