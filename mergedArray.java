import java.util.Arrays;
public class mergeArray {
public static void main(String[] args) {

    int[] first = {2, 4, 6, 8,};
    int[] second = {1, 3, 5, 7,};
    int[] merged = new int[first.length + second.length]; 
    
    for (int count = 0; count < first.length; count++) {
        merged[count] = first[count];
    }
    for (int count = 0; count < second.length; count++) {
        merged[first.length + count] = second[count];
    }
    Arrays.sort(merged);
        
        System.out.print(Arrays.toString(merged));
        
    }
}
