import java.util.Scanner;
public class SumOfEvenNumbers {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int firstNumber = 0;
    int secondNumber = 0;
    while (true) {
        System.out.print("Enter the first number: ");
        firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        secondNumber = input.nextInt();
        
        if (secondNumber > firstNumber) {
        break;
        }else {
            System.out.print("The second number must be greater than the first number. Please try again.");
	}
  }    
        int sum = 0;
         for(int i = firstNumber; i <= secondNumber; i++) {
            if (i % 2 ==0) {
                sum +=i;
}
	}
    System.out.printf("The sum of all even number is: " + sum);
	}


}
