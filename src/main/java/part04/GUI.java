package part04;

import javax.swing.JOptionPane;

// This program asks questions using pop-up windows
public class GUI {
    public static void main(String[] args) {

        // Ask for the user's name
        String name = JOptionPane.showInputDialog("Enter your name");

        // Display a greeting
        JOptionPane.showMessageDialog(null, "Hello " + name);

        // Ask for the user's age and convert it into an integer
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));

        // Display the age
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        // Ask for the user's height and convert it into a decimal
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));

        // Display the height
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
    }
}