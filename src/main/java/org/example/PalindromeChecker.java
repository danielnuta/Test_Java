package org.example;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "madam"; // You can change this string to test with other inputs.

        // Convert the string to lowercase to make the palindrome check case-insensitive.
        str = str.toLowerCase();

        // Check if the string is a palindrome.
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // Compare characters from the start and the end.
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome.
            }
            left++;
            right--;
        }

        return true; // If all characters match, it's a palindrome.
    }
    }

