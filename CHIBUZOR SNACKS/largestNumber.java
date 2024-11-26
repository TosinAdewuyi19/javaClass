public class largestElement {
public static void main(String... args) {
	
	int[] array = {20, 35, 40, 35};
		int largest =  findLargestElement(array);
			System.out.println("The largest element in the array is: " + largest);


    }
    
    public static int findLargestElement(int[] array) {
		int largest =array [0];
			for (int count = 1; count < array.length; count++) {
				if (array[count] > largest) {
					largest = array[count]; 

}
	}
				return largest;
    
    }
}
