package part04;

public class Stretch {
    public static void main(String[] args) {

        /* MY GUESS:
        2
        2
        2.5
        11
        9
        3.5
        6
        */

        // Stretch A: Test division and remainders
        int n = 10;
        System.out.println(n / 4);
        System.out.println(n % 4);
        System.out.println(n / 4.0);

        // Increase n
        n++;
        System.out.println(n);

        // Decrease n twice
        n--;
        n--;
        System.out.println(n);

        // Test casting and integer division
        System.out.println((double) 7 / 2);
        System.out.println(7 / 2 * 2);

        // B1: Split a $50 bill between four friends
        int people = 4;
        double bill = 50;
        double eachPays = bill / people;
        System.out.println("Each person pays $" + eachPays);

        // B2: Convert seconds into minutes and seconds
        int seconds = 500;
        int minutes = seconds / 60;
        int leftoverSeconds = seconds % 60;
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + leftoverSeconds + " seconds");

        // B3: Calculate three test scores
        int score1 = 90;
        int score2 = 85;
        int score3 = 78;
        int total = score1 + score2 + score3;

        // Integer division removes the decimal
        System.out.println("int average: " + total / 3);

        // Casting keeps the decimal
        System.out.println("double average: " + (double) total / 3);
    }
}