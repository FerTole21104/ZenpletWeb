package com.mpf.ZenPlet.controllers;

import java.util.List;

import com.mpf.ZenPlet.models.PetVaccines;
import com.mpf.ZenPlet.models.PetVaccinesId;
import com.mpf.ZenPlet.repositories.PetVaccinesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    /*
     * @RequestMapping(value = "/pet-vaccines/id/{id}", method = RequestMethod.GET)
     * public PetVaccines getPetVaccinesById(@PathVariable("id") long id) { return
     * petVaccinesRepository.findById(id).orElse(new PetVaccines()); }
     * 
     * @RequestMapping(value = "/pet-vaccines/name/{name}", method =
     * RequestMethod.GET) public List<PetVaccines>
     * getPetVaccinesByName(@PathVariable("name") String name) { return
     * petVaccinesRepository.findByName(name); }
     */

    @RequestMapping(value = "/edit-pet-vaccines/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public PetVaccines updatePetVaccines(@PathVariable("id") PetVaccinesId id, @RequestBody PetVaccines petVaccines) {
        petVaccines.setId(id);
        return petVaccinesRepository.save(petVaccines);
    }

    @RequestMapping(value = "/delete-pet-vaccines/{id}", method = RequestMethod.DELETE)
    public void deletePetVaccines(@PathVariable("id") long id) {
        PetVaccines petVaccines = petVaccinesRepository.findById(id).get();
        if (petVaccines != null) {
            petVaccinesRepository.delete(petVaccines);
        }
    }

}
