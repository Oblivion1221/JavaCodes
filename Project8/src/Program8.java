// Yaoxian Yang
// COSC 211 Programming Assignment
// Lab #8
// Fall 2017: 12:00 ~ 13:50 Tue, Thu
// forwardsEqualBackwards() returns the value true
// if the sequence of elements in an array of integers
// is the same irrespective of whether the array is traversed
// forwards or backwards and it returns false, otherwise.

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int len = keyboard.nextInt();
        while (len < 0) {
            System.out.println("Enter a positive length, please:");
            len = keyboard.nextInt();
        }
        int[] input = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Enter the " + (i + 1) + "th element:");
            input[i] = keyboard.nextInt();
        }
        System.out.println(forwardsEqualBackwards(input, 0, len - 1));
    }

    public static boolean forwardsEqualBackwards(int[] arr, int s, int e) {
        return e - s < 1 || arr[s] == arr[e] && forwardsEqualBackwards(arr, s + 1, e - 1);
    }
}


// Output:
//        Enter the length of the array:
//        10
//        Enter the 1th element:
//        23
//        Enter the 2th element:
//        21
//        Enter the 3th element:
//        12
//        Enter the 4th element:
//        3
//        Enter the 5th element:
//        3
//        Enter the 6th element:
//        3
//        Enter the 7th element:
//        3
//        Enter the 8th element:
//        3
//        Enter the 9th element:
//        3
//        Enter the 10th element:
//        33
//        false
//
//        Enter the length of the array:
//        4
//        Enter the 1th element:
//        1
//        Enter the 2th element:
//        2
//        Enter the 3th element:
//        2
//        Enter the 4th element:
//        1
//        true
//