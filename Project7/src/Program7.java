// Yaoxian Yang
// COSC 211 Programming Assignment 
// Lab #7
// Fall 2017: 12:00 ~ 13:50 Tue, Thu
// A method that counts the frequency of
// occurrence of a digit in an int number

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
    		Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = keyboard.nextInt();
        System.out.println("Enter the digit you want to count:");
        int d = keyboard.nextInt();
        System.out.println(d + " occurs for " + frequencyCount(n, d) + " times.");
    }

    public static int frequencyCount(int n, int d) {
        if (n == 0) {
            return 0;
        } else if (n % 10 == d) {
            return 1 + frequencyCount(n / 10, d);
        } else {
            return frequencyCount(n / 10, d);
        }
    }
}

/* 
 * Enter a number:
 * 62656
 * Enter the digit you want to count:
 * 3
 * 3 occurs for 0 times.
 * 
 * Enter a number:
 * 98888888
 * Enter the digit you want to count:
 * 8
 * 8 occurs for 7 times.
 * 
 */
