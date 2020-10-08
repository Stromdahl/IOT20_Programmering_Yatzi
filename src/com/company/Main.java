package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Yatzi!");
        Scanner sc = new Scanner(System.in);
        int currentTurn = 0;
        while (true) {
            Yatzi yatzi = new Yatzi();

            System.out.println("Starting turn " + (currentTurn + 1) + " of 3, rolling dice.");
            yatzi.printDice();
            if (yatzi.checkForYatzi()) {
                System.out.printf("You got YATZI! in %d's\n", yatzi.getDieValue(0));
                return;
            } else if (currentTurn < 2) {
                System.out.println("Want to throw again? (y for yes, anything else for no)");
                currentTurn++;
            } else {
                System.out.println("Game Over, Want to try again?");
                currentTurn = 0;
            }
            if (!sc.next().equals("y")) {
                return;
            }
        }
    }
}