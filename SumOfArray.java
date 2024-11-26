import java.util.Scanner;
public class SumOfArray {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println ("Enter the size of the array: ");
        int size = input.nextInt();
    
    int array[] = new int [size];
    int sum = 0;
    System.out.println("Enter the elements of the array: ");
    
    for (int count = 0; count < size; count++) {
        array[count] = input.nextInt();
}
    for (int count = 0; count < array.length; count++) {
        sum = sum + array[count];
     }
     System.out.println("You are clever! sum is = " + sum);
   }
} 