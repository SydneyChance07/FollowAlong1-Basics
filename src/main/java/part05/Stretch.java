package part05;

import java.util.Random;
import java.util.Scanner;

public class Stretch {
    public static void main(String[] args) {

        /* MY GUESS:
        7
        2.5
        8
        7.0
        3
        2
        3.0
        -2.0
        */

        // Stretch A: Test Math methods
        System.out.println(Math.max(7, -3));
        System.out.println(Math.min(2.5, 9));
        System.out.println(Math.abs(-8));
        System.out.println(Math.sqrt(49));
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(2.4));
        System.out.println(Math.ceil(2.1));
        System.out.println(Math.floor(-2.1));

        // Create a random number generator
        Random random = new Random();

        // B1: Roll a six-sided die
        int dice = random.nextInt(6) + 1;
        System.out.println("You rolled a " + dice);

        // B2: Ask for the radius of a circle
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius = scanner.nextDouble();

        // Calculate the circle's area
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);

        // Round the area
        System.out.println("Area, rounded: " + Math.round(area));

        // B3: Calculate the distance between two points
        double distance = Math.sqrt((4 - 1) * (4 - 1) + (6 - 2) * (6 - 2));
        System.out.println("Distance: " + distance);

        scanner.close();
    }
}