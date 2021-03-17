package com.mpf.ZenPlet.repositories;

import com.mpf.ZenPlet.models.Vaccines;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineRepository extends JpaRepository<Vaccines, Long> {

}
