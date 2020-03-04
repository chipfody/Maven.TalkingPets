package io.zipcoder.polymorphism;

public class Penguin extends Pets {


    public Penguin(String petName) {
        super(petName);
    }

    @Override
    public String speak() {
        return "Sqwawk";
    }
}
