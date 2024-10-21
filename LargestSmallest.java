import java.util.Scanner; 

	public class LargestSmallest {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
 int largest = Integer.MIN_VALUE;
	int smallest = Integer.MAX_VALUE;
String pick;
do {
	System.out.print("Enter first number: ");
int firstNumber = input.nextInt();
	if (firstNumber > largest) { 
largest= firstNumber;
} 
System.out.print("Enter second number: ");
int secondNumber = input.nextInt();
	if (secondNumber > smallest) {
secondNumber = smallest;
}
	
	System.out.print("Do you want to enter another number?  yes/no: "); 
pick = input.next();
}

	while (pick.equalsIgnoreCase("yes"));


	
 System.out.print("Smallest number: " + smallest );

	System.out.println(" Largest number: " + largest );
}

}