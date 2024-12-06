/* pseudocode for credit card validator
1) Prompt the user to enter his\ her credit card number.
3) Collect and store user input.
2) Determine the card type based on the first digidts by 
3) Validate the card number by
   * Doubling every second digit from right to left.
   * Adding all the single digits and if the sum is a double number, sum the two digits
   * Add all digits in the odd places from right to left in the card number
   * sum the result from step 2 and 3
   * Check if the result from step 4 is divisible by 10.
   * Display appropriate message.*/   

import java.util.Scanner;
import java.util.Arrays;

public class creditCardValidator {


public static String getCardType(String cardNumber) {
	int length = cardNumber.length();

	if (cardNumber.startsWith("4") && (length == 13 || length == 16)) {
			return "VisaCards";		
	
	}else if (cardNumber.startsWith("5") && (length == 13 || length == 16)) {
			return "MasterCards";
	
	}else if (cardNumber.startsWith("37") && (length == 13 || length == 16)) {
			return "American Expresss Cards";
	
	}else if (cardNumber.startsWith("6") && (length == 13 || length == 16)) {
			return "Discover cards";
	}else {
			return "Invalid Card";
	}

    }


public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your credit card number: ");
        String cardNumber = scanner.nextLine();
	System.out.println(" ");
	

        String cardType = getCardType(cardNumber);
	int cardLength = cardNumber.length();

        int[] digits = new int[cardNumber.length()];
        for (int count = 0; count < cardNumber.length(); count++) {
            digits[count] = Character.getNumericValue(cardNumber.charAt(count));
        }

	int sum = 0;
        boolean alternate = false;
        for (int count = digits.length - 1; count >= 0; count--) {
            int counter = digits[count];
            if (alternate) {
                counter *= 2;
                if (counter > 9) {
                    counter = (counter % 10) + 1;
                }
            }
            sum += counter;
            alternate = !alternate;

	}

	  boolean isValid = (sum % 10 == 0);
	
	System.out.println("**********************************");
        System.out.println("**Card Type: " + cardType);
	System.out.println("**Card Number: " + cardNumber);
	System.out.println("**Credit Card Length: " + cardLength);
        System.out.println("**Validity: " + (isValid ? "Valid" : "Invalid"));
	System.out.print("**********************************");
    }	 
	  
}
 
	 