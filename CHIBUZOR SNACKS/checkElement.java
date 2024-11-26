public class checkElement {
public static void main(String... args) {
	int [] array = {20,10,25,60,45};
		int element = 45;
			boolean result = checkForElement(array, element);
				System.out.println("Element is present: " + result);

    }

   

public static boolean checkForElement(int[] array, int element){
	for (int count = 0; count < array.length; count++) {
		if (array[count] == element) { 
			return true;
    }
}
	
	return false;
   
   }
}
