package org.example;

public class GCD {
    public String gcdOfStrings(String str1, String str2) {
        // Check if str1 + str2 equals str2 + str1, if not, there is no common divisor string
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // The GCD of the lengths of the two strings
        int gcdLength = gcd(str1.length(), str2.length());

        // The largest common divisor string
        return str1.substring(0, gcdLength);
    }

    // Function to calculate the GCD of two numbers
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        GCD sol = new GCD();

        // Test cases
        System.out.println(sol.gcdOfStrings("ABCABC", "ABC"));  // Output: "ABC"
        System.out.println(sol.gcdOfStrings("ABABAB", "ABAB")); // Output: "AB"
        System.out.println(sol.gcdOfStrings("LEET", "CODE"));   // Output: ""
    }
}
