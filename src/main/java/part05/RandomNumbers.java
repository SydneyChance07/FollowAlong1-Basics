package part05;

import java.util.Random;

// This program demonstrates random numbers
public class RandomNumbers {
    public static void main(String[] args) {

        // Create a random number generator
        Random random = new Random();

        // Generate a random number from 1 to 6
        int x = random.nextInt(6) + 1;
        System.out.println(x);

        // Generate a random decimal
        double y = random.nextDouble();
        System.out.println(y);

        // Generate a random true or false
        boolean z = random.nextBoolean();
        System.out.println(z);
    }
}