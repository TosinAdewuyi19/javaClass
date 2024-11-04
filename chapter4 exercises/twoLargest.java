import java.util.Scanner;

public class twoLargest {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

int largest = Integer.MIN_VALUE;
int  secondLargest = Integer.MIN_VALUE;
System.out.println("Enter 10 numbers: ");
  
    for (int integer = 0; integer < 10; integer++) {
        int number = input.nextInt();

        if (number > largest) {
            secondLargest = largest; 
            largest = number;
       }else if (number > secondLargest) {
            secondLargest = number;
}
	}
            System.out.println("The largest number is: " + largest);
            System.out.println("second largest number is: " + secondLargest);
}

		


 	}




