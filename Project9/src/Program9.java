import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        LinkedList L = new LinkedList();

        int op = -1;
        while (op != 0) {
            System.out.println("Available Operations: ");
            System.out.println("0.  Quit the program");
            System.out.println("1.  Insert a number at the beginning of a list");
            System.out.println("2.  Insert a number at the end of a list");
            System.out.println("3.  Display the length of the list");
            System.out.println("4.  Search the list for a specific number(for membership)");
            System.out.println("5.  Delete a node containing a specific number from the list");
            System.out.println("6.  Print the list");

            op = keyboard.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Enter the number to be added to the beginning:");
                    int tmp1 = keyboard.nextInt();
                    L.addToStart(tmp1);
                    break;
                case 2:
                    System.out.println("Enter the number to be added to the end:");
                    int tmp2 = keyboard.nextInt();
                    L.addToEnd(tmp2);
                    break;
                case 3:
                    L.printLength();
                    break;
                case 4:
                    System.out.println("Enter the number to be searched:");
                    int tmp3 = keyboard.nextInt();
                    if (L.contains(tmp3))
                        System.out.println(tmp3 + " exists in the linked list");
                    else
                        System.out.println(tmp3 + " does not exist in the linked list");
                    break;
                case 5:
                    System.out.println("Enter the number to be deleted:");
                    int tmp4 = keyboard.nextInt();
                    if (!L.contains(tmp4)) {
                        System.out.println(tmp4 + " does not exist in the linked list");
                        break;
                    }
                    L.delete(tmp4);
                    break;
                case 6:
                    L.printList();
                    break;
            }
        }
    }
}
