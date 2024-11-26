public class reverseElement {
public static void main(String[] args) {
    int[] digits = {11, 20, 15, 40, 10};
    for (int first = 0; first < digits.length; first++){
        System.out.print(digits[first]);
    }

    System.out.println("\nAfter reversal");
    for (int last = digits.length-1; last>=0; last--) {

        System.out.print(digits[last] +" ");
}

	}
    }