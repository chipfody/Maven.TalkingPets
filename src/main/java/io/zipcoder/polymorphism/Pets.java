package io.zipcoder.polymorphism;

public class Pets {

    private String nameOfPet;

    public Pets(String petName ) {
        this.nameOfPet = petName;
    }

    public String getNameOfPet() {
        return nameOfPet;
    }

    public void setNameOfPet(String nameOfPet) {
        this.nameOfPet = nameOfPet;
    }


    public String speak() {
        return "Hello";
    }

}
