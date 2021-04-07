package com.mpf.ZenPlet.controllers;

import com.mpf.ZenPlet.repositories.PetsFoundRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PetsFoundController {
    @Autowired
    private PetsFoundRepository petsFoundRepository;

    @GetMapping("/pets-found")
    public long getPetsFound() {
        return petsFoundRepository.getCounter();
    }

    @PutMapping("/add-pet-found")
    public long addPetFound() {
        petsFoundRepository.counterIncrement();
        return getPetsFound();
    }

    @PutMapping("/sub-pet-found")
    public long subPetFound() {
        petsFoundRepository.counterDecrement();
        return getPetsFound();
    }

}
