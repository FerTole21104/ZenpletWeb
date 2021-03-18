package com.mpf.ZenPlet.repositories;

import java.util.List;

import com.mpf.ZenPlet.models.Vaccines;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineRepository extends JpaRepository<Vaccines, Long> {

    /*
     * @Query(value = "SELECT v from Vaccine v where v.vaccinesName like %:name%")
     * public List<Vaccines> findByName(@Param("name") String name);
     */

}
