package com.mpf.ZenPlet.controllers;

import java.util.List;

import com.mpf.ZenPlet.models.LostPet;
import com.mpf.ZenPlet.repositories.LostPetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class LostPetController {
    @Autowired
    private LostPetRepository lostPetRepository;

    @GetMapping("/lost-pet")
    public List<LostPet> getLostPets() {
        return lostPetRepository.findAll();
    }

    @RequestMapping(value = "/lost-pet/pet/{petId}", method = RequestMethod.GET)
    public LostPet getLostPetByPetId(@PathVariable("petId") long petId) {
        return this.lostPetRepository.findLostPetByPetId(petId);
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

    // @RequestMapping(value = "/edit-lost-pet/{petId}", method = RequestMethod.PUT)
    // @ResponseBody
    // public LostPet updateLostPet(@PathVariable("petId") long petId, @RequestBody
    // LostPet lostPet) {
    // return lostPetRepository.editAdditionalInfo(petId,
    // lostPet.getLostPetAdditionalInfo());
    // }

    @RequestMapping(value = "/edit-lost-pet/{petId}", method = RequestMethod.PUT)
    @ResponseBody
    public LostPet updateLostPet(@PathVariable("petId") long petId, @RequestBody LostPet lostPet) {
        LostPet lostPetToEdit = lostPetRepository.findLostPetByPetId(petId);
        lostPetToEdit.setLostPetAdditionalInfo(lostPet.getLostPetAdditionalInfo());
        return lostPetRepository.save(lostPetToEdit);
    }

    @RequestMapping(value = "/delete-lost-pet/{id}", method = RequestMethod.DELETE)
    public void deleteLostPet(@PathVariable("id") long id) {
        LostPet lostPet = lostPetRepository.findById(id).get();
        if (lostPet != null) {
            lostPetRepository.delete(lostPet);
        }
    }

}
