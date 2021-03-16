package com.mpf.ZenPlet.controllers;

import java.util.List;

import com.mpf.ZenPlet.models.PetOwner;
import com.mpf.ZenPlet.repositories.PetOwnerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PetOwnerController {

    @Autowired
    private PetOwnerRepository petOwnerRepository;

    @GetMapping("/petowner")
    public List<PetOwner> getPetOwners() {
        return petOwnerRepository.findAll();
    }

    @PostMapping("/save-petowner")
    @ResponseBody
    public PetOwner savePetOwners(@RequestBody PetOwner petOwner) {
        return petOwnerRepository.save(petOwner);
    }

}
