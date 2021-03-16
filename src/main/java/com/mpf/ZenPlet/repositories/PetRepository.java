package com.mpf.ZenPlet.repositories;

import com.mpf.ZenPlet.models.Pet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
}
