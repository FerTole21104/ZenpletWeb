package com.mpf.ZenPlet.repositories;

import com.mpf.ZenPlet.models.PetVaccines;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PetVaccinesRepository extends JpaRepository<PetVaccines, Long> {
    /*
     * @Query(value = "SELECT o from Owner o where o.ownerName like %:name%") public
     * List<Owner> findByName(@Param("name") String name);
     */

}
