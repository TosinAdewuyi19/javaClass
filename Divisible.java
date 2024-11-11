import java.util.Scanner;
public class Divisible {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
    System.out.print("Enter the first number range: ");
    int firstRange = input.nextInt();
    System.out.print("Enter the second number range: ");
    int secondRange = input.nextInt();
    
    boolean found = false;
    
    for (int counter = firstRange; counter <= secondRange; counter++) {
        if (counter % 7 == 0 && counter % 13 == 0) {
            System.out.print("The fist number divisible by both 7 and 13 is: " + counter);
            found = true;
            break;
    }
}
    if (!found)
        System.out.print("No number divisible by both 7 and 13 found in the given range.");
    }
}