package com.ecole221.depoyk8sapi.model;

public class Personne {
    private long id;
    private long age;
    private String nom;

    public Personne() {
    }

    public Personne(long id, long age, String nom) {
        this.id = id;
        this.age = age;
        this.nom = nom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
