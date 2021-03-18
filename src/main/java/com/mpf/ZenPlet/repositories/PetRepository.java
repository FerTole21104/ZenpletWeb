package com.mpf.ZenPlet.repositories;

import java.util.List;

import com.mpf.ZenPlet.models.Pet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
    @Query(value = "SELECT p from Pet p where p.petName like %:name%")
    public List<Pet> findByName(@Param("name") String name);

}
