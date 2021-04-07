package com.mpf.ZenPlet.repositories;

import com.mpf.ZenPlet.models.PetsFound;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PetsFoundRepository extends JpaRepository<PetsFound, Void> {

    @Query(value = "SELECT pf.petsFoundCounter from PetsFound pf")
    public long getCounter();

    @Query(value = "UPDATE PetsFound pf set pf.petsFoundCounter = pf.petsFoundCounter + 1")
    public void counterIncrement();

    @Query(value = "UPDATE PetsFound pf set pf.petsFoundCounter = pf.petsFoundCounter - 1")
    public void counterDecrement();

}
