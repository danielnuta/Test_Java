package org.example;

public class CheckPrimeNumber {
    /**
     * Checks whether the given number is prime or not.
     *
     * @param n the number to be checked
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Main method to test the isPrime function with a sample input.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        if (isPrime(17)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
