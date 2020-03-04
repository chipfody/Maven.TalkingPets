package io.zipcoder.polymorphism;

public class Dog extends Pets {


    public Dog(String petName) {
        super(petName);
    }

    @Override
    public String speak(){
        return "Woof";
    }
}
