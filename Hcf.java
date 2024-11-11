import java.util.Scanner;
public class HCF {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Enter first numbers:");
            int number1 = input.nextInt();
        System.out.print("Enter second number: ");
            int number2 = input.nextInt();
            int hcf = 1; 
            for (int counter = 1; counter <= number1 && counter <= number2; counter++) {
                if (number1 % counter == 0 && number2 % counter == 0) {
			System.out.print(counter);
                hcf = counter;
    }

}       
	    System.out.print("The HCF of " + number1 + " and " + number2 + " is: " + hcf); 
	

	}



}
