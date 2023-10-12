import java.util.Scanner;

public class NumberPowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Calculate the powers
        double square = number * number;
        double cube = number * number * number;
        double fourthPower = number * number * number * number;

        // Display the results
        System.out.println("square: " + square);
        System.out.println("cube: " + cube);
        System.out.println("fourth power: " + fourthPower);
    }
}


