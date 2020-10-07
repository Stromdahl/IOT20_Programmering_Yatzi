package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDie {

    @Test
    void isTrueWhenTwoDiceHasEqualValue(){
        Die die = new Die(6);
        Die die2 = new Die(6);
        assertTrue(die.equals(die2));
    }

    @Test
    void isFalseWhenTwoDiceDoesNotHaveEqualValue(){
        Die die = new Die(1);
        Die die2 = new Die(6);
        assertFalse(die.equals(die2));
    }
}
