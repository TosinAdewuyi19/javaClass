import java.util.Scanner;
import java.util.ArrayList;
public class studentGrade {



public static void main(String[] args) {
Scanner input = new Scanner(System.in);


int numberofstudents = 1;
int numberofsubjects = 1;
double average = 0;
double totalscore = 0;
  



		
int[][] array = new int[numberofstudents][numberofsubjects];

			System.out.println("How many students do you have?: ");
			numberofstudents = input.nextInt();
			System.out.println("How many subjects do they offer?: ");
			numberofsubjects = input.nextInt();
			System.out.println("Saving >>>>>>>>>>>>>>>");
			System.out.println("Saved successfully");
														


	for (int count = 0; count < numberofstudents; count++) {
		for (int counter = 0; counter < numberofsubjects; counter++) {
			System.out.println("Entering score for student " + count +" >>> ");
			System.out.print("Enter score for subject " + counter + ": ");
			int score = input.nextInt();
			System.out.println("Saved successfully");
	
			for (int x = 0; x < score; x++);
				totalscore += score; 
				average = totalscore / numberofsubjects;  
}
			System.out.println("==================================================");
			System.out.println("STUDENT: %.2f%n, %.2f%n, %n%d\t count \t total \taverage \tPOS");
			System.out.println("==================================================");	
				
}
    }
} 








	
 