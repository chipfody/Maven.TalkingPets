package io.zipcoder.polymorphism;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    private static final Logger LOGGER = Logger.getLogger(MainApplication.class.getName());
    private static Scanner userInput;
    private ArrayList<Pets> pets;
    private static PetQuestionnaire pq;

    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        pq = new PetQuestionnaire();
        pq.askQuestions();
        pq.listPets();
    }
}

