public class AverageOfArray {
public static void main(String[] args) {
  
    int[] numbers = {12, 10, 11, 20};
    int sum = 0;

    for (int number : numbers) {
        sum +=number;
 }
    double average = (double) sum / numbers.lenght;
        System.out.print("The average is: " + average);
    }
  
}
    
     