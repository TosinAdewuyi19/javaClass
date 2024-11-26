public class minmum {
public static void main(String[] args) {
     
    int[] numbers = {12, 43, -12, 34, 88, 10};
    int minimum =numbers [0];

    for (int mini = 1; mini < numbers.length; mini++) {
        if (numbers[mini] < minimum) {
            minimum = numbers[mini];
    }
}
    System.out.print("The minimum number is:" + minimum);
    
    }
}
