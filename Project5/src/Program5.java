// Yaoxian Yang
// COSC 211 Programming Assignment #5
// Fall 2017: 12:00 ~ 13:50 Tue, Thu
// Read from a file and add all integers in it together

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner inputStream;
        int sum = 0;
        try {
            inputStream = new Scanner(new FileInputStream("inputP5.txt"));
            while (inputStream.hasNext()) {
                String s = inputStream.next();
//                for (int i = 0; i < s.length(); i++)
//                    if (Character.isDigit(s.charAt(i))) {
//                        sum += Character.getNumericValue(s.charAt(i));
//                    }
                int n;
                try {
                    n = Integer.parseInt(s);
                } catch (NumberFormatException e) {
                    continue;
                }
                sum += n;
            }
        } catch (FileNotFoundException e) {
            System.out.println("inputP5 not found.");
            System.exit(0);
        }
        System.out.println(sum);
    }
}
