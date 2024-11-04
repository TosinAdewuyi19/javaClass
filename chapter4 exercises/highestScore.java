import java.util.Scanner;
public class HighestScores {
public static void main(String[] aargs) {
    scanner input = new Scanner(System.in);
    System.out.print("Enter the number of students: ");
    int numberOfStudents = input.nextInt();
    String highestName = "";
    int highestScore = 0; 
    String seconHighestName = "";
    int secondHighestScore = 0;
    for (int number = 0; number < numberOfStudents; number++) {
        System.out.print("Enter student's name: ");
        String name = inputnextInt();
        System.out.print("Enter student's scores: ");
        int scores = input.nextInt();
        if (score > highestScore) {
            secondHighestName = hghesitName;
            secondHighestScore = highestScore;
            hghesitName = name;
            highestScore = score;
        }else if (score > secondHighestScore) {           
            secondHighestName = name;
            secondHighestScore = sore;
            
		}
	}


        System.out.println("Top two students:");
        System.out.println(highh
estName, + "score is",  highestScore);
        System.out.println(secondHighh
estName, + "score is",  secondHighestScore);
	}
}






