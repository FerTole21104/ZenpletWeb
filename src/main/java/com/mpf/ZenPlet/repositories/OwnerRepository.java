package com.mpf.ZenPlet.repositories;

import java.util.List;

import com.mpf.ZenPlet.models.Owner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional 
public interface OwnerRepository extends JpaRepository<Owner, Long> {

    @Query(value = "SELECT o from Owner o where o.ownerName like %:name%")
    public List<Owner> findByName(@Param("name") String name);

    @Query(value = "SELECT o from Owner o where o.ownerEmail like %:email%")
    public Owner findByEmail(@Param("email") String email);

    @Query(value = "SELECT o from Owner o where (o.ownerName= :login or o.ownerEmail= :login) and o.ownerPassword= :password")
    public Owner loginOwner(@Param("login") String login, @Param("password") String password);

}
