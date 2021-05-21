package com.qa.classTask;

public class Animal {
    private String species;
    private String origin;
    public Animal() {
        this("Unknown", "Unknown");
    }
    public Animal(String species, String origin) {
        this.species = species;
        this.origin = origin;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
