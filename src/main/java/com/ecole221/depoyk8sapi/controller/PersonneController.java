package com.ecole221.depoyk8sapi.controller;

import com.ecole221.depoyk8sapi.model.Personne;
import com.ecole221.depoyk8sapi.service.PersonneService;
import org.apache.logging.log4j.Level;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonneController {

    private final PersonneService personneService;

    public PersonneController(PersonneService personneService) {
        this.personneService = personneService;
    }

    @GetMapping("/personnes")
    public @ResponseBody ResponseEntity findAll(){
        List<Personne> persons = personneService.allPersons();
        return new ResponseEntity(persons, HttpStatus.OK);
    }
}
