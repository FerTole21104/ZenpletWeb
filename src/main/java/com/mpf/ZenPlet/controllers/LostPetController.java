package com.mpf.ZenPlet.controllers;

import java.util.List;
import java.util.Optional;

import com.mpf.ZenPlet.models.LostPet;
import com.mpf.ZenPlet.repositories.LostPetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)*/
@RestController
@RequestMapping("/api")
public class LostPetController {
    @Autowired
    private LostPetRepository lostPetRepository;

    @GetMapping("/lost-pet")
    public List<LostPet> getLostPets() {
        return lostPetRepository.findAll();
    }

    /*
     * @RequestMapping(value = "/lost-pet/{id}", method = RequestMethod.GET) public
     * Optional<Entidad> getEntidadById(@PathVariable("id") long id){ return
     * lostPetRepository.findById(id);
     * 
     * }
     * 
     * @RequestMapping(value = "/lost-pet/{name}", method = RequestMethod.GET)
     * public List<Entidad> getEntidadByName(@PathVariable("name") String name){
     * return lostPetRepository.findByName(name);
     * 
     * }
     */

    @PostMapping("/save-lost-pet")
    @ResponseBody
    public LostPet saveLostPet(@RequestBody LostPet lostPet) {
        return lostPetRepository.save(lostPet);
    }

    @RequestMapping(value = "/edit-lost-pet/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public LostPet updateLostPet(@PathVariable("id") long id, @RequestBody LostPet lostPet) {
        return lostPetRepository.save(lostPet);
    }

    @RequestMapping(value = "/delete-lost-pet/{id}", method = RequestMethod.DELETE)
    public void deleteLostPet(@PathVariable("id") long id) {
        LostPet lostPet = lostPetRepository.findById(id).get();
        if (lostPet != null) {
            lostPetRepository.delete(lostPet);
        }
    }

}
