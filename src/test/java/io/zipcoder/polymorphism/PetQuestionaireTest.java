package io.zipcoder.polymorphism;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PetQuestionaireTest{

    @Test
    public void TestAskQuestions() {
        ArrayList<Pets> testArray = new ArrayList<>();
        Dog dog = new Dog("Fido");
        Cat cat = new Cat("Milo");
        Penguin penguin = new Penguin("Opus");
        testArray.add(dog);
        testArray.add(cat);
        testArray.add(penguin);



        Integer expected = 3;
        Integer actual = testArray.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildAPet() {
        ArrayList<Pets> testArray = new ArrayList<>();
        Dog dog = new Dog("Fido");
        Cat cat = new Cat("Milo");
        Penguin penguin = new Penguin("Opus");
        testArray.add(dog);
        testArray.add(cat);
        testArray.add(penguin);

        String expected = "Fido";
        String expected2 = "Penguin";
        Integer expected3 = 3;

        String actual = testArray.get(0).getNameOfPet();
        String actual2 = testArray.get(2).getClass().getSimpleName();
        Integer actual3 = testArray.size();

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);

    }

}
