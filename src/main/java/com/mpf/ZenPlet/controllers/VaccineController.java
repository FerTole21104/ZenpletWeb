package com.mpf.ZenPlet.controllers;

import java.util.List;

import com.mpf.ZenPlet.models.Vaccines;
import com.mpf.ZenPlet.repositories.VaccineRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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

}
