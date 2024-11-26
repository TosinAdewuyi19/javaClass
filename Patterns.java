public class Patterns{
	public static void main(String [] args){


	System.out.println("Pattern A");
	for(int i = 1; i <= 7; i++){
		for(int number = 1; number < i; number++){
		System.out.print("*");
		}
		System.out.println();
	}


	System.out.println("Pattern B");
	for(int i = 7; i >= 1; i--){
		for(int number = 1; number <= i; number++){	
		System.out.print("*");
		}
		System.out.println();
	}

		

	System.out.println("Pattern C");
	for (int i = 7; i >= 1; i--){
		for (int index = 1; index <= 7 - i; index++) {
			System.out.print(" ");
		}
		for (int number = 1; number <= i ; number++){
			System.out.print("*");
		}
		System.out.println();
		}
	System.out.println("Pattern D");
	for (int i = 7; i >= 1; i--){
		for (int index = 7; index <= 7 - i; index++) {
			System.out.print( " " );
	}
	for (int number = 1; number <= i; number++){
	System.out.print("*");
	}
	System.out.println();
	}
}
	

}
