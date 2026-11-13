package part03;

public class Swap {
    public static void main(String[] args) {
        // Make two String variables with different values
        String x = "water";
        String y = "Kool-Aid";

        // Make a temporary variable to save the first value
        String temp;

        // Switch the two values
        temp = x;
        x = y;
        y = temp;

        // Print the swapped values
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}