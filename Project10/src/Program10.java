import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        LinkedList L = new LinkedList();

        int op = -1;
        while (op != 0) {
            System.out.println("Dynamically sort singly linked list:");
            System.out.println("0. Quit the program");
            System.out.println("1. Insert an integer and sort the list");
            System.out.println("2. Print the list");

            op = keyboard.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Enter the number you want to insert:");
                    int n = keyboard.nextInt();
                    L.insert(n);
                    break;
                case 2:
                    L.printList();
                    break;
                default:
                    if (op != 0)
                        System.out.println("Operation unavailable");
                    break;
            }
        }
    }
}
