import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        // Create a Scanner object for taking input from the user
        Scanner inputScanner = new Scanner(System.in);

        // Display the menu of conversion options
        System.out.println("Temperature Converter");
        System.out.println("Please select an option:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        // Get and validate the user's choice for the conversion type
        int conversionChoice = 0;
        while (true) {
            System.out.print("Enter 1 or 2: ");
            if (inputScanner.hasNextInt()) {
                conversionChoice = inputScanner.nextInt();
                if (conversionChoice == 1 || conversionChoice == 2) {
                    break; // valid input, exit the loop
                } else {
                    System.out.println("Invalid option. Please choose 1 or 2.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
                inputScanner.next(); // clear the invalid input
            }
        }

        // Ask the user to enter the temperature value
        System.out.print("Enter the temperature: ");
        double tempInput = 0;
        while (true) {
            if (inputScanner.hasNextDouble()) {
                tempInput = inputScanner.nextDouble();
                break; // valid temperature input, exit the loop
            } else {
                System.out.println("Invalid input. Please enter a valid numeric temperature.");
                inputScanner.next(); // clear the invalid input
            }
        }

        // Perform the temperature conversion based on the user's choice
        if (conversionChoice == 1) {
            // Celsius to Fahrenheit conversion
            double fahrenheit = (tempInput * 9 / 5) + 32;
            System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.%n", tempInput, fahrenheit);
        } else {
            // Fahrenheit to Celsius conversion
            double celsius = (tempInput - 32) * 5 / 9;
            System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.%n", tempInput, celsius);
        }

        // Close the scanner to free up resources
        inputScanner.close();
    }
}
