package com.mpf.ZenPlet.controllers;

import java.util.List;

import com.mpf.ZenPlet.models.Pet;
import com.mpf.ZenPlet.repositories.PetRepository;

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

    @RequestMapping(value = "/pet/id/{id}", method = RequestMethod.GET)
    public Pet getPetById(@PathVariable("id") long id) {
        return petRepository.findById(id).orElse(new Pet());
    }

    @RequestMapping(value = "/pet/name/{name}", method = RequestMethod.GET)
    public List<Pet> getPetByName(@PathVariable("name") String name) {
        return petRepository.findByName(name);
    }

    @RequestMapping(value = "/edit-pet/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Pet updatePet(@PathVariable("id") long id, @RequestBody Pet pet) {
        pet.setPetId(id);
        return petRepository.save(pet);
    }

    @RequestMapping(value = "/delete-pet/{id}", method = RequestMethod.DELETE)
    public void deletePet(@PathVariable("id") long id) {
        Pet pet = petRepository.findById(id).get();
        if (pet != null) {
            petRepository.delete(pet);
        }
    }

}
