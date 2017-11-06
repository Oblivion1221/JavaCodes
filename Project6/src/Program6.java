// Yaoxian Yang
// COSC 211 Programming Assignment #6
// Fall 2017: 12:00 ~ 13:50 Tue, Thu
// Write random numbers to a binary file and read them back
// Then count the frequency of occurrence of each number in the file

import java.io.*;
import java.util.Random;

public class Program6 {
    public static void main(String[] args) {
        Random r = new Random();
        final int FALSE = -9999;
        // Write the random numbers to the file
        try {
            ObjectOutputStream outputStream =
                    new ObjectOutputStream(
                            new FileOutputStream("outputP6.dat"));
            for (int i = 0; i < 20; i++) {
                int tmp = r.nextInt(50) + 1;
                outputStream.writeInt(tmp);
                // System.out.println(tmp);
            }
            outputStream.close();
            System.out.println(
                    "Writing the random numbers to the file.. Done\n\n");
        } catch (IOException e) {
            System.out.println("Problem with file output.");
        }
        // Read the numbers back
        try {
            ObjectInputStream inputStream =
                    new ObjectInputStream(
                            new FileInputStream("outputP6.dat"));
            int[] input = new int[20];
            for (int i = 0; i < input.length; i++) {
                input[i] = inputStream.readInt();
                // System.out.println(input[i]);
            }
            inputStream.close();
            for (int i = 0; i < input.length; i++) {
                int cnt = 1;
                if (input[i] != FALSE) {
                    for (int j = i + 1; j < input.length; j++) {
                        if (input[i] == input[j]) {
                            cnt++;
                            input[j] = FALSE;
                        }
                    }
                    System.out.println(input[i] +
                            " appears " + cnt + " times in the file.\n");
                }

            }
        } catch (IOException e) {
            System.out.println("Problem with file input.");
        }
    }
}

/* Output:

Writing the random numbers to the file.. Done


23 appears 1 times in the file.

50 appears 1 times in the file.

38 appears 1 times in the file.

32 appears 1 times in the file.

22 appears 1 times in the file.

16 appears 1 times in the file.

49 appears 1 times in the file.

1 appears 1 times in the file.

13 appears 1 times in the file.

27 appears 1 times in the file.

19 appears 1 times in the file.

17 appears 1 times in the file.

25 appears 1 times in the file.

46 appears 1 times in the file.

33 appears 1 times in the file.

2 appears 1 times in the file.

8 appears 1 times in the file.

20 appears 1 times in the file.

42 appears 1 times in the file.

41 appears 1 times in the file.

*/