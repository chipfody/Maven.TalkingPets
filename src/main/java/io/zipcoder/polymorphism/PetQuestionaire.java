package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;


class PetQuestionnaire {
    private static Scanner userInput;
    private ArrayList<Pets> pets;

    public PetQuestionnaire() {
        userInput = new Scanner(System.in);
        pets = new ArrayList<Pets>();
    }

    public void askQuestions() {
        System.out.println("How many pets do you have?");
        Integer petCount = petCount();
        if (petCount <= 0) {
            System.out.println("That's too bad");
        } else {
            for (int i = 0; i < petCount; i++) {
                String typePet = petType();
                System.out.println("What is your pet's name?");
                String namePet = petName();
                buildAPet(typePet, namePet);

            }
        }
    }
    static Integer petCount() {
        int petCount = userInput.nextInt();
        userInput.nextLine();
        return petCount;
    }

    static String petType() {
        String typePet = "";
        do { System.out.println("What type of pet do you have? (Dog, Cat, or Penguin?");
            typePet = userInput.nextLine();

        } while (!typePet.equalsIgnoreCase("Dog") && !typePet.equalsIgnoreCase("Cat")
                        && !typePet.equalsIgnoreCase("Penguin"));
          return typePet;
    }



    static String petName() {

        String namePet = userInput.nextLine();
        return namePet;
    }

    public void buildAPet(String petType, String name) {
        if (petType.equalsIgnoreCase("Dog")) {
            Dog d = new Dog(name);
            pets.add(d);
        } else if (petType.equalsIgnoreCase("Cat")) {
            Cat c = new Cat(name);
            pets.add(c);
        } else { Penguin p = new Penguin(name);
            pets.add(p);}
        //LOGGER.log(Level.INFO, "value is: " + pets.size());
        }

    public void listPets(){
        for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i).getNameOfPet() + " the " + pets.get(i).getClass().getSimpleName() + " goes " +  pets.get(i).speak());
        }
    }

}
