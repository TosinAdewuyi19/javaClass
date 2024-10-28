import java.util.Scanner;
public class vowelConsonant {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
System.out.print("Enter a letter: ");
	String letter = input.next();
if (letter.length() != 1 && Character.isLetter(letter.charAt(0))) {
	System.out.println("Error: please enter a single letter.");
	
}
if ("AEIOUaeiou".indexOf(letter) != -1) {
	System.out.print("Vowels");
}else {
	System.out.print("Consonant");
}
			


	}



}