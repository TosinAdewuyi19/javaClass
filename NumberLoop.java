import java.util.Scanner; 
	public class NumberLoop {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in); 
	String response;
do {
	System.out.print("Enter first number ");

	int firstNumber = input.nextInt();

	System.out.print("Enter second number ");

	int secondNumber = input.nextInt();

	int sum = firstNumber + secondNumber;

	System.out.printf("Sum is %d%n", sum); 

	System.out.print("Performe operation again?: (yes/no) "); 
	input.nextLine();
	response = input.nextLine();


  }

while (response.equalsIgnoreCase("yes")); 




}

}