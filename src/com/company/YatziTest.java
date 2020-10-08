package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class YatziTest {

    @Test
    void isYatziWhenAllDiceMatches() {
        Yatzi yatzi = new Yatzi();
        Die[] dice = new Die[5];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die(6);
        }
        yatzi.setDice(dice);
        assertTrue(yatzi.checkForYatzi());
    }

    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Yatzi yatzi = new Yatzi();
        Die[] dice = new Die[5];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die(6);
        }
        dice[0].setValue(5);
        assertFalse(yatzi.checkForYatzi());
    }

    @Test
    void testGetDieValue(){

    }

    @Test
    void testPrintDice(){

        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outputStreamCaptor));

        //Create a instance of Yatzi
        Yatzi yatzi = new Yatzi();

        //Create a array of dice with known value
        Die[] dice = new Die[5];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die(3);
        }

        yatzi.setDice(dice);
        yatzi.printDice();

        String actualOutput = outputStreamCaptor.toString();
        actualOutput = actualOutput.replace("\r\n", "\n");
        actualOutput = actualOutput.replace("\r", "\n");

        String expectedOutput =
                "0: Dice shows 3\n" +
                "1: Dice shows 3\n" +
                "2: Dice shows 3\n" +
                "3: Dice shows 3\n" +
                "4: Dice shows 3\n";

        assertEquals(expectedOutput, actualOutput);
    }
}