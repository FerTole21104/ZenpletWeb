package com.mpf.ZenPlet.repositories;

import com.mpf.ZenPlet.models.Pet;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
