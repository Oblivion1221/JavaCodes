import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            students[i] = new Student();
            System.out.println("Enter name:");
            students[i].setName(keyboard.next());
            System.out.println("Enter id number:");
            students[i].setId(keyboard.nextInt());
            System.out.println("Enter Test#1 score:");
            students[i].setTestScore1(keyboard.nextInt());
            System.out.println("Enter Test#2 score:");
            students[i].setTestScore2(keyboard.nextInt());
            students[i].setAvgScore();
            students[i].setGrade();
        }

        // insertion sort
        for (int j = 1; j < students.length; j++) {
            Student key = students[j];
            int i = j - 1;
            while (i >= 0 && students[i].getAvgScore() >= key.getAvgScore()) {
                students[i + 1] = students[i];
                i--;
            }
            students[i + 1] = key;
        }

        for (Student s:students) {
            System.out.println(s.toString());
        }
    }
}

/* Output:
    Enter name:
    wr
    Enter id number:
    1
    Enter Test#1 score:
    99
    Enter Test#2 score:
    99
    Enter name:
    sss
    Enter id number:
    87
    Enter Test#1 score:
    87
    Enter Test#2 score:
    87
    Enter name:
    wer
    Enter id number:
    76
    Enter Test#1 score:
    76
    Enter Test#2 score:
    76
    Enter name:
    erh
    Enter id number:
    65
    Enter Test#1 score:
    65
    Enter Test#2 score:
    65
    Enter name:
    qwew
    Enter id number:
    53
    Enter Test#1 score:
    52
    Enter Test#2 score:
    53

    name: qwew
    id: 53
    test score 1: 52
    test score 2: 53
    average score: 52.5
    grade: E

    name: qwew
    id: 53
    test score 1: 52
    test score 2: 53
    average score: 52.5
    grade: E

    name: erh
    id: 65
    test score 1: 65
    test score 2: 65
    average score: 65.0
    grade: D

    name: wer
    id: 76
    test score 1: 76
    test score 2: 76
    average score: 76.0
    grade: C

    name: sss
    id: 87
    test score 1: 87
    test score 2: 87
    average score: 87.0
    grade: B

    name: wr
    id: 1
    test score 1: 99
    test score 2: 99
    average score: 99.0
    grade: A
*/
