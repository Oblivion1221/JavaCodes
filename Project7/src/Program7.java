// Yaoxian Yang
// COSC 211 Programming Assignment #7
// Fall 2017: 12:00 ~ 13:50 Tue, Thu
// A method that counts the frequency of
// occurrence of a digit in an int number

public class Program7 {
    public static void main(String[] args) {
        System.out.println(frequencyCount(1342457, 4));
        System.out.println(frequencyCount(1342457, 9));
    }

    public static int frequencyCount(int n, int d) {
        if (n == 0 && n != d) {
            return 0;
        } else if (n % 10 == d) {
            return 1 + frequencyCount(n / 10, d);
        } else {
            return frequencyCount(n / 10, d);
        }
    }
}

// Output:
// 2
// 0
//