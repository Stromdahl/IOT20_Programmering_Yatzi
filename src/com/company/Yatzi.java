package com.company;

public class Yatzi {
    private Die[] dice = new Die[5];
    Yatzi(){
        for(int i = 0; i < dice.length; i++){
            dice[i] = new Die();
        }
    }

    void rollDice(){
        for(int i = 0; i < dice.length; i++){
            dice[i].roll();
        }
    }

    public Die[] getDice() {
        return dice;
    }

    public Die getDie(int i){
        return dice[i];
    }

    public void printDice(){
        for(int i = 0; i < dice.length; i++){
            System.out.println(i + ": " + dice[i].getString());
        }
    }

    public boolean checkForYatzi(){
        for (int i = 1; i < dice.length; i++) {
            if(!dice[0].equals(dice[i])) return false;
        }
        return true;
    }


}
