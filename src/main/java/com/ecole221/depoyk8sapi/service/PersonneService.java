package com.ecole221.depoyk8sapi.service;

import com.ecole221.depoyk8sapi.model.Personne;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PersonneService {

    public List<Personne> allPersons(){
        return Arrays.asList(
                new Personne(1, 24, "Baye Sall"),
                new Personne(2, 32, "Amadou Sarr"),
                new Personne(3, 28, "Ousmane Niass"),
                new Personne(4, 54, "Mouhamed Niass"),
                new Personne(5, 36, "Souleymane Diop")
        );
    }
}
