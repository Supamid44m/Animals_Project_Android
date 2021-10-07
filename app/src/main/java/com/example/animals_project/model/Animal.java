package com.example.animals_project.model;

public class Animal {

    String Animal_name;
    String Animal_name2;
    String Animal_image;
    String Animal_type;
    private String Animal_pop;
    private int Animal_alive;

    public String getAnimal_name() { return Animal_name; }

    public void setAnimal_name(String Animal_name) { this.Animal_name = Animal_name; }

    public String getAnimal_name2() { return Animal_name2; }

    public void setAnimal_name2(String Animal_name2) { this.Animal_name2 = Animal_name2; }

    public String getAnimal_image() { return Animal_image; }

    public void setAnimal_image(String Animal_image) { this.Animal_image = Animal_image; }

    public String getAnimal_type() { return Animal_type; }

    public void setAnimal_type(String Animal_type) { this.Animal_type = Animal_type; }

    public int getAnimal_alive() { return Animal_alive; }

    public void setAnimal_alive(int animal_alive) { Animal_alive = animal_alive; }

    public String getAnimal_pop() {
        return Animal_pop;
    }

    public void setAnimal_pop(String animal_pop) {
        Animal_pop = animal_pop;
    }
}