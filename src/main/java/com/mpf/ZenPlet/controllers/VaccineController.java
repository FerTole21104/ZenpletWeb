package com.mpf.ZenPlet.controllers;

import java.util.List;

import com.mpf.ZenPlet.models.Vaccines;
import com.mpf.ZenPlet.repositories.VaccineRepository;

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

@CrossOrigin
@RestController
@RequestMapping("/api")
public class VaccineController {

    @Autowired
    private VaccineRepository vaccineRepository;

    @GetMapping("/vaccines")
    public List<Vaccines> getVaccines() {
        return vaccineRepository.findAll();
    }

    @PostMapping("/save-vaccine")
    @ResponseBody
    public Vaccines saveVaccines(@RequestBody Vaccines vaccines) {
        return vaccineRepository.save(vaccines);
    }

    @RequestMapping(value = "/vaccine/id/{id}", method = RequestMethod.GET)
    public Vaccines getVaccinesById(@PathVariable("id") long id) {
        return vaccineRepository.findById(id).orElse(new Vaccines());
    }

    /*
     * @RequestMapping(value = "/vaccine/name/{name}", method = RequestMethod.GET)
     * public List<Vaccines> getVaccinesByName(@PathVariable("name") String name) {
     * return vaccineRepository.findByName(name); }
     */

    @RequestMapping(value = "/edit-vaccine/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Vaccines updateVaccines(@PathVariable("id") long id, @RequestBody Vaccines vaccines) {
        vaccines.setVaccinesId(id);
        return vaccineRepository.save(vaccines);
    }

    @RequestMapping(value = "/delete-vaccine/{id}", method = RequestMethod.DELETE)
    public void deleteVaccines(@PathVariable("id") long id) {
        Vaccines vaccines = vaccineRepository.findById(id).get();
        if (vaccines != null) {
            vaccineRepository.delete(vaccines);
        }
    }

}
