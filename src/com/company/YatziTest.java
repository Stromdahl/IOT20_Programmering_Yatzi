package com.company;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class YatziTest {
    @Test
    void isYatziWhenAllDiceMatches() {
        Die[] dice = new Die[5];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die(6);
        }
        //Assert something?
        assertTrue(YatziMain.checkForYatzi(dice));
    }

    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Die[] dice = new Die[5];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die(6);
        }
        dice[0].setValue(5);
        assertFalse(YatziMain.checkForYatzi(dice));
    }
}
