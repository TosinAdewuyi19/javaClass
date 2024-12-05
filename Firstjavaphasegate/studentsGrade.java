import java.util.Scanner;
import java.util.ArrayList;


public class studentsGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many students do you have?: ");
        int numberOfStudents = input.nextInt();

        System.out.print("How many subjects do they offer?: ");
        int numberOfSubjects = input.nextInt();

        int[][] scores = new int[numberOfStudents][numberOfSubjects];
        double[] averages = new double[numberOfStudents];

        collectScores(input, numberOfStudents, numberOfSubjects, scores, averages);
        displaySummary(numberOfStudents, numberOfSubjects, scores, averages);
    }

    private static void collectScores(Scanner input, int numberOfStudents, int numberOfSubjects, int[][] scores, double[] averages) {
        for (int student = 0; student < numberOfStudents; student++) {
            double totalScore = 0;
            System.out.println("\nEntering scores for student " + (student + 1) + " >>> ");
            for (int subject = 0; subject < numberOfSubjects; subject++) {
                System.out.print("Enter score for subject " + (subject + 1) + ": ");
                int score = input.nextInt();
                scores[student][subject] = score;
                totalScore += score;
            }
            averages[student] = totalScore / numberOfSubjects;
        }
    }

    private static void displaySummary(int numberOfStudents, int numberOfSubjects, int[][] scores, double[] averages) {
        System.out.println("====================================================");
        System.out.print("STUDENT   ");
        for (int subject = 0; subject < numberOfSubjects; subject++) {
            System.out.print("SUB "  + (subject + 1) + "\t");
        }
        System.out.print("TOT\t");
        System.out.print("AVE\t");
        System.out.println("POS\t");
        System.out.println("=====================================================");

        for (int student = 0; student < numberOfStudents; student++) {
            int position = 1;
            for (int count = 0; count < numberOfStudents; count++) {
                if (averages[count] > averages[student]) {
                    position++;
                }
            }
            double totalScore = averages[student] * numberOfSubjects;
            System.out.printf("Student %-4d", (student + 1));
            for (int subject = 0; subject < numberOfSubjects; subject++) {
                System.out.printf("%-7d", scores[student][subject]);
            }
            System.out.printf("%-8.2f%-8.2f%-8d\n", totalScore, averages[student], position);
        }
        System.out.println("=====================================================");
		System.out.println("=====================================================");
    }
}
