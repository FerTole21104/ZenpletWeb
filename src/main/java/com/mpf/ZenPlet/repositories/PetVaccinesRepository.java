package com.mpf.ZenPlet.repositories;

import com.mpf.ZenPlet.models.PetVaccines;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PetVaccinesRepository extends JpaRepository<PetVaccines, Long> {
    
}
