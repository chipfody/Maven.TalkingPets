package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PenguinTest {

    @Test
    public void speakTest() {
        Penguin penguin = new Penguin("Opus");
        String expected = "Sqwawk";
        String actual = penguin.speak();

        Assert.assertEquals(expected, actual);
    }
}
