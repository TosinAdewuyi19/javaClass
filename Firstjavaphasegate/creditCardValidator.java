import java.util.Scanner;
public class creditCardValidator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
	System.out.print("Enter creditcard numebr: ");
	String cardNumber = input.nextLine();
		int[] digits = new int[cardNumber.length];
		for (int count = 0; count <cardNumber.length; count++){
			digits(count) = Character.getCardValue(cardNumber.charAt());
		
	 String cardType = getCardType(cardNumber);
        System.out.println("Card Number: " + cardNumber + ", Type: " + cardType);
    }
 
	
public static String getCardType(String cardNumber) {
	int length = cardNumber.length();
	if (length > 13 && length < 16){
		   System.out.print("Invalid card");
	}
	else if (cardNumber.startsWith("4") && (length == 13 || length == 16)) {
			System.out.println("VisaCards");		
	}
	else if (cardNumber.startsWith("5") && (length == 13 || length == 16)) {
			System.out.println("MasterCards");
	}
	else if (cardNumber.startsWith("37") && (length == 13 || length == 16)) {
			System.out.println("American Expresss Cards");
	}
	else if (cardNumber.startsWith("6") && (length == 13 || length == 16)) {
			System.out.println("Discover cards");
	}else {
			System.out.println("Invalid card");
	}
}
}
 
 
	 