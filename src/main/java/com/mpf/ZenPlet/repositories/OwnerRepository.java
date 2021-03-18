package com.mpf.ZenPlet.repositories;

import java.util.List;

import com.mpf.ZenPlet.models.Owner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {

    @Query(value = "SELECT o from Owner o where o.ownerName like %:name%")
    public List<Owner> findByName(@Param("name") String name);

}
