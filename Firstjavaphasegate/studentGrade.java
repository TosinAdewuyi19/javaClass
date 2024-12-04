import java.util.Scanner;
import java.util.ArrayList;
public class studentGrade {



public static void main(String[] args) {
Scanner input = new Scanner(System.in);

	 
		
		System.out.println("How many students do you have?: ");
			int numberofstudents = input.nextInt();
		System.out.println("How many subjects do they offer?: ");
			int numberofsubjects = input.nextInt();
		System.out.println("Saving >>>>>>>>>>>>>>>");
		System.out.println("Saved successfully");
			
			int[][] scores = new int[numberofstudents][numberofsubjects];
			double[] average = new double[numberofstudents]; 
														


		for (int count = 0; count < numberofstudents; count++) {
			double totalscore = 0;
			System.out.println("\nEntering score for student " + (count + 1) + " >>> ");
			for (int counter = 0; counter < numberofsubjects; counter++) {
				System.out.print("Enter score for subject " + (counter + 1) + ": ");
				int score = input.nextInt();
		
				scores[count][counter] = score;
				totalscore += score;
			}
					
				average[count] = totalscore / numberofsubjects;
		
		}		System.out.println("====================================================");
				System.out.print("STUDENT      "); 
				for (int subject = 0; subject < numberofstudents; subject++) {
					System.out.print("SUB "  + (subject + 1) + "\t");
}						
				System.out.print("TOT\t");
				System.out.print("AVE\t");
				System.out.println("POS\t");
				System.out.println("=====================================================");
				System.out.println("=====================================================");
				
		
    }
} 








	
 