package com.mpf.ZenPlet.controllers;

import java.util.List;

import com.mpf.ZenPlet.models.LostPet;
import com.mpf.ZenPlet.repositories.LostPetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LostPetController {
    @Autowired
    private LostPetRepository lostPetRepository;

    @GetMapping("/lostPet")
    public List<LostPet> getOwners() {
        return lostPetRepository.findAll();
    }

    @PostMapping("/save-lostPet")
    @ResponseBody
    public LostPet saveOwner(@RequestBody LostPet lostPet) {
        return lostPetRepository.save(lostPet);
    } 
}
