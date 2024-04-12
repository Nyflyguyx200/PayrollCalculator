package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       //Exercise 4
       //The user to enter their name
        System.out.print("Enter your name:  ");
        String name = scanner.nextLine();

        //The user to enter hours worked
        System.out.print("Enter your hours worked:  ");
        float hoursWorked = scanner.nextFloat();

        //The user to enter pay rate
        System.out.print("Enter your pay rate:  ");
        float payRate = scanner.nextFloat();

        //Calculate gross pay
        float grossPay = hoursWorked * payRate;

        //Display employee's name and gross pay
        System.out.println("Employee Name:  " + name);
        System.out.printf("Gross pay: $%.2f%n", grossPay);

        scanner.close();
    }
}
