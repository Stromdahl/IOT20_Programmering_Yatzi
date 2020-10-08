package com.company;

public class Yatzi {
    private Die[] dice = new Die[5];
    Yatzi(){
        for(int i = 0; i < dice.length; i++){
            dice[i] = new Die();
        }
    }

    public void setDice(Die[] dice){
        this.dice = dice;
    }

    public int getDieValue(int index){
        return dice[index].getValue();
    }

    public void printDice(){
        for(int i = 0; i < dice.length; i++){
            System.out.println(i + ": Dice shows " + dice[i].getValue());
        }
    }

    public boolean checkForYatzi(){
        for (int i = 1; i < dice.length; i++) {
            if(!dice[0].equals(dice[i])) return false;
        }
        return true;
    }
}