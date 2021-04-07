package com.mpf.ZenPlet.repositories;

import javax.transaction.Transactional;

import com.mpf.ZenPlet.models.PetsFound;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PetsFoundRepository extends JpaRepository<PetsFound, Void> {

    @Query(value = "SELECT pf.petsFoundCounter from PetsFound pf")
    public long getCounter();

    @Transactional
    @Modifying
    @Query(value = "UPDATE PetsFound pf set pf.petsFoundCounter = pf.petsFoundCounter + 1")
    public void counterIncrement();

    @Transactional
    @Modifying
    @Query(value = "UPDATE PetsFound pf set pf.petsFoundCounter = pf.petsFoundCounter - 1")
    public void counterDecrement();

}
