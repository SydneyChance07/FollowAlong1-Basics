package part05;

import java.util.Scanner;

// This program calculates the hypotenuse of a triangle
public class Hypotenuse {
    public static void main(String[] args) {

        // Create variables for the triangle sides and answer
        double x;
        double y;
        double z;

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the first side
        System.out.println("Enter side x: ");
        x = scanner.nextDouble();

        // Ask for the second side
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        // Calculate the hypotenuse
        z = Math.sqrt((x * x) + (y * y));

        // Print the answer
        System.out.println("The hypotenuse is: " + z);

        // Close the Scanner
        scanner.close();
    }
}