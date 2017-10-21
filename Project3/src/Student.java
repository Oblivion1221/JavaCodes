public class Student extends Person {
    private int testScore1;
    private int testScore2;
    private double avgScore;
    private char grade;

    public Student() {
        super();
        testScore1 = 0;
        testScore2 = 0;
        avgScore = 0.0;
        grade = 'E';
    }

    public Student(String newName, int newId,
                   int newTestScore1, int newTestScore2,
                   double newAvgScore, char newGrade) {
        super(newName, newId);
        testScore1 = newTestScore1;
        testScore2 = newTestScore2;
        avgScore=  newAvgScore;
        grade = newGrade;
    }

    public int getTestScore1() {
        return testScore1;
    }

    public int getTestScore2() {
        return testScore2;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public char getGrade() {
        return grade;
    }

    public void setTestScore1(int testScore1) {
        this.testScore1 = testScore1;
    }

    public void setTestScore2(int testScore2) {
        this.testScore2 = testScore2;
    }

    public void setAvgScore() {
        avgScore = (testScore1 + testScore2) / 2.0;
    }

    public void setGrade() {
        if (avgScore >= 90) { grade = 'A'; }
        else if (avgScore >= 80 && avgScore < 90) { grade = 'B'; }
        else if (avgScore >= 70 && avgScore < 80) { grade = 'C'; }
        else if (avgScore >= 60 && avgScore < 70) { grade = 'D'; }
        else if (avgScore < 60) { grade = 'E'; }
    }

    public String toString() {
        return (super.toString() +
                "\ntest score 1: " + testScore1 +
                "\ntest score 2: " + testScore2 +
                "\naverage score: " + avgScore +
                "\ngrade: " + grade + "\n");
    }

    public boolean equals(Object otherObject) {
        if (otherObject.getClass() == null) {
            return false;
        } else if (this.getClass() != otherObject.getClass()) {
            return false;
        } else {
            Student otherStudent = (Student) otherObject;
            return (super.equals(otherStudent)
                    && testScore1 == otherStudent.testScore1
                    && testScore2 == otherStudent.testScore2
                    && avgScore == otherStudent.avgScore
                    && grade == otherStudent.grade);
        }
    }
}
