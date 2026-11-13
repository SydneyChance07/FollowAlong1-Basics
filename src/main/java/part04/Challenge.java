package part04;

import javax.swing.JOptionPane;

/*
Sydney Chance
Tip Calculator
*/

public class Challenge {
    public static void main(String[] args) {

        // Ask for the meal cost
        double mealCost = Double.parseDouble(JOptionPane.showInputDialog("Enter the meal cost"));

        // Ask for the tip percentage
        int tipPercent = Integer.parseInt(JOptionPane.showInputDialog("Enter the tip percentage"));

        // Ask how many people are splitting the bill
        int people = Integer.parseInt(JOptionPane.showInputDialog("How many people are splitting the bill?"));

        // Calculate the tip
        double tip = mealCost * tipPercent / 100;

        // Calculate the total cost
        double total = mealCost + tip;

        // Calculate how much each person pays
        double eachPays = total / people;

        // Convert the payment into a whole-dollar amount
        int wholeDollar = (int) eachPays;

        // Calculate how many dollars are still needed
        int leftover = (int) total - (wholeDollar * people);

        // Show the tip and total
        JOptionPane.showMessageDialog(null, "Tip: $" + tip + "\nTotal: $" + total);

        // Show the payment information
        JOptionPane.showMessageDialog(null,
                "Each person pays $" + eachPays +
                        "\nIf everyone pays $" + wholeDollar +
                        ", you are still $" + leftover + " short.");
    }
}