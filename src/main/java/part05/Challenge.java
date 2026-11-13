package part05;

import java.util.Random;
import java.util.Scanner;

/*
Sydney Chance
Dice Report
*/

public class Challenge {
    public static void main(String[] args) {

        // Create a Scanner and Random generator
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Ask for the player's name
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        // Roll two six-sided dice
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;

        // Calculate the total
        int total = dice1 + dice2;

        // Find the higher die
        int higher = Math.max(dice1, dice2);

        // Find the lower die
        int lower = Math.min(dice1, dice2);

        // Find the difference
        int difference = Math.abs(dice1 - dice2);

        // Calculate the average
        double average = total / 2.0;

        // Round the average
        long roundedAverage = Math.round(average);

        // Print the dice results
        System.out.println(name + " rolled a " + dice1 + " and a " + dice2);

        // Print the total
        System.out.println("Total: " + total);

        // Print the higher die
        System.out.println("Higher die: " + higher);

        // Print the lower die
        System.out.println("Lower die: " + lower);

        // Print the difference
        System.out.println("Difference: " + difference);

        // Print the average
        System.out.println("Average: " + average);

        // Print the rounded average
        System.out.println("Average, rounded: " + roundedAverage);

        scanner.close();
    }
}