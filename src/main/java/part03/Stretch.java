package part03;

import java.util.Scanner;

public class Stretch {
    public static void main(String[] args) {

        /* MY GUESS:
        2 2
        2 1
        */

        // Test swapping without a temporary variable
        int a = 1;
        int b = 2;
        a = b;
        b = a;
        System.out.println(a + " " + b);

        // Test swapping with a temporary variable
        int c = 1;
        int d = 2;
        int temp = c;
        c = d;
        d = temp;
        System.out.println(c + " " + d);

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // B1: Ask for a name
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hi, " + name + "!");

        // B2: Create three colors
        String first = "red";
        String second = "green";
        String third = "blue";

        // Print the original colors
        System.out.println(first + " " + second + " " + third);

        // Rotate the colors using a temporary variable
        String tempColor = first;
        first = second;
        second = third;
        third = tempColor;

        // Print the rotated colors
        System.out.println(first + " " + second + " " + third);

        // B3: Ask for an age
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        // Clear the leftover Enter
        scanner.nextLine();

        // Ask for a city
        System.out.println("What city do you live in?");
        String city = scanner.nextLine();

        // Print the age and city
        System.out.println(age + " years old, living in " + city);

        scanner.close();
    }
}