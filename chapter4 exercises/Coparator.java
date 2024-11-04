import java.util.Scanner;
public class CommissionCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    double firstNumber = input.nextDouble();
    
    System.out.print("Enter the second number: ");
    double secondNumber = input.nextDouble();

if (firstNumber == secondNumber) {
    System.out.print("The first number is greater.");
}else {
    System.out.println("The second number is greater.");
    }
}

}
