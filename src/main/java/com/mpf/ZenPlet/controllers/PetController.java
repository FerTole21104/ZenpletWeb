package com.mpf.ZenPlet.controllers;

import java.util.List;

import com.mpf.ZenPlet.models.Pet;
import com.mpf.ZenPlet.repositories.PetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PetController {

    @Autowired
    private PetRepository petRepository;

    @GetMapping("/pets")
    public List<Pet> getPets() {
        return petRepository.findAll();
    }

    @PostMapping("/save-pet")
    @ResponseBody
    public Pet savePet(@RequestBody Pet pet) {
        return petRepository.save(pet);
    }

}
