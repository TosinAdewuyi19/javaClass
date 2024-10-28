import java.util.Scanner;
	public class fiveTimes {
	public static void main(String[] args) {

Scanner input = new Scanner(System.in);
	System.out.print("Enter the number: ");
int number = input.nextInt();

	int terms = 5;
for (int i = 0; i <= terms; i++){
	int result = number * i;
	System.out.println(number + " X " + i + " = " + result);
		}



	}



}	
