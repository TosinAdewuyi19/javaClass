import java.util.Scanner;
public class floatingNumbers {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
System.out.print("Enter first floating number: ");
float firstNumber = input.nextFloat();
System.out.print("Enter second floating number: ");
float secondNumber = input.nextFloat();
if (firstNumber != secondNumber) {
	System.out.print("They are different");
}else {
	System.out.print("They are the same");
}




	}


}