// Yaoxian Yang
// COSC 211 (Fall 2017)
// Section: 12:00 ~ 13:50 Tue, Thu
// This program is for Programming assignment #2.
// It initializes a seat chart for users to choose seats.
// The user enters a string as the chosen position of seats: "1A" "2C".
// Then the program replace the chosen seat with the character 'X'.
// Press 'q' to quit the program.
// If the seat has been chosen before, the program will ask for another input.
// If there's no available seats, the program will quit directly.

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        final int ROW = 7;
        final int COL = 4;

        String input;
        Scanner keyboard = new Scanner(System.in);

        // initialization
        char[][] seats = new char[ROW][COL];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                seats[i][j] = (char) ('A' + j);
            }
        }

        System.out.println("This is a seat reservation system. Press \'q\' to quit");

        while (true) {
            // print seat chart
            for (int i = 0; i < ROW; i++) {
                System.out.print(i + 1);
                for (int j = 0; j < COL; j++) {
                    if ((j + 1) % 2 != 0) {
                        System.out.print(" ");
                    }
                    System.out.print(" " + seats[i][j]);
                }
                System.out.println();
            }

            // check if the chart is full
            boolean full = true;
            for (int i = 0; i < ROW; i++) {
                for (int j = 0; j < COL; j++) {
                    if (seats[i][j] != 'X') {
                        full = false;
                        break;
                    }
                }
            }
            if (full) {
                System.out.println("There is no seats available.\nTerminating Program...");
                break;
            }

            // keyboard input
            System.out.println("Please enter your choice on seat number: ");
            input = keyboard.next();

            // quit
            if (input.equals("q")) {
                break;
            }

            // assign available seat
            int r = (int) input.charAt(0) - '1';
            int c = (int) input.charAt(1) - 'A';

            if (seats[r][c] == 'X') {
                System.out.println("Seat " + input + " has already been chosen.");
            } else {
                seats[r][c] = 'X';
            }
        }
    }
}
