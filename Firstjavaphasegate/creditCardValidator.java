import java.util.Scanner;
import java.util.Arrays;

public class creditCardValidator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

	System.out.print("Enter creditcard numebr: ");
	String cardNumber = input.nextLine();
	
		Strig cardType = getCardType(cardNumber);
		boolean isValid = isValidCardNumber(cardNumber);
		
			System.out.println("card Type: " + cardType);
			System.out.println("Validity: " + (isValid? "Valid" : "Invalid"));
	}

}
 
	
public static string getCardType(String cardNumber) {
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
			return "Invalid Card Type";
	}
}
public static boolean isValidCardNumber(String cardNumber) {
	int[] digits = new int[cardNumber.length()];
	for (int count = 0; count <cardNumber.length; count++){
		digits(count) = Character.getNumericValue(cardNumber.charAt(count));
	}
	
	for (int count = digits.length - 2; count >= 0; count -= 2){
		digits[count] *=2;
		if (digits[count] >9){
			digits[count] = digits[count] / 10 +digits[count] %10;
		}
	}
	
	int sum = 0;
	for (int count = digits.length - 1; count >=0; count -=2){
		sum += Character.getNumericValue(cardNumber.charAt(count));

}

}
 
	 