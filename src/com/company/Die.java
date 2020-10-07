package com.company;

public class Die{
    public int value = 0;

    public Die() {
        DieRoll();
    }
    public Die(int value) {
        this.value = value;
    }

    public int DieRoll() {
        value = (int)(Math.random()*6+1);
        return value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getString() {
        return "Dice shows " + value;
    }
}
