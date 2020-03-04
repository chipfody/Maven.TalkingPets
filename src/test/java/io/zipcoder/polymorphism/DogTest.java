package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void speakTest() {
        Dog dog = new Dog("Astro");
        String expected = "Woof";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }
}
