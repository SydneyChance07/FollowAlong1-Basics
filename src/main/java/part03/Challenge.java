package part03;

import java.util.Scanner;

/*
Sydney Chance
Mad Libs Adventure Story
*/

public class Challenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name a hero:");
        String hero = scanner.nextLine();

        System.out.println("Name a villain:");
        String villain = scanner.nextLine();

        System.out.println("Pick a number:");
        int number = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Name a place:");
        String place = scanner.nextLine();

        System.out.println(hero + " traveled to " + place + ".");
        System.out.println("There were " + number + " problems, and " + villain + " caused them.");

        String temp = hero;
        hero = villain;
        villain = temp;

        System.out.println("Plot twist: " + hero + " was actually the hero, and " + villain + " was the villain!");

        scanner.close();
    }
}