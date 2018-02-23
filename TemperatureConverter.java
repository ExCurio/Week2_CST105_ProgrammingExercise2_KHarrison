/** Program: Temperature Converter
 * File: TemperatureConverter.java
 * Summary: This program takes user input of temperature and converts it to
 * Celsius or Fahrenheit.
 * 
 *
 * Author: Keith Harrison
 * Date: 2/20/2018
 * 
 */

// Import Scanner.
import java.util.Scanner;

public class TemperatureConverter {


    public static void main(String[] args) {
        
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        
        
        
        // Start Fahrenheit to Celsius conversion part of the program.

        // Prompt the user to enter a temperature in degrees Fahrenheit.
        System.out.print("Enter a temperature in degrees Fahrenheit, e.g., " + 
                "32:");
        
        // Read the user input.
        double userTemperatureInFahrenheit = sc.nextInt();
        
        // Convert Fahrenheit to Celsius.
        double celsius = (5.0 / 9) * (userTemperatureInFahrenheit - 32);
        
        // Print results to the console.
        System.out.println(userTemperatureInFahrenheit + " degrees Fahrenheit "
                + "is " + celsius + " degrees in Celsius.");
        
        
       
        
        // Start Celsius to Fahrenheit conversion part of the program.
        
        // Prompt the user to enter a temperature in degrees Celsius.
        System.out.print("Enter a temperature in degrees Celsius, e.g., 100:");
        
        // Read the user input.
        double userTemperatureInCelsius = sc.nextInt();
        
        // Convert Fahrenheit to Celsius
        double fahrenheit = (9.0 / 5) * userTemperatureInCelsius + 32;
        
        // Print results to the console.
        System.out.println(userTemperatureInCelsius + " degrees Celsius is " +
        fahrenheit + " degrees in Fahrenheit.");
        
        
        
        
        // Close the scanner
        sc.close();
    }
    
}
