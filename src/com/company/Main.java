package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Yatzi yatzi;
        int currentTurn = 0;
        while (true) {
            yatzi = new Yatzi();
            System.out.println("Welcome to Yatzi!");
            System.out.println("Starting turn " + (currentTurn + 1) + " of 3, rolling dice.");
            yatzi.printDice();
            if (yatzi.checkForYatzi()) {
                System.out.printf("You got YATZI! in %d's\n", yatzi.getDieValue(0));
                break;
            } else if (currentTurn < 2) {
                currentTurn++;
                System.out.println("Want to throw again? (y for yes, anything else for no)");
            } else {
                System.out.println("Game Over, Want to try again?");
                currentTurn = 0;
            }
            if (!sc.next().equals("y")) {
                break;
            }
        }
    }
}