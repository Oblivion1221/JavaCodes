// Yaoxian Yang
// COSC 211 Programming Assignment #4
// Fall 2017: 12:00 ~ 13:50 Tue, Thu

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        boolean again = true;

        while (again) {
            System.out.println("Enter time in 24-hour notation:");

            try {
                String input = keyboard.next();

                int hr = Integer.parseInt(input.split(":")[0]);
                int min = Integer.parseInt(input.split(":")[1]);

                if (min >= 60 || hr >= 24) {
                    throw new TimeFormatException("That is not a valid time\n\nTry again:");
                }

                System.out.println("That is the same as");

                if (hr > 12)
                    System.out.println((hr - 12) + ":" + min + " PM");
                else if (hr == 12)
                    System.out.println(hr + ":" + min + " PM");
                else if (hr == 0)
                    System.out.println(12 + ":" + min + " AM");
                else
                    System.out.println(hr + ":" + min + " AM");

                System.out.println("\nAgain? (y/n)");
                String op = keyboard.next();

                if (!op.toLowerCase().equals("y")) {
                    again = false;
                    System.out.println("End of Program");
                } else {
                    System.out.println();
                }
            } catch (TimeFormatException e1) {
                keyboard.nextLine();
                System.out.println(e1.getMessage());
            } catch (Exception e2) {
                keyboard.nextLine();
                System.out.println("Please enter the time in the format of (int)hr:(int)min\n\nTry again:");
            }
        }
    }
}
