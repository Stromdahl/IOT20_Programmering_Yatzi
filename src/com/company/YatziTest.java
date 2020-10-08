package com.company;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class YatziTest {

    @Test
    void isYatziWhenAllDiceMatches() {
        Yatzi yatzi = new Yatzi();
        Die[] dice = new Die[5];
        yatzi.setDiceValues(new int[] {6,6,6,6,6});
        assertTrue(yatzi.checkForYatzi());
    }

    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Yatzi yatzi = new Yatzi();
        yatzi.setDiceValues(new int[] {1,2,3,4,5});
        assertFalse(yatzi.checkForYatzi());
    }

    @Test
    void testGetDieValue(){
        Yatzi yatzi = new Yatzi();
        yatzi.setDiceValues(new int[]{3,3,3,3,3});
        assertEquals(3, yatzi.getDieValue(0));
        assertEquals(3, yatzi.getDieValue(1));
        assertEquals(3, yatzi.getDieValue(2));
        assertEquals(3, yatzi.getDieValue(3));
        assertEquals(3, yatzi.getDieValue(4));
    }

    @Test
    void testPrintDice(){
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outputStreamCaptor));

        //Create a instance of Yatzi
        Yatzi yatzi = new Yatzi();

        //Create a array of dice with known value

        yatzi.setDiceValues(new int[]{3,3,3,3,3});
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