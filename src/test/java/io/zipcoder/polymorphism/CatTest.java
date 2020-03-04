package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {


    @Test
    public void speakTest() {
        Cat cat = new Cat("Sabrina");
        String expected = "Meow";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }
}
