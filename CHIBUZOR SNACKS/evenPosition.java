public class EvenPositions {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.print("Elements on odd positions:");
        printOddPositions(array);
    }

    public static void printOddPositions(int[] arr) {
        for (int number = 0; number < arr.length; number++) {
            if (number % 2 == 0) {
                System.out.print(arr[number]);
            }
        }
    }
}
