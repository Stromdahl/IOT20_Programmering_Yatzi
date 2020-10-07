package com.company;

import java.util.Scanner;

public class YatziMain {
    public static Die[] dice;
    public static boolean gameIsActive = true;

    public static boolean checkForYatzi(Die[] dice){
        for (int i = 1; i < dice.length; i++) {
            if(dice[i].value != dice[0].value){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        dice = new Die[5];
        for(int d=0;d<5;d++) {
            dice[d] = new Die();
        }
        //We will continue until the game is over
        while(gameIsActive) {
            System.out.println("Welcome to Yatzi!");
            for(int turn = 0; turn < 3; turn++) {
                System.out.println("Starting turn " + (turn+1) + " of 3, rolling dice.");
                for(int i = 0; i< dice.length; i++) {
                    dice[i].DieRoll();
                    //ds[i].value = 5; //Test if yatzi work
                    System.out.println(i + ": " + dice[i].getString());
                }
                //YATZI
                if(checkForYatzi(dice)) {
                    System.out.println("You got YATZI! in " + dice[0].value + "'s");
                    return;
                } else {
                    //Here we check if there is no Yatzy: then we check what turn we are on and asks the player if we want to continue or not
                    if(turn != 2) {
                        System.out.println("Want to throw again? (y for yes, anything else for no)");
                        Scanner sc = new Scanner(System.in);
                        if(sc.next().equals("y")) {
                            ++turn;
                        } else {
                            gameIsActive = !gameIsActive;
                            break;
                        }
                    } else {
                        System.out.println("Game over! Want to play again?");
                        Scanner sc = new Scanner(System.in);
                        if(sc.next().equals("y")) {
                            turn = 0;
                        } else {
                            gameIsActive = !gameIsActive;
                            break;
                        }
                    }
                }
            }
        }
    }
}