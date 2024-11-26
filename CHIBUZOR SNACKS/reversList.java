import java.util.Arrays;

public class ReverseList {
    public static void reverseList(int[] lst) {
        int start = 0;
        int end = lst.length - 1;
        while (start < end) {
            int temp = lst[start];
            lst[start] = lst[end];
            lst[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] myList = {1, 2, 3, 4, 5};
        reverseList(myList);
        System.out.println(Arrays.toString(myList));
    }
}
