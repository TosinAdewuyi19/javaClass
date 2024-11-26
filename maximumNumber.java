public class maximumNumber {
public static void main(String[] args) {
    
    int[] numbers = {12, 33, 2, 5, 6, 3, 55}; 
    int maximum = numbers[0];
   
    for (int maxi = 1; maxi < numbers.length; maxi++) {
        if (numbers[maxi] > maximum) {
            maximum = numbers[maxi];
	}
    }
    System.out.println("The maximum number is:" + maximum);
    }
}
