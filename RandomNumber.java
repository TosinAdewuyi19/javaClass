import java.util.Scanner;
import java.util.Random;
	public class RandomNumber {
	public static void main(String[] args) {

Random number = new Random();
int randomNumber = number.nextInt(102) + 1;
Scanner input = new Scanner(System.in);
int guess = 0;
while (guess != randomNumber) {
	
	System.out.print("Enter a number between 1 and 100: ");
	guess = input.nextInt();

if (guess > randomNumber) {
	System.out.print("Too high, try again.");
}else if (guess <randomNumber) {
	System.out.print("Too low, try again");
}

		}
	System.out.print("Correct! The number was " + randomNumber);


	}

}