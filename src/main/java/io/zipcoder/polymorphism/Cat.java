package io.zipcoder.polymorphism;

public class Cat extends Pets{


    public Cat(String petName) {
        super(petName);
    }

    @Override
    public String speak() {
        return "Meow";
    }
}
