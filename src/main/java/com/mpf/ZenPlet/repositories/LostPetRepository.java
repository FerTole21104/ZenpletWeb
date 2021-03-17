package com.mpf.ZenPlet.repositories;

import com.mpf.ZenPlet.models.LostPet;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LostPetRepository extends JpaRepository<LostPet, Long> {

}
