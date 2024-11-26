public class runningSum {
public static void main(String[] args) {

	int [] array = {10,25,20,35};
	int [] runningSum = computeRunningSum(array);
	for (int number : runningSum) {
		System.out.print(number + " ");
			
	}

}

	public static int[] computeRunningsum(int[] arr) {
		int [] result = new int[arr.length];
		int sum = 0;
		for (int count = 0; count < arr.length; count++) {
			sum += arr[count];
			result[count] = sum;
		}
		
		return result;
    }
}