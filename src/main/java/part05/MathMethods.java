package part05;

// This program demonstrates Java Math methods
public class MathMethods {
    public static void main(String[] args) {

        // Create two decimal numbers
        double x = 3.14;
        double y = -10;

        // Find the larger number
        double z = Math.max(x, y);
        System.out.println(z);

        // Find the smaller number
        z = Math.min(x, y);
        System.out.println(z);

        // Find the absolute value
        z = Math.abs(y);
        System.out.println(z);

        // Find the square root of a negative number
        z = Math.sqrt(y);
        System.out.println(z);

        // Change y to a positive number
        y = 3.16;

        // Find the square root
        z = Math.sqrt(y);
        System.out.println(z);

        // Round to the nearest whole number
        z = Math.round(x);
        System.out.println(z);

        // Round up
        z = Math.ceil(x);
        System.out.println(z);

        // Round down
        z = Math.floor(x);
        System.out.println(z);
    }
}