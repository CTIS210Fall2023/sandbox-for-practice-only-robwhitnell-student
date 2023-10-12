package edu.guilford;

// The keyword import tells Java that we plan to use the specified class
import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        // A place for testing Java code
        // Counting loop
        // Suppose we deposit $1000 in a savings account. The account has an annual interest rate
        // of 3% and you add $100 at the end of each year. What is the value of the account
        // each year for the next 20 years?

        // Initialize variables: initialDeposit, interestRate, yearlyDeposit, currentValue
        double initialDeposit = 1000;
        double interestRate = 0.03;
        double yearlyDeposit = 200;
        double currentValue = initialDeposit;

        // Counting loops need an *index*: what iteration of the loop is the program running?
        int year = 0; // we start at year 0
        int finalYear = 20; // when we stop the loop

        while (year < finalYear) {
            // keep running as long as we haven't hit finalYear
            currentValue = currentValue * (1 + interestRate) + yearlyDeposit;
            System.out.println("At the end of year " + year + 
            ", value = $" + String.format("%.2f", currentValue));
            year = year + 1; // make sure we move to the next year
        }

        // Example of sentinel loop
        int sentinel = 0;
        int total = 0; // a variable for the running total
        // need a Scanner object to read the numbers
        Scanner scan = new Scanner(System.in);
        // Get the first value from the user
        System.out.println ("Enter an integer (0 to stop): ");
        int value = scan.nextInt();
        // Add them up while they're not 0
        // Start the loop
        // User enters integers and the program stops when the value entered is the sentinel
        while (value != sentinel) {
            // update the running total
            total = total + value;
            // get the next value
            value = scan.nextInt();
        }
        // The program jumps here when the user enters 0
        // Print out the result
        System.out.println("The total is " + total);







       
    }
}