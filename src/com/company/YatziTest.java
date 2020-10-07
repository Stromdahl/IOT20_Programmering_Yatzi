package com.company;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class YatziTest {
    @Test
    void isYatziWhenAllDiceMatches() {
        Yatzi yatzi = new Yatzi();
        Die[] dice = new Die[5];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die(6);
        }
        //Assert something?
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
}