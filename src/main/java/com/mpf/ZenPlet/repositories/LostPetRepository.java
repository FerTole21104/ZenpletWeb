package com.mpf.ZenPlet.repositories;

import java.util.List;

import com.mpf.ZenPlet.models.LostPet;

import org.springframework.data.jpa.repository.JpaRepository;
/*import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;*/

public interface LostPetRepository extends JpaRepository<LostPet, Long> {
    /*
     * @Query(value =
     * "SELECT lp from Lost_Pet lp where lp.entidadName like %:name%") public
     * List<LostPet> findByName(@Param("name")String name);
     */
}
