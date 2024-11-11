import java.util.Scanner;
public class Pattern {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();

    for (int counter = 1; counter <= number; counter++) {
        
        for (int space = 1; space <= number - counter; space++) {
            System.out.print(" ");
      	}  
    
        for (int count = 1; count <= counter; count++) {
            System.out.print("@");
            }  System.out.println();
     }  
  }

}