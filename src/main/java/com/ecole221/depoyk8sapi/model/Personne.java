package com.ecole221.depoyk8sapi.model;

public class Personne {
    private long id;
    private long age;
    private String name;

    public Personne() {
    }

    public Personne(long id, long age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
