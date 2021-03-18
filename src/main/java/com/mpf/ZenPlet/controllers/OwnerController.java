package com.mpf.ZenPlet.controllers;

import java.util.List;

import com.mpf.ZenPlet.models.Owner;
import com.mpf.ZenPlet.repositories.OwnerRepository;

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
public class OwnerController {

    @Autowired
    private OwnerRepository ownerRepository;

    @GetMapping("/owners")
    public List<Owner> getOwners() {
        return ownerRepository.findAll();
    }

    @PostMapping("/save-owner")
    @ResponseBody
    public Owner saveOwner(@RequestBody Owner owner) {
        return ownerRepository.save(owner);
    }

    @RequestMapping(value = "/owner/id/{id}", method = RequestMethod.GET)
    public Owner getOwnerById(@PathVariable("id") long id) {
        return ownerRepository.findById(id).orElse(new Owner());
    }

    @RequestMapping(value = "/owner/name/{name}", method = RequestMethod.GET)
    public List<Owner> getOwnerByName(@PathVariable("name") String name) {
        return ownerRepository.findByName(name);
    }

    @RequestMapping(value = "/edit-owner/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Owner updateOwner(@PathVariable("id") long id, @RequestBody Owner owner) {
        owner.setOwnerId(id);
        return ownerRepository.save(owner);
    }

    @RequestMapping(value = "/delete-owner/{id}", method = RequestMethod.DELETE)
    public void deleteOwner(@PathVariable("id") long id) {
        Owner owner = ownerRepository.findById(id).get();
        if (owner != null) {
            ownerRepository.delete(owner);
        }
    }

}
