package org.example;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input three numbers
        System.out.println("Enter the first number: 10");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: 25");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number: 15");
        int num3 = scanner.nextInt();

        // Find the largest number using if-else conditions
        int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // Output the largest number
        System.out.println("The largest number is: " + largest);
    }
}
