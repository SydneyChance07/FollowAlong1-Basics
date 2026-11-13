package part03;

import java.util.Scanner;

// This program asks the user questions and prints their answers
public class UserInput {
    public static void main(String[] args) {
        // Create a Scanner to read keyboard input
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        // Ask for the user's age
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        // Clear the leftover Enter key
        scanner.nextLine();

        // Ask for the user's favorite food
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();

        // Print all the answers
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);

        // Close the Scanner
        scanner.close();
    }
}