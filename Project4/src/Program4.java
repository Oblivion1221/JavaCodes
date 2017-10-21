import java.util.InputMismatchException;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter(":");

        boolean again = true;

        while (again) {
            System.out.println("Enter time in 24-hour notation:");
            try {
                while (keyboard.hasNext()) {
                    int hr = Integer.parseInt(keyboard.next());
                    int min = Integer.parseInt(keyboard.next());
                }
                if (min >= 60 || hr >= 24) {
                    throw new TimeFormatException("That is not a valid time\n\nTry again:");
                }
                System.out.println("That is the same as");
                if (hr >= 12)
                    System.out.println((hr - 12) + ":" + min + "PM");
                else
                    System.out.println(hr + ":" + min + "AM");
                System.out.println("\nAgain? (y/n)");
                String op = keyboard.next();
                if (!op.equals("Y") || !op.equals("y")) {
                    again = false;
                    System.out.println("End of Program");
                }
            } catch (TimeFormatException e) {
                keyboard.nextLine();
                System.out.println(e.getMessage());
            } catch (InputMismatchException m) {
                keyboard.nextLine();
                System.out.println("That is not a valid time\n\nTry again:");
            }
        }
    }
}
