import java.util.Scanner;
public class sumOfDigits {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
 
    System.out.print("Enter a positive integer: ");
    int integer = input.nextInt();

    int sum = 0;

    while (integer > 0) {
        int number = integer % 10;
        sum += number;
        integer /= 10;
		
}
    System.out.println("The sum of the integer is:" + sum);
	}
}