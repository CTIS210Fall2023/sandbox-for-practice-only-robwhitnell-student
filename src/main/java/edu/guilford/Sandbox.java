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
        //    year = year + 1; // make sure we move to the next year
        }
       
    }
}