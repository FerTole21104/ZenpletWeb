package com.mpf.ZenPlet.repositories;

import com.mpf.ZenPlet.models.PetOwner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetOwnerRepository extends JpaRepository<PetOwner, Long> {

}
