import java.util.Scanner;

public class BarChart {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number between 1 and 30 ");
	int firstNumber = input.nextInt();
	while (firstNumber < 1) {

		System.out.println("You have entered a number below 1. Please enter a number between 1 and 30");
	firstNumber = input.nextInt();
	
	}
	
	while (firstNumber > 30) {
		System.out.println("You have entered a number above 30. Please enter a number between 1 and 30");
	firstNumber = input.nextInt();
	}
	
	System.out.print("Enter second number  between 1 and 30 ");
	int secondNumber = input.nextInt();
	while (secondNumber < 1) {


	System.out.println("You have entered a number below 1. Please enter a number between 1 and 30");
	firstNumber = input.nextInt();
	}
	while (secondNumber > 30) {
		System.out.println("You have entered a number above 30. Please enter a number between 1 and 30");
	secondNumber = input.nextInt();
	}

System.out.print("Enter third number  between 1 and 30 ");
	int thirdNumber = input.nextInt();
while (thirdNumber < 1) {


System.out.println("You have entered a number below 1. Please enter a number between 1 and 30");
	thirdNumber = input.nextInt();
	}

while (thirdNumber > 30) {
		System.out.println("You have entered a number above 30. Please enter a number between 1 and 30");
	thirdNumber = input.nextInt();
	}
System.out.print("Enter fourth number  between 1 and 30 ");
	int fourthNumber = input.nextInt();
while (fourthNumber < 1) {



System.out.println("You have entered a number below 1. Please enter a number between 1 and 30");
	fourthNumber = input.nextInt();
	}
while (fourthNumber > 30) {
		System.out.println("You have entered a number above 30. Please enter a number between 1 and 30");
	fourthNumber = input.nextInt();
	}



System.out.print("Enter fifth number  between 1 and 30 ");
	int fifthNumber = input.nextInt();
while (fifthNumber < 1) {


System.out.println("You have entered a number below 1. Please enter a number between 1 and 30");
	fifthNumber = input.nextInt();
	}
while (fifthNumber > 30) {
		System.out.println("You have entered a number above 30. Please enter a number between 1 and 30");
	fifthNumber = input.nextInt();
	}


int counter = 0;
while (counter < 5) {
	if (counter == 0) {
		int secondCounter = 0;
		while (secondCounter < firstNumber) {
			System.out.print("*");
			secondCounter++;
		}
		System.out.println();
	} else if (counter == 1) {
		int secondCounter = 0;
		while (secondCounter < secondNumber) {
			System.out.print("*");
			secondCounter++;
		} 
		System.out.println();
	} else if (counter == 2) {
		int secondCounter = 0;
		while (secondCounter < thirdNumber) {
			System.out.print("*");
			secondCounter++;
		} 
		System.out.println();
	} else if (counter == 3) {
		int secondCounter = 0;
		while (secondCounter < fourthNumber) {
			System.out.print("*");
			secondCounter++;
		}
		System.out.println();
	} else if (counter == 4) {
		int secondCounter = 0;
		while (secondCounter < fifthNumber) {
			System.out.print("*");
			secondCounter++;
		}
		System.out.println();
	}
	counter++;


}





}
}


	