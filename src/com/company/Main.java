package com.company;

import java.util.Scanner;

public class Main {
    public static boolean gameIsActive = true;

    public static boolean askPlayerForNewRound(String message){
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        if(sc.next().equals("y")){
            gameIsActive = false;
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Yatzi yatzi = new Yatzi();
        //We will continue until the game is over
        while(gameIsActive) {
            System.out.println("Welcome to Yatzi!");
            for(int turn = 0; turn < 3; turn++) {
                System.out.println("Starting turn " + (turn+1) + " of 3, rolling dice.");
                yatzi.rollDice();
                yatzi.printDice();
                //YATZI
                if(yatzi.checkForYatzi()) {
                    System.out.println("You got YATZI! in " + yatzi.getDie(0).getValue() + "'s");
                    return;
                } else {
                    if(askPlayerForNewRound("Want to throw again? (y for yes, anything else for no)")) return;
                }
            }
            if(askPlayerForNewRound("Game over! Want to play again?")) return;
        }
    }
}
