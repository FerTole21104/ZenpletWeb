package com.mpf.ZenPlet.controllers;

import java.util.List;

import com.mpf.ZenPlet.models.PetVaccines;

import com.mpf.ZenPlet.repositories.PetVaccinesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PetVaccinesController {
    @Autowired
    private PetVaccinesRepository petVaccinesRepository;

    @GetMapping("/pet-vaccines")
    public List<PetVaccines> getPetVaccines() {
        return petVaccinesRepository.findAll();
    }

    @PostMapping("/save-pet-vacines")
    @ResponseBody
    public PetVaccines savePetVaccines(@RequestBody PetVaccines petVaccines) {
        return petVaccinesRepository.save(petVaccines);
    }

}
