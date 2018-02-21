/** Program: Compute a Five-Digit, Positive Integer Program
 * File: FiveDigitPositiveInteger.java
 * Summary: This program accepts a user's input of 5-integers, computes them
 *          and adds the results together for a total.
 *
 * Author: Keith Harrison
 * Date: 2/21/2018
 * 
 */

// Import Scanner.
import java.util.Scanner;

public class FiveDigitPositiveInteger {

    public static void main(String[] args) {
        
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter 5 integers.
        System.out.print("Enter a 5-digit, positive integer, e.g., 12345:" );
        
        // Read each integer.
        int userInteger1 = sc.nextInt();
        
        // Find the modulas of the first number with 10.
        int remainder1 = userInteger1 % 10;
        
        // Divide the first number by 10.
        int userInteger2 = userInteger1 / 10;
        
        // Find the modulas of the new, second number with 10.
        int remainder2 = userInteger2 % 10;
        
        // Divide the second, new number by 10.
        int userInteger3 = userInteger2 / 10;
        
         // Find the modulas of the new, third number with 10.
        int remainder3 = userInteger3 % 10;
        
        // Divide the third, new number by 10.
        int userInteger4 = userInteger3 / 10;       
        
        // Find the modulas of the new, fourth number with 10.
        int remainder4 = userInteger4 % 10;
        
        // Divide the fourth, new number by 10.
        int userInteger5 = userInteger4 / 10;
        
        // Find the modulas of the new, fifth number with 10.
        int remainder5 = userInteger5 % 10;    
        
        // Sum the modulas results.
        int remaindersSum = remainder1 + remainder2 + remainder3 + remainder4 +
                remainder5;

        // Display the sum of integer
        System.out.println("The sum of the integers is " + remaindersSum + ".");
        
        // Close the scanner
        sc.close();
    }
    
}
